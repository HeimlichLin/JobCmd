package idv.heimlich.JobCmd.domain.controller.job.cmd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import idv.heimlich.JobCmd.common.exception.ApBusinessException;

/**
 * Kill L4
 */
public class KillL4Job extends AbstactJob implements Runnable {

	private final static Logger LOG = LoggerFactory.getLogger(KillL4Job.class);

	@Override
	public void run() {
		try {
			final String cms = "clprocL4.kill.sct";
			LOG.info("Execute Commend ->" + cms);
			final Runtime runtime = Runtime.getRuntime();
			final Process process = runtime.exec(cms);
			final int exitValue = process.waitFor();
			LOG.info("Exit Value :" + exitValue);
			if (exitValue != 0) {
				throw new ApBusinessException("Exit Value ->" + exitValue);
			}
		} catch (Exception e) {
			LOG.error("error{}", e);
		}
	}

	@Override
	public void myExecute() throws Exception {
		Thread commandThread = new Thread(this);
		LOG.info("Create Command Thread -> " + commandThread.getName());
		commandThread.start();
		commandThread.join();
	}

}
