package idv.heimlich.JobCmd.domain.controller.job.cmd;

public abstract class AbstactJob {
	
	protected String message = "";
	protected String files = "";
	protected String transactionId = "";

	public final void execute() throws Exception {
		this.myExecute();
	}

	abstract public void myExecute() throws Exception;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}
	
}
