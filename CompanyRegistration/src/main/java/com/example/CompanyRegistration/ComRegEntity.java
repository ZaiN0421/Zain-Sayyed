package com.example.CompanyRegistration;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EmailTemplate")
public class ComRegEntity {

	private String lastName;
	
	private String firstName;

	private String comName;
	
	private String comEmail;
	
	private String comRegNo;
	
	private String country;
	
	private String state;

	private String comAddress;

	private int phoneNo;
	
	private String password;
	
	private String confirmPassword;
	
	
	public ComRegEntity() {};
	
	public ComRegEntity(String lastName, String firstName, String comName, String comEmail, String comRegNo,
			String country, String state, String comAddress, int phoneNo, String password, String confirmPassword) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.comName = comName;
		this.comEmail = comEmail;
		this.comRegNo = comRegNo;
		this.country = country;
		this.state = state;
		this.comAddress = comAddress;
		this.phoneNo = phoneNo;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getComName() {
		return comName;
	}



	public void setComName(String comName) {
		this.comName = comName;
	}



	public String getComEmail() {
		return comEmail;
	}



	public void setComEmail(String comEmail) {
		this.comEmail = comEmail;
	}



	public String getComRegNo() {
		return comRegNo;
	}



	public void setComRegNo(String comRegNo) {
		this.comRegNo = comRegNo;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getComAddress() {
		return comAddress;
	}



	public void setComAddress(String comAddress) {
		this.comAddress = comAddress;
	}



	public int getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getConfirmPassword() {
		return confirmPassword;
	}



	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}



	@Override
	public String toString() {
		return "ComRegEntity [lastName=" + lastName + ", firstName=" + firstName + ", comName=" + comName
				+ ", comEmail=" + comEmail + ", comRegNo=" + comRegNo + ", country=" + country + ", state=" + state
				+ ", comAddress=" + comAddress + ", phoneNo=" + phoneNo + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}
	
	
	
	
	
	
}



