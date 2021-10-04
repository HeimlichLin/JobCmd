package idv.heimlich.JobCmd.domain.dao;

import java.util.List;

import idv.heimlich.JobCmd.common.dao.RowMap;
import idv.heimlich.JobCmd.domain.bean.impl.JobquePo;
import idv.heimlich.JobCmd.domain.code.JobqueStatus;

public interface JobqueDAO {

	/**
	 * 取得清單透過狀態
	 */
	public List<JobquePo> quertyByStatus(JobqueStatus... jobqueStatus);

	/**
	 * 更新狀態
	 */
	public void update(String tranactionId, RowMap rowMap);
	
}
