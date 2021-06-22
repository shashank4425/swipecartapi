package com.swipecartitem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="USER_TB")
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	 Long id;
	@Column(name="FIRSTNAME")
	 private String firstname;
	@Column(name="LASTNAME")
	 private String lastname;
	@Column(name="EMAIL_ID")
	 private String emailId;
	@Column(name="PASSWORD")
	 private String Password;
	@Column(name="CONFIRM_PASSWORD")
	 private String confirmPassword;
	@Column(name="MOB_NUMBER")
	 private String mobNumber;
	@Column(name="FIRST_LINE_ADDRESS")
	 private String firstLineAddress;
	@Column(name="LAST_LINE_ADDRESS")
	 private String lastLineAddress;
	@Column(name="OTP")
	 String otp;
		
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}
	public String getFirstLineAddress() {
		return firstLineAddress;
	}
	public void setFirstLineAddress(String firstLineAddress) {
		this.firstLineAddress = firstLineAddress;
	}
	public String getLastLineAddress() {
		return lastLineAddress;
	}
	public void setLastLineAddress(String lastLineAddress) {
		this.lastLineAddress = lastLineAddress;
	}
	
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailId=" + emailId
				+ ", Password=" + Password + ", confirmPassword=" + confirmPassword + ", mobNumber=" + mobNumber
				+ ", firstLineAddress=" + firstLineAddress + ", lastLineAddress=" + lastLineAddress + "]";
	}
	
}
