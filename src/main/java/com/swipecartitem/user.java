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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getMobnumber() {
		return mobnumber;
	}
	public void setMobnumber(String mobnumber) {
		this.mobnumber = mobnumber;
	}
	public String getFirstlineaddress() {
		return firstlineaddress;
	}
	public void setFirstlineaddress(String firstlineaddress) {
		this.firstlineaddress = firstlineaddress;
	}
	public String getLastlineaddress() {
		return lastlineaddress;
	}
	public void setLastlineaddress(String lastlineaddress) {
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
		return "user [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailid=" + emailid
				+ ", password=" + password + ", confirmpassword=" + confirmpassword + ", mobnumber=" + mobnumber
				+ ", firstlineaddress=" + firstlineaddress + ", lastlineaddress=" + lastlineaddress + ", otp=" + otp
				+ "]";
	}	
}
