package com.sb.main.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.sb.main.entity.SbInvoice;
import com.sb.main.repository.SBInvoiceDetailRepo;
import com.sb.main.repository.SBInvoiceRepo;


public class SBInvoiceDetailDaoImpl implements SBInvoiceDetailDao{
	
	@Autowired
	private SBInvoiceDetailRepo sbInvoiceDetailRepo ;
	
	@Autowired
	private SBInvoiceRepo sInvoiceRepo ;

	@Override
	public SbInvoice getInvoiceById(int id) {
		
		return null;
	}

	
}
