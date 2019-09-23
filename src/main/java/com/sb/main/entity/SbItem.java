package com.sb.main.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sb_item database table.
 * 
 */
@Entity
@Table(name="sb_item")
@NamedQuery(name="SbItem.findAll", query="SELECT s FROM SbItem s")
public class SbItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_code")
	private int itemCode;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="image_link")
	private String imageLink;

	@Lob
	@Column(name="is_active")
	private String isActive;

	@Lob
	@Column(name="is_display")
	private String isDisplay;

	@Column(name="item_category")
	private String itemCategory;

	@Column(name="item_name")
	private String itemName;

	public SbItem() {
	}

	public int getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getImageLink() {
		return this.imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsDisplay() {
		return this.isDisplay;
	}

	public void setIsDisplay(String isDisplay) {
		this.isDisplay = isDisplay;
	}

	public String getItemCategory() {
		return this.itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}