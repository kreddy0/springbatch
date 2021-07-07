package com.shi.springbatch.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	//@NotNull
	//@Size(min=10,max=10,message="Phone number should be 10 digits")
	private String phone;
	
	private String lastName;
	private String firstName;
	private String title;
	private String email;
	private String designation;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String lastName, String firstName, String phone, String email, String title, String designation) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
		this.title = title;
		this.designation = designation;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Customer [phone=" + phone + ", lastName=" + lastName + ", firstName=" + firstName + ", title=" + title
				+ ", email=" + email + ", designation=" + designation + "]";
	}

		
	
	
}
