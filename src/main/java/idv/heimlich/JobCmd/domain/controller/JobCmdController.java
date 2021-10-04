package idv.heimlich.JobCmd.domain.controller;

import idv.heimlich.JobCmd.domain.controller.job.cmd.JobCmd;

public class JobCmdController {
	
	public static void main(String[] args) {
		new JobCmd().doCmd();
	}

}
