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
	 private String emailid;
	@Column(name="PASSWORD")
	 private String password;
	@Column(name="CONFIRM_PASSWORD")
	 private String confirmpassword;
	@Column(name="MOB_NUMBER")
	 private String mobnumber;
	@Column(name="FIRST_LINE_ADDRESS")
	 private String firstlineaddress;
	@Column(name="LAST_LINE_ADDRESS")
	 private String lastlineaddress;
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
		return emailid;
	}
	public void setEmailId(String emailId) {
		this.emailid = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String Password) {
		this.password = Password;
	}
	public String getConfirmPassword() {
		return confirmpassword;
	}
	public void setConfirmPassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getMobNumber() {
		return mobnumber;
	}
	public void setMobNumber(String mobnumber) {
		this.mobnumber = mobnumber;
	}
	public String getFirstLineAddress() {
		return firstlineaddress;
	}
	public void setFirstLineAddress(String firstLineAddress) {
		this.firstlineaddress = firstlineaddress;
	}
	public String getLastLineAddress() {
		return lastlineaddress;
	}
	public void setLastLineAddress(String lastlineaddress) {
		this.lastlineaddress = lastlineaddress;
	}
	
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailId=" + emailid
				+ ", Password=" + password + ", confirmPassword=" + confirmpassword + ", mobNumber=" + mobnumber
				+ ", firstLineAddress=" + firstlineaddress + ", lastLineAddress=" + lastlineaddress + "]";
	}
	
}
