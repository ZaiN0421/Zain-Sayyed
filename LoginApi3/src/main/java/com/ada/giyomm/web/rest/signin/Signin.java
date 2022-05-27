package com.ada.giyomm.web.rest.signin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.domain.Example;

@Entity
public class Signin {

	public static Example getEmail;

	@Id
	@Column(nullable = false, length = 50)
	private String firstName;
	
	@Column(nullable = false, length = 50)
	private String lastName;
	
	@Column(nullable = false, length = 40)
	private String email;
	
	@Column(nullable = false, unique = true, length = 20)
	private int phoneNo;
	
	@Column(nullable = false, length = 20)
	private String password;
	
	@Column(nullable = false, length = 20)
	private String confirmPassword;
	
	private String message;
	public Signin() {
		
	}
	
	

	public Signin(String firstName, String lastName, String email, int phoneNo, String password,
			String confirmPassword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.message= message;
	}

	// getters and setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		return "Signup [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}



	public String getMessage() {
		return message;
	}



	
	
	
	//to string
	
}
