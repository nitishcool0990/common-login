package com.sb.main.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sb_invoice database table.
 * 
 */
@Entity
@Table(name="sb_invoice")
@NamedQuery(name="SbInvoice.findAll", query="SELECT s FROM SbInvoice s")
public class SbInvoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="invoice_id")
	private int invoiceId;

	@Column(name="coupon_id")
	private String couponId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Lob
	@Column(name="is_display")
	private String isDisplay;

	@Column(name="sales_use_id")
	private String salesUseId;

	@Column(name="total_discount")
	private String totalDiscount;

	@Column(name="total_net_amount")
	private int totalNetAmount;

	@Column(name="total_sale_amount")
	private int totalSaleAmount;

	@Column(name="total_wholesale_amount")
	private int totalWholesaleAmount;

	@Column(name="user_id")
	private String userId;

	public SbInvoice() {
	}

	public int getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getCouponId() {
		return this.couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getIsDisplay() {
		return this.isDisplay;
	}

	public void setIsDisplay(String isDisplay) {
		this.isDisplay = isDisplay;
	}

	public String getSalesUseId() {
		return this.salesUseId;
	}

	public void setSalesUseId(String salesUseId) {
		this.salesUseId = salesUseId;
	}

	public String getTotalDiscount() {
		return this.totalDiscount;
	}

	public void setTotalDiscount(String totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public int getTotalNetAmount() {
		return this.totalNetAmount;
	}

	public void setTotalNetAmount(int totalNetAmount) {
		this.totalNetAmount = totalNetAmount;
	}

	public int getTotalSaleAmount() {
		return this.totalSaleAmount;
	}

	public void setTotalSaleAmount(int totalSaleAmount) {
		this.totalSaleAmount = totalSaleAmount;
	}

	public int getTotalWholesaleAmount() {
		return this.totalWholesaleAmount;
	}

	public void setTotalWholesaleAmount(int totalWholesaleAmount) {
		this.totalWholesaleAmount = totalWholesaleAmount;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}