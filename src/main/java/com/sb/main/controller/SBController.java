package com.sb.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sb.main.dao.SBInvoiceDetailDao;
import com.sb.main.repository.SBDailyStockRepo;
import com.sb.main.service.SBService;

@RestController
public class SBController {
	
	@Autowired
	private SBService sbService;

	@CrossOrigin
	@RequestMapping(value = "/SBService/Welcome", method = RequestMethod.GET)
	public ResponseEntity<Object> getTnCPolicy() throws Exception {
		return new ResponseEntity<>("Welcome page!!!!!", HttpStatus.OK);
	}
	
}
