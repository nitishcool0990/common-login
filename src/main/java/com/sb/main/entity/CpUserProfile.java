package com.sb.main.entity;

//Generated with g9.

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="cp_user_profile", indexes={@Index(name="cpUserProfileFirstName", columnList="first_name,last_name")})
public class CpUserProfile implements Serializable {

 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/**
  * The optimistic lock. Available via standard bean get/set operations.
  */
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id", unique=true, nullable=false, precision=10)
  private int userId;
 @Column(name="first_name", nullable=false, length=100)
 private String firstName;
 @Column(name="last_name", nullable=false, length=100)
 private String lastName;
 @Column(nullable=false)
 private Date dob;
 @Column(nullable=false, length=6)
 private String gender;
 @Column(nullable=false, length=15)
 private String mobile;
 @Column(name="primary_wrong_number", nullable=false, precision=3)
 private short primaryWrongNumber;
 @Column(name="alternate_number", length=15)
 private String alternateNumber;
 @Column(name="alternate_wrong_number", nullable=false, precision=3)
 private short alternateWrongNumber;
 @Column(name="isapproved_PAN", nullable=false, precision=3)
 private short isapprovedPan;
 @Column(name="preferred_number", length=1)
 private String preferredNumber;
 @Column(name="profile_pic", nullable=false, length=200)
 private String profilePic;
 @Column(name="date_of_birth", nullable=false)
 private Date dateOfBirth;
 @Column(name="call_from", nullable=false, length=10)
 private String callFrom;
 @Column(name="call_to", nullable=false, length=10)
 private String callTo;
 @Column(name="compliance_tag", nullable=false, length=9)
 private String complianceTag;
 @Column(name="last_tagged_date", nullable=false)
 private Timestamp lastTaggedDate;
 @Column(name="is_dnc", nullable=false, length=1)
 private String isDnc;
 @Column(name="ivr_status", precision=10)
 private int ivrStatus;
 @Column(precision=3)
 private short mobileCookiecheck;
 @Column(name="modified_on", nullable=false)
 private Timestamp modifiedOn;
 @Column(name="linux_modified_on", nullable=false, precision=10)
 private int linuxModifiedOn;

 /** Default constructor. */
 public CpUserProfile() {
     super();
 }

 /**
  * Access method for userId.
  *
  * @return the current value of userId
  */
 public int getUserId() {
     return userId;
 }

 /**
  * Setter method for userId.
  *
  * @param aUserId the new value for userId
  */
 public void setUserId(int aUserId) {
     userId = aUserId;
 }
 /**
  * Access method for firstName.
  *
  * @return the current value of firstName
  */
 public String getFirstName() {
     return firstName;
 }

 /**
  * Setter method for firstName.
  *
  * @param aFirstName the new value for firstName
  */
 public void setFirstName(String aFirstName) {
     firstName = aFirstName;
 }

 /**
  * Access method for lastName.
  *
  * @return the current value of lastName
  */
 public String getLastName() {
     return lastName;
 }

 /**
  * Setter method for lastName.
  *
  * @param aLastName the new value for lastName
  */
 public void setLastName(String aLastName) {
     lastName = aLastName;
 }

 /**
  * Access method for dob.
  *
  * @return the current value of dob
  */
 public Date getDob() {
     return dob;
 }

 /**
  * Setter method for dob.
  *
  * @param aDob the new value for dob
  */
 public void setDob(Date aDob) {
     dob = aDob;
 }

 /**
  * Access method for gender.
  *
  * @return the current value of gender
  */
 public String getGender() {
     return gender;
 }

 /**
  * Setter method for gender.
  *
  * @param aGender the new value for gender
  */
 public void setGender(String aGender) {
     gender = aGender;
 }

 /**
  * Access method for mobile.
  *
  * @return the current value of mobile
  */
 public String getMobile() {
     return mobile;
 }

 /**
  * Setter method for mobile.
  *
  * @param aMobile the new value for mobile
  */
 public void setMobile(String aMobile) {
     mobile = aMobile;
 }

 /**
  * Access method for primaryWrongNumber.
  *
  * @return the current value of primaryWrongNumber
  */
 public short getPrimaryWrongNumber() {
     return primaryWrongNumber;
 }

 /**
  * Setter method for primaryWrongNumber.
  *
  * @param aPrimaryWrongNumber the new value for primaryWrongNumber
  */
 public void setPrimaryWrongNumber(short aPrimaryWrongNumber) {
     primaryWrongNumber = aPrimaryWrongNumber;
 }

 /**
  * Access method for alternateNumber.
  *
  * @return the current value of alternateNumber
  */
 public String getAlternateNumber() {
     return alternateNumber;
 }

 /**
  * Setter method for alternateNumber.
  *
  * @param aAlternateNumber the new value for alternateNumber
  */
 public void setAlternateNumber(String aAlternateNumber) {
     alternateNumber = aAlternateNumber;
 }

 /**
  * Access method for alternateWrongNumber.
  *
  * @return the current value of alternateWrongNumber
  */
 public short getAlternateWrongNumber() {
     return alternateWrongNumber;
 }

 /**
  * Setter method for alternateWrongNumber.
  *
  * @param aAlternateWrongNumber the new value for alternateWrongNumber
  */
 public void setAlternateWrongNumber(short aAlternateWrongNumber) {
     alternateWrongNumber = aAlternateWrongNumber;
 }

 /**
  * Access method for isapprovedPan.
  *
  * @return the current value of isapprovedPan
  */
 public short getIsapprovedPan() {
     return isapprovedPan;
 }

 /**
  * Setter method for isapprovedPan.
  *
  * @param aIsapprovedPan the new value for isapprovedPan
  */
 public void setIsapprovedPan(short aIsapprovedPan) {
     isapprovedPan = aIsapprovedPan;
 }

 /**
  * Access method for preferredNumber.
  *
  * @return the current value of preferredNumber
  */
 public String getPreferredNumber() {
     return preferredNumber;
 }

 /**
  * Setter method for preferredNumber.
  *
  * @param aPreferredNumber the new value for preferredNumber
  */
 public void setPreferredNumber(String aPreferredNumber) {
     preferredNumber = aPreferredNumber;
 }

 /**
  * Access method for profilePic.
  *
  * @return the current value of profilePic
  */
 public String getProfilePic() {
     return profilePic;
 }

 /**
  * Setter method for profilePic.
  *
  * @param aProfilePic the new value for profilePic
  */
 public void setProfilePic(String aProfilePic) {
     profilePic = aProfilePic;
 }

 /**
  * Access method for dateOfBirth.
  *
  * @return the current value of dateOfBirth
  */
 public Date getDateOfBirth() {
     return dateOfBirth;
 }

 /**
  * Setter method for dateOfBirth.
  *
  * @param aDateOfBirth the new value for dateOfBirth
  */
 public void setDateOfBirth(Date aDateOfBirth) {
     dateOfBirth = aDateOfBirth;
 }

 /**
  * Access method for callFrom.
  *
  * @return the current value of callFrom
  */
 public String getCallFrom() {
     return callFrom;
 }

 /**
  * Setter method for callFrom.
  *
  * @param aCallFrom the new value for callFrom
  */
 public void setCallFrom(String aCallFrom) {
     callFrom = aCallFrom;
 }

 /**
  * Access method for callTo.
  *
  * @return the current value of callTo
  */
 public String getCallTo() {
     return callTo;
 }

 /**
  * Setter method for callTo.
  *
  * @param aCallTo the new value for callTo
  */
 public void setCallTo(String aCallTo) {
     callTo = aCallTo;
 }

 /**
  * Access method for complianceTag.
  *
  * @return the current value of complianceTag
  */
 public String getComplianceTag() {
     return complianceTag;
 }

 /**
  * Setter method for complianceTag.
  *
  * @param aComplianceTag the new value for complianceTag
  */
 public void setComplianceTag(String aComplianceTag) {
     complianceTag = aComplianceTag;
 }

 /**
  * Access method for lastTaggedDate.
  *
  * @return the current value of lastTaggedDate
  */
 public Timestamp getLastTaggedDate() {
     return lastTaggedDate;
 }

 /**
  * Setter method for lastTaggedDate.
  *
  * @param aLastTaggedDate the new value for lastTaggedDate
  */
 public void setLastTaggedDate(Timestamp aLastTaggedDate) {
     lastTaggedDate = aLastTaggedDate;
 }

 /**
  * Access method for isDnc.
  *
  * @return the current value of isDnc
  */
 public String getIsDnc() {
     return isDnc;
 }

 /**
  * Setter method for isDnc.
  *
  * @param aIsDnc the new value for isDnc
  */
 public void setIsDnc(String aIsDnc) {
     isDnc = aIsDnc;
 }

 /**
  * Access method for ivrStatus.
  *
  * @return the current value of ivrStatus
  */
 public int getIvrStatus() {
     return ivrStatus;
 }

 /**
  * Setter method for ivrStatus.
  *
  * @param aIvrStatus the new value for ivrStatus
  */
 public void setIvrStatus(int aIvrStatus) {
     ivrStatus = aIvrStatus;
 }

 /**
  * Access method for mobileCookiecheck.
  *
  * @return the current value of mobileCookiecheck
  */
 public short getMobileCookiecheck() {
     return mobileCookiecheck;
 }

 /**
  * Setter method for mobileCookiecheck.
  *
  * @param aMobileCookiecheck the new value for mobileCookiecheck
  */
 public void setMobileCookiecheck(short aMobileCookiecheck) {
     mobileCookiecheck = aMobileCookiecheck;
 }

 /**
  * Access method for modifiedOn.
  *
  * @return the current value of modifiedOn
  */
 public Timestamp getModifiedOn() {
     return modifiedOn;
 }

 /**
  * Setter method for modifiedOn.
  *
  * @param aModifiedOn the new value for modifiedOn
  */
 public void setModifiedOn(Timestamp aModifiedOn) {
     modifiedOn = aModifiedOn;
 }

 /**
  * Access method for linuxModifiedOn.
  *
  * @return the current value of linuxModifiedOn
  */
 public int getLinuxModifiedOn() {
     return linuxModifiedOn;
 }

 /**
  * Setter method for linuxModifiedOn.
  *
  * @param aLinuxModifiedOn the new value for linuxModifiedOn
  */
 public void setLinuxModifiedOn(int aLinuxModifiedOn) {
     linuxModifiedOn = aLinuxModifiedOn;
 }

}

