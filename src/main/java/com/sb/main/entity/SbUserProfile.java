package com.sb.main.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sb_user_profile database table.
 * 
 */
@Entity
@Table(name="sb_user_profile")
@NamedQuery(name="SbUserProfile.findAll", query="SELECT s FROM SbUserProfile s")
public class SbUserProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_profile_id")
	private int userProfileId;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="default_add")
	private String defaultAdd;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="mobile_num")
	private int mobileNum;

	@Column(name="modified_on")
	private Timestamp modifiedOn;

	@Column(name="secondary_add")
	private String secondaryAdd;

	@Column(name="user_id")
	private int userId;

	public SbUserProfile() {
	}

	public int getUserProfileId() {
		return this.userProfileId;
	}

	public void setUserProfileId(int userProfileId) {
		this.userProfileId = userProfileId;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getDefaultAdd() {
		return this.defaultAdd;
	}

	public void setDefaultAdd(String defaultAdd) {
		this.defaultAdd = defaultAdd;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMobileNum() {
		return this.mobileNum;
	}

	public void setMobileNum(int mobileNum) {
		this.mobileNum = mobileNum;
	}

	public Timestamp getModifiedOn() {
		return this.modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getSecondaryAdd() {
		return this.secondaryAdd;
	}

	public void setSecondaryAdd(String secondaryAdd) {
		this.secondaryAdd = secondaryAdd;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}