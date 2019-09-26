package com.sb.main.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;



@MappedSuperclass
public class BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name="created_on")
	private Timestamp createdOn;
	
	@Column(name="modified_on")
	private Timestamp modifiedOn;
	
	
	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}


	@PrePersist
	public void prePersist() {
		setCreatedOn(new Timestamp(new Date().getTime()));
		setModifiedOn(new Timestamp(new Date().getTime()));
	}
	
	@PreUpdate
    public void preUpdate() {
		setModifiedOn(new Timestamp(new Date().getTime()));
    }
}
