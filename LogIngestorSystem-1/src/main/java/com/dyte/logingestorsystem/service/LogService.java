package com.dyte.logingestorsystem.service;

import com.dyte.logingestorsystem.exception.LogException;
import com.dyte.logingestorsystem.model.Log;

public interface LogService {
	
	public Log insertLog(Log log) throws LogException;

}
