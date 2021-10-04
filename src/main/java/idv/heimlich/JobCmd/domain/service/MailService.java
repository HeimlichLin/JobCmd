package idv.heimlich.JobCmd.domain.service;

import idv.heimlich.JobCmd.domain.dto.impl.MailCreateDTO;

public interface MailService {
	
	String create(MailCreateDTO mailCreateDTO);

	void send();

}
