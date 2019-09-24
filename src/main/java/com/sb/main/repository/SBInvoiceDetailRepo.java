package com.sb.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sb.main.entity.SbInvoiceDetail;

public interface SBInvoiceDetailRepo extends JpaRepository<SbInvoiceDetail , Integer> {

}
