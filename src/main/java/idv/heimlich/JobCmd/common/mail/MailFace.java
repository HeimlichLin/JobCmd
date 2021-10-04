package idv.heimlich.JobCmd.common.mail;

public interface MailFace {
	
	public String to();

	public String from();

	public String subject();

	public String msg();

	public String cc();

	public String[] files();

}
