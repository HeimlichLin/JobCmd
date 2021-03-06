package idv.heimlich.JobCmd.domain.bean.impl;

public class MailquePo {
	
//	public static MapConverter<MailquePo> CONVERTER = new MapConverter<MailquePo>() {
//
//		@Override
//		public MailquePo convert(DataObject dataObject) {
//			final MailquePo vo = new MailquePo();
//			vo.setPgmId(dataObject.getString("PGM_ID"));
//			vo.setCreateDate(dataObject.getString("CREATE_DATE"));
//			vo.setSubject(dataObject.getString("SUBJECT"));
//			vo.setMailTo(dataObject.getString("MAIL_TO"));
//			vo.setMailCc(dataObject.getString("MAIL_CC"));
//			vo.setMailBcc(dataObject.getString("MAIL_BCC"));
//			vo.setMailFrom(dataObject.getString("MAIL_FROM"));
//			vo.setMessage(dataObject.getString("MESSAGE"));
//			vo.setRemarks(dataObject.getString("REMARKS"));
//			vo.setMailId(dataObject.getString("MAIL_ID"));
//			vo.setStatus(dataObject.getString("STATUS"));
//			vo.setSendDate(dataObject.getString("SEND_DATE"));
//			vo.setFilePath(dataObject.getString("FILE_PATH"));
//			return vo;
//		}
//
//		@Override
//		public DataObject toDataObject(MailquePo po) {
//			DataObject dataObject = new DataObject();
//			dataObject.setValue(MailquePo.COLUMNS.PGM_ID.name(), po.getPgmId());
//			dataObject.setValue(MailquePo.COLUMNS.CREATE_DATE.name(), po.getCreateDate());
//			dataObject.setValue(MailquePo.COLUMNS.SUBJECT.name(), po.getSubject());
//			dataObject.setValue(MailquePo.COLUMNS.MAIL_TO.name(), po.getMailTo());
//			dataObject.setValue(MailquePo.COLUMNS.MAIL_CC.name(), po.getMailCc());
//			dataObject.setValue(MailquePo.COLUMNS.MAIL_BCC.name(), po.getMailBcc());
//			dataObject.setValue(MailquePo.COLUMNS.MAIL_FROM.name(), po.getMailFrom());
//			dataObject.setValue(MailquePo.COLUMNS.MESSAGE.name(), po.getMessage());
//			dataObject.setValue(MailquePo.COLUMNS.REMARKS.name(), po.getRemarks());
//			dataObject.setValue(MailquePo.COLUMNS.MAIL_ID.name(), po.getMailId());
//			dataObject.setValue(MailquePo.COLUMNS.STATUS.name(), po.getStatus());
//			dataObject.setValue(MailquePo.COLUMNS.SEND_DATE.name(), po.getSendDate());
//			dataObject.setValue(MailquePo.COLUMNS.FILE_PATH.name(), po.getFilePath());
//			return dataObject;
//		}
//	};

	public enum COLUMNS {
		PGM_ID("????????????", false), //
		CREATE_DATE("????????????", false), //
		SUBJECT("????????????", false), //
		MAIL_TO("?????????,?????????????????????", false), //
		MAIL_CC("??????", false), //
		MAIL_BCC("????????????", false), //
		MAIL_FROM("?????????", false), //
		MESSAGE("????????????", false), //
		REMARKS("??????", false), //
		MAIL_ID("??????ID", true), //
		STATUS("??????.W:??????,R:??????,C:??????", false), //
		SEND_DATE("????????????", false), //
		FILE_PATH("??????", false), //
		;//
		final String chineseName;
		final boolean isPK;

		private COLUMNS(String chineseName, boolean isPK) {
			this.chineseName = chineseName;
			this.isPK = isPK;
		}

		public String getChineseName() {
			return chineseName;
		}

		public boolean isPK() {
			return isPK;
		}
	}

	private String pgmId;// ????????????
	private String createDate;// ????????????
	private String subject;// ????????????
	private String mailTo;// ?????????,?????????????????????
	private String mailCc;// ??????
	private String mailBcc;// ????????????
	private String mailFrom;// ?????????
	private String message;// ????????????
	private String remarks;// ??????
	private String mailId;// ??????id
	private String status;// ??????.w:??????,r:??????,c:??????
	private String sendDate;// ????????????
	private String filePath;// ??????

	public String getPgmId() {
		return this.pgmId;
	}

	public void setPgmId(String value) {
		this.pgmId = value;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String value) {
		this.subject = value;
	}

	public String getMailTo() {
		return this.mailTo;
	}

	public void setMailTo(String value) {
		this.mailTo = value;
	}

	public String getMailCc() {
		return this.mailCc;
	}

	public void setMailCc(String value) {
		this.mailCc = value;
	}

	public String getMailBcc() {
		return this.mailBcc;
	}

	public void setMailBcc(String value) {
		this.mailBcc = value;
	}

	public String getMailFrom() {
		return this.mailFrom;
	}

	public void setMailFrom(String value) {
		this.mailFrom = value;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String value) {
		this.message = value;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String value) {
		this.remarks = value;
	}

	public String getMailId() {
		return this.mailId;
	}

	public void setMailId(String value) {
		this.mailId = value;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String value) {
		this.status = value;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String value) {
		this.filePath = value;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

}
