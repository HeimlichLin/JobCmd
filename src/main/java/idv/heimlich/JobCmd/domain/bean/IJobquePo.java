package idv.heimlich.JobCmd.domain.bean;

//Job隊伍
public interface IJobquePo {

	// get交易序號
	public String getTranactionId();

	// set交易序號
	public void setTranactionId(String tranactionId);

	// get產生程式
	public String getJobId();

	// set產生程式
	public void setJobId(String jobId);

	// get建立日期
	public String getCreateTime();

	// set建立日期
	public void setCreateTime(String createTime);

	// get寄件時間
	public String getExecuteTime();

	// set寄件時間
	public void setExecuteTime(String executeTime);

	// get訊息
	public String getMessage();

	// set訊息
	public void setMessage(String message);

	// get狀態(W:等待執行 E:異常 S:成功)
	public String getStauts();

	// set狀態(W:等待執行 E:異常 S:成功)
	public void setStauts(String stauts);

}
