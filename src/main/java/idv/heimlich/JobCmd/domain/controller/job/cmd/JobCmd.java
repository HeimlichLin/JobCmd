package idv.heimlich.JobCmd.domain.controller.job.cmd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import idv.heimlich.JobCmd.domain.service.JobCmdService;
import idv.heimlich.JobCmd.domain.service.impl.JobCmdServiceImpl;

/**
 * 執行清檔案job
 */
public class JobCmd {
	
	private final static Logger LOG = LoggerFactory.getLogger(JobCmd.class);

	private final transient JobCmdService jmdService = JobCmdServiceImpl.get();

	public void doCmd() {
		LOG.debug("JobCmd rum start!");
		try {
			this.jmdService.cmd();
		} finally {
			LOG.debug("JobCmd rum end!");
		}

	}
	
}
