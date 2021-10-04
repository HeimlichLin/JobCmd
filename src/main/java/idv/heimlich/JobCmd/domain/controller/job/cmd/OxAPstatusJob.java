package idv.heimlich.JobCmd.domain.controller.job.cmd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import idv.heimlich.JobCmd.common.exception.ApBusinessException;

/**
 * 執行狀態
 */
public class OxAPstatusJob extends AbstactJob implements Runnable {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(OxAPstatusJob.class);

	@Override
	public void myExecute() throws Exception {
		Thread commandThread = new Thread(this);
		LOGGER.info("Create Command Thread -> " + commandThread.getName());
		commandThread.start();
		commandThread.join();
	}
	
	@Override
	public void run() {
		final String log = "/PCLMS/log/cmd/" + transactionId + ".zip";
		final File consoleLog = new File("/PCLMS/log/cmd/" + transactionId + ".log");
		final File eorroLog = new File("/PCLMS/log/cmd/error-" + transactionId + ".log");
		final File fileZip = new File(log);

		try {
			final String cms = "sh oxPCLMS.sct status";
			LOGGER.info("Execute Commend ->" + cms);
			final Runtime runtime = Runtime.getRuntime();
			final Process process = runtime.exec(cms);
			final BufferedReader stdoutReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			final BufferedReader stderrReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));

			consoleLog.createNewFile();
			eorroLog.createNewFile();
			fileZip.createNewFile();

			String line;
			List<String> stds = new ArrayList<String>();
			while ((line = stdoutReader.readLine()) != null) {
				stds.add(line);
			}
			FileUtils.writeLines(consoleLog, "UTF-8", stds);

			List<String> errorStds = new ArrayList<String>();
			while ((line = stderrReader.readLine()) != null) {
				errorStds.add(line);
			}
			FileUtils.writeLines(eorroLog, "UTF-8", errorStds);

			final ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(fileZip));
			final List<File> files = Arrays.asList(consoleLog, eorroLog);
			byte[] buf = new byte[1024];
			for (File f : files) {
				FileInputStream in = new FileInputStream(f);
				zipOut.putNextEntry(new ZipEntry(f.getName()));
				int len;
				while ((len = in.read(buf)) > 0) {
					zipOut.write(buf, 0, len);
				}
				zipOut.closeEntry();
				in.close();
			}
			zipOut.close();
			this.files = fileZip.getPath();
			this.message = log;
			final int exitValue = process.waitFor();
			LOGGER.info("Exit Value :" + exitValue);
			if (exitValue != 0) {
				throw new ApBusinessException("Exit Value ->" + exitValue);
			}
		} catch (Exception e) {
			LOGGER.error("error{}", e);
		} finally {
			if (!consoleLog.delete()) {
				LOGGER.info("delete file error:{}", consoleLog);
			}
			if (eorroLog.delete()) {
				LOGGER.info("delete file error:{}", eorroLog);
			}

		}

	}
	
}
