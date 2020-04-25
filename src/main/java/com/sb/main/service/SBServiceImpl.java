package com.sb.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pojo.UserItemDetails;
import com.sb.main.dao.SBInvoiceDetailDao;
import com.sb.main.dao.SbUserDetailDao;
import com.sb.main.entity.SbUser;

@Service(value = "sbService")
public class SBServiceImpl implements SBService {
	
	/*
	 * @Autowired private SBInvoiceDetailDao dao;
	 * 
	 * @Autowired private SbUserDetailDao userDetailsDao;
	 * 
	 * 
	 * 
	 * @Override public String createInvoice(UserItemDetails userItemDetails) {
	 * String userMsg =""; boolean flag =true; // TODO Auto-generated method stub
	 * List<SbUser> userDetails =
	 * userDetailsDao.getUserByWhatsappNumber(userItemDetails.getWhatsappNumber());
	 * if(userDetails.isEmpty() || userDetails.size() ==0) { //create user
	 * System.out.
	 * println("User not exist in system. Going to create user! This will only call from admin/sales"
	 * ); } //all table entries
	 * 
	 * if(flag) {
	 * 
	 * } return userMsg; }
	 */

}
