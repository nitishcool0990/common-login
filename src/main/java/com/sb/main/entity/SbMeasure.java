package com.sb.main.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sb_measure database table.
 * 
 */
@Entity
@Table(name="sb_measure")
@NamedQuery(name="SbMeasure.findAll", query="SELECT s FROM SbMeasure s")
public class SbMeasure implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="measure_id")
	private int measureId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Lob
	@Column(name="is_active")
	private String isActive;

	@Lob
	@Column(name="is_dispaly")
	private String isDispaly;

	@Column(name="measure_code")
	private String measureCode;

	private String unit;

	private int value;

	public SbMeasure() {
	}

	public int getMeasureId() {
		return this.measureId;
	}

	public void setMeasureId(int measureId) {
		this.measureId = measureId;
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

	public String getIsDispaly() {
		return this.isDispaly;
	}

	public void setIsDispaly(String isDispaly) {
		this.isDispaly = isDispaly;
	}

	public String getMeasureCode() {
		return this.measureCode;
	}

	public void setMeasureCode(String measureCode) {
		this.measureCode = measureCode;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}