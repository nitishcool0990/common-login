package com.sb.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.main.entity.SbInvoice;

public interface SBInvoiceRepo extends JpaRepository<SbInvoice , Integer>{

}
