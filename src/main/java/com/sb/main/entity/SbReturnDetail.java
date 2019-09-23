package com.sb.main.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sb_return_detail database table.
 * 
 */
@Entity
@Table(name="sb_return_detail")
@NamedQuery(name="SbReturnDetail.findAll", query="SELECT s FROM SbReturnDetail s")
public class SbReturnDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="return_detail_id")
	private int returnDetailId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="invoice_id")
	private String invoiceId;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="item_name")
	private String itemName;

	@Column(name="purchase_measure_code")
	private String purchaseMeasureCode;

	@Column(name="refunded_amt")
	private int refundedAmt;

	@Column(name="return_measure_code")
	private String returnMeasureCode;

	public SbReturnDetail() {
	}

	public int getReturnDetailId() {
		return this.returnDetailId;
	}

	public void setReturnDetailId(int returnDetailId) {
		this.returnDetailId = returnDetailId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPurchaseMeasureCode() {
		return this.purchaseMeasureCode;
	}

	public void setPurchaseMeasureCode(String purchaseMeasureCode) {
		this.purchaseMeasureCode = purchaseMeasureCode;
	}

	public int getRefundedAmt() {
		return this.refundedAmt;
	}

	public void setRefundedAmt(int refundedAmt) {
		this.refundedAmt = refundedAmt;
	}

	public String getReturnMeasureCode() {
		return this.returnMeasureCode;
	}

	public void setReturnMeasureCode(String returnMeasureCode) {
		this.returnMeasureCode = returnMeasureCode;
	}

}