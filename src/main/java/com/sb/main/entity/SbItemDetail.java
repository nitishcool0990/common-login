package com.sb.main.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sb_item_details database table.
 * 
 */
@Entity
@Table(name="sb_item_details")
@NamedQuery(name="SbItemDetail.findAll", query="SELECT s FROM SbItemDetail s")
public class SbItemDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_details_id")
	private int itemDetailsId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Lob
	@Column(name="is_active")
	private String isActive;

	@Lob
	@Column(name="is_sold")
	private String isSold;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="item_measure_code")
	private String itemMeasureCode;

	@Column(name="item_price")
	private String itemPrice;

	@Column(name="item_retail_price")
	private String itemRetailPrice;

	@Column(name="modified_on")
	private Timestamp modifiedOn;

	public SbItemDetail() {
	}

	public int getItemDetailsId() {
		return this.itemDetailsId;
	}

	public void setItemDetailsId(int itemDetailsId) {
		this.itemDetailsId = itemDetailsId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsSold() {
		return this.isSold;
	}

	public void setIsSold(String isSold) {
		this.isSold = isSold;
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

	public String getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemRetailPrice() {
		return this.itemRetailPrice;
	}

	public void setItemRetailPrice(String itemRetailPrice) {
		this.itemRetailPrice = itemRetailPrice;
	}

	public Timestamp getModifiedOn() {
		return this.modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

}