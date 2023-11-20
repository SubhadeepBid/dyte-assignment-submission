package com.dyte.logingestorsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dyte.logingestorsystem.model.Log;
import com.dyte.logingestorsystem.service.LogService;

@RestController
@RequestMapping("/log")
public class LogController {
	
	@Autowired
	private LogService logService;
	
	@PostMapping("/add")
	public ResponseEntity<Log> insertLogHandler(@RequestBody Log log) {
		
		Log savedLog = logService.insertLog(log);
		
		return new ResponseEntity<>(savedLog, HttpStatus.CREATED);
		
	}

}
