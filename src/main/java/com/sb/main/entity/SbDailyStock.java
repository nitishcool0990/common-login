package com.sb.main.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sb_daily_stock database table.
 * 
 */
@Entity
@Table(name="sb_daily_stock")
@NamedQuery(name="SbDailyStock.findAll", query="SELECT s FROM SbDailyStock s")
public class SbDailyStock extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stock_id")
	private int stockId;

	@Lob
	@Column(name="is_active")
	private String isActive;

	@Lob
	@Column(name="is_sold")
	private String isSold;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="real_price")
	private String realPrice;

	@Column(name="sold_quantity")
	private String soldQuantity;

	@Column(name="total_quantity")
	private String totalQuantity;

	@Column(name="waste_quantity")
	private String wasteQuantity;

	@Column(name="wholesale_price")
	private String wholesalePrice;

	public SbDailyStock() {
	}

	public int getStockId() {
		return this.stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
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

	public String getRealPrice() {
		return this.realPrice;
	}

	public void setRealPrice(String realPrice) {
		this.realPrice = realPrice;
	}

	public String getSoldQuantity() {
		return this.soldQuantity;
	}

	public void setSoldQuantity(String soldQuantity) {
		this.soldQuantity = soldQuantity;
	}

	public String getTotalQuantity() {
		return this.totalQuantity;
	}

	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public String getWasteQuantity() {
		return this.wasteQuantity;
	}

	public void setWasteQuantity(String wasteQuantity) {
		this.wasteQuantity = wasteQuantity;
	}

	public String getWholesalePrice() {
		return this.wholesalePrice;
	}

	public void setWholesalePrice(String wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

}