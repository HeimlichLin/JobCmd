package idv.heimlich.JobCmd.domain.dao;

import java.util.List;

import idv.heimlich.JobCmd.common.code.MailqueStatus;
import idv.heimlich.JobCmd.domain.bean.impl.MailquePo;

public interface MailqueDAO {
	
	/**
	 * 取得待寄信信件資訊
	 */
	public List<MailquePo> queryMails();

	/**
	 * 更新信件狀態
	 */
	public void update(String id, MailqueStatus status);

}
