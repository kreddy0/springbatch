package com.shi.springbatch.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private String customerPhone;
	
	private String addressType;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String city;
	
	private String stateCode;
	
	private Integer zipcode;
	
	private String zipplus4;
	

	
	private String addressType2;
	
	private String addressLine12;
	
	private String addressLine22;
	
	private String city2;
	
	private String stateCode2;
	
	private Integer zipcode2;
	
	private String zipplus42;
	
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Address(String customerPhone, String addressType, String addressLine1, String addressLine2, String city,
			String stateCode, Integer zipcode, String zipplus4, String addressType2, String addressLine12,
			String addressLine22, String city2, String stateCode2, Integer zipcode2, String zipplus42) {
		super();
		this.customerPhone = customerPhone;
		this.addressType = addressType;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.stateCode = stateCode;
		this.zipcode = zipcode;
		this.zipplus4 = zipplus4;
		this.addressType2 = addressType2;
		this.addressLine12 = addressLine12;
		this.addressLine22 = addressLine22;
		this.city2 = city2;
		this.stateCode2 = stateCode2;
		this.zipcode2 = zipcode2;
		this.zipplus42 = zipplus42;
	}



	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public String getZipplus4() {
		return zipplus4;
	}

	public void setZipplus4(String zipplus4) {
		this.zipplus4 = zipplus4;
	}

	public String getAddressType2() {
		return addressType2;
	}

	public void setAddressType2(String addressType2) {
		this.addressType2 = addressType2;
	}

	public String getAddressLine12() {
		return addressLine12;
	}

	public void setAddressLine12(String addressLine12) {
		this.addressLine12 = addressLine12;
	}

	public String getAddressLine22() {
		return addressLine22;
	}

	public void setAddressLine22(String addressLine22) {
		this.addressLine22 = addressLine22;
	}

	public String getCity2() {
		return city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	public String getStateCode2() {
		return stateCode2;
	}

	public void setStateCode2(String stateCode2) {
		this.stateCode2 = stateCode2;
	}

	public Integer getZipcode2() {
		return zipcode2;
	}

	public void setZipcode2(Integer zipcode2) {
		this.zipcode2 = zipcode2;
	}

	public String getZipplus42() {
		return zipplus42;
	}

	public void setZipplus42(String zipplus42) {
		this.zipplus42 = zipplus42;
	}



	@Override
	public String toString() {
		return "Address [customerPhone=" + customerPhone + ", addressType=" + addressType + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", stateCode=" + stateCode
				+ ", zipcode=" + zipcode + ", zipplus4=" + zipplus4 + ", addressType2=" + addressType2
				+ ", addressLine12=" + addressLine12 + ", addressLine22=" + addressLine22 + ", city2=" + city2
				+ ", stateCode2=" + stateCode2 + ", zipcode2=" + zipcode2 + ", zipplus42=" + zipplus42 + "]";
	}
	
	
}
