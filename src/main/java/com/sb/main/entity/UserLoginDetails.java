package com.sb.main.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sb_user database table.
 * 
 */
@Entity
@Table(name="sb_user")
@NamedQuery(name="SbUser.findAll", query="SELECT s FROM SbUser s")
public class UserLoginDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	@Column(name="client_name")
	private String clientName;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="email_id")
	private String emailId;

	@Lob
	@Column(name="is_active")
	private String isActive;

	@Column(name="is_admin")
	private byte isAdmin;

	@Column(name="last_login")
	private Timestamp lastLogin;

	@Column(name="modified_on")
	private Timestamp modifiedOn;
	
	@Column(name="password")
	private String password;

	private String reason;

	@Column(name="watsapp_num")
	private String watsappNum;

	public UserLoginDetails() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public byte getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(byte isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Timestamp getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Timestamp getModifiedOn() {
		return this.modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getWatsappNum() {
		return this.watsappNum;
	}

	public void setWatsappNum(String watsappNum) {
		this.watsappNum = watsappNum;
	}

}