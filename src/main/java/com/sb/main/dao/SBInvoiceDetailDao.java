package com.sb.main.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sb.main.entity.SbInvoice;


public interface SBInvoiceDetailDao {

	
	public SbInvoice getInvoiceById(int id);
}
