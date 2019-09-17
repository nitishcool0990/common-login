// Generated with g9.

package com.sb.main.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cp_user")
public class CpUser implements Serializable {

  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id", unique=true, nullable=false, precision=10)
    private int userId;
    @Column(name="user_name", nullable=false, length=100)
    private String userName;
    @Column(nullable=false, length=100)
    private String password;
    @Column(nullable=false, length=100)
    private String email;
    @Column(length=13)
    private String status;
    @Column(name="device_id", length=100)
    private String deviceId;
    @Column(name="referred_by", length=100)
    private String referredBy;
    @Column(name="activation_code", nullable=false, length=100)
    private String activationCode;
    @Column(name="is_admin", length=1)
    private String isAdmin;
    @Column(name="ip_address", nullable=false, length=255)
    private String ipAddress;
    @Column(name="last_login")
    private Timestamp lastLogin;
    @Column(name="added_on", nullable=false)
    private Timestamp addedOn;
    @Column(name="modified_on", nullable=false)
    private Timestamp modifiedOn;
    @Column(name="is_modify", nullable=false, length=1)
    private String isModify;
    @Column(name="linux_added_on", nullable=false, precision=10)
    private int linuxAddedOn;

    /** Default constructor. */
    public CpUser() {
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
     * Access method for userName.
     *
     * @return the current value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for userName.
     *
     * @param aUserName the new value for userName
     */
    public void setUserName(String aUserName) {
        userName = aUserName;
    }

    /**
     * Access method for password.
     *
     * @return the current value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for password.
     *
     * @param aPassword the new value for password
     */
    public void setPassword(String aPassword) {
        password = aPassword;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(String aStatus) {
        status = aStatus;
    }

    /**
     * Access method for deviceId.
     *
     * @return the current value of deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Setter method for deviceId.
     *
     * @param aDeviceId the new value for deviceId
     */
    public void setDeviceId(String aDeviceId) {
        deviceId = aDeviceId;
    }

    /**
     * Access method for referredBy.
     *
     * @return the current value of referredBy
     */
    public String getReferredBy() {
        return referredBy;
    }

    /**
     * Setter method for referredBy.
     *
     * @param aReferredBy the new value for referredBy
     */
    public void setReferredBy(String aReferredBy) {
        referredBy = aReferredBy;
    }

    /**
     * Access method for activationCode.
     *
     * @return the current value of activationCode
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * Setter method for activationCode.
     *
     * @param aActivationCode the new value for activationCode
     */
    public void setActivationCode(String aActivationCode) {
        activationCode = aActivationCode;
    }

    /**
     * Access method for isAdmin.
     *
     * @return the current value of isAdmin
     */
    public String getIsAdmin() {
        return isAdmin;
    }

    /**
     * Setter method for isAdmin.
     *
     * @param aIsAdmin the new value for isAdmin
     */
    public void setIsAdmin(String aIsAdmin) {
        isAdmin = aIsAdmin;
    }

    /**
     * Access method for ipAddress.
     *
     * @return the current value of ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Setter method for ipAddress.
     *
     * @param aIpAddress the new value for ipAddress
     */
    public void setIpAddress(String aIpAddress) {
        ipAddress = aIpAddress;
    }

    /**
     * Access method for lastLogin.
     *
     * @return the current value of lastLogin
     */
    public Timestamp getLastLogin() {
        return lastLogin;
    }

    /**
     * Setter method for lastLogin.
     *
     * @param aLastLogin the new value for lastLogin
     */
    public void setLastLogin(Timestamp aLastLogin) {
        lastLogin = aLastLogin;
    }

    /**
     * Access method for addedOn.
     *
     * @return the current value of addedOn
     */
    public Timestamp getAddedOn() {
        return addedOn;
    }

    /**
     * Setter method for addedOn.
     *
     * @param aAddedOn the new value for addedOn
     */
    public void setAddedOn(Timestamp aAddedOn) {
        addedOn = aAddedOn;
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
     * Access method for isModify.
     *
     * @return the current value of isModify
     */
    public String getIsModify() {
        return isModify;
    }

    /**
     * Setter method for isModify.
     *
     * @param aIsModify the new value for isModify
     */
    public void setIsModify(String aIsModify) {
        isModify = aIsModify;
    }

    /**
     * Access method for linuxAddedOn.
     *
     * @return the current value of linuxAddedOn
     */
    public int getLinuxAddedOn() {
        return linuxAddedOn;
    }

    /**
     * Setter method for linuxAddedOn.
     *
     * @param aLinuxAddedOn the new value for linuxAddedOn
     */
    public void setLinuxAddedOn(int aLinuxAddedOn) {
        linuxAddedOn = aLinuxAddedOn;
    }
   

}
