package com.sb.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBController {

	@CrossOrigin
	@RequestMapping(value = "/SBService/Welcome", method = RequestMethod.GET)
	public ResponseEntity<Object> getTnCPolicy() throws Exception {
		return new ResponseEntity<>("Welcome page!!!!!", HttpStatus.OK);
	}
	
}
