package idv.heimlich.JobCmd.domain.service;

import idv.heimlich.JobCmd.domain.code.GetNumberType;

public interface GetNumberService {
	
	/**
	 * 取號
	 */
	public String getCount(GetNumberType getNumberType, String... codes);

}
