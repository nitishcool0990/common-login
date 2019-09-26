package com.sb.main.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sb_invoice_detail database table.
 * 
 */
@Entity
@Table(name="sb_invoice_detail")
@NamedQuery(name="SbInvoiceDetail.findAll", query="SELECT s FROM SbInvoiceDetail s")
public class SbInvoiceDetail extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="invoice_detail_id")
	private int invoiceDetailId;

	private String discount;

	@Column(name="invoice_id")
	private String invoiceId;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="item_measure_code")
	private String itemMeasureCode;

	@Column(name="item_name")
	private String itemName;

	@Column(name="item_sale_price")
	private int itemSalePrice;

	@Column(name="item_wholesale_price")
	private int itemWholesalePrice;

	public SbInvoiceDetail() {
	}

	public int getInvoiceDetailId() {
		return this.invoiceDetailId;
	}

	public void setInvoiceDetailId(int invoiceDetailId) {
		this.invoiceDetailId = invoiceDetailId;
	}


	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
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

	public String getItemMeasureCode() {
		return this.itemMeasureCode;
	}

	public void setItemMeasureCode(String itemMeasureCode) {
		this.itemMeasureCode = itemMeasureCode;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemSalePrice() {
		return this.itemSalePrice;
	}

	public void setItemSalePrice(int itemSalePrice) {
		this.itemSalePrice = itemSalePrice;
	}

	public int getItemWholesalePrice() {
		return this.itemWholesalePrice;
	}

	public void setItemWholesalePrice(int itemWholesalePrice) {
		this.itemWholesalePrice = itemWholesalePrice;
	}

}