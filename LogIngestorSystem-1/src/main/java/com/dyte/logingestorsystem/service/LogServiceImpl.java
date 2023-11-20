package com.dyte.logingestorsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyte.logingestorsystem.exception.LogException;
import com.dyte.logingestorsystem.model.Log;
import com.dyte.logingestorsystem.repository.LogRepository;

@Service
public class LogServiceImpl implements LogService {
	
	@Autowired
	private LogRepository logRepository;

	@Override
	public Log insertLog(Log log) throws LogException {
		
		return logRepository.save(log);
		
	}

}
