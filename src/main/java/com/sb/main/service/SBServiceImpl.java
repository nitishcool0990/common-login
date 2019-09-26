package com.sb.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.main.dao.SBInvoiceDetailDao;

@Service(value = "sbService")
public class SBServiceImpl implements SBService {
	
	@Autowired
	private SBInvoiceDetailDao dao;
	
	public void checkdao() {
		System.out.println("I M here "+		dao.getInvoiceById(1));
	}

}
