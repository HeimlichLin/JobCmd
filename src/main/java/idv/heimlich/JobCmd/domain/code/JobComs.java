package idv.heimlich.JobCmd.domain.code;

import idv.heimlich.JobCmd.domain.controller.job.cmd.AbstactJob;
import idv.heimlich.JobCmd.domain.controller.job.cmd.KillL4Job;
import idv.heimlich.JobCmd.domain.controller.job.cmd.OxAPstatusJob;

public enum JobComs {
	
	oxAPstatus(OxAPstatusJob.class), // 檢視狀態
	killL4(KillL4Job.class), // 刪除 L4 PRO
	;
	
	final Class<? extends AbstactJob> jobClass;

	private JobComs(Class<? extends AbstactJob> jobClass) {
		this.jobClass = jobClass;
	}
	
	public Class<? extends AbstactJob> getJobClass() {
		return jobClass;
	}
}
