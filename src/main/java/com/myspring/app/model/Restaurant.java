package com.myspring.app.model;

import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	private int RestID;
	private String RName;
	private String phone;
	private String email;
	private String diningType;
	private String priceRange;
	private String deliveryFlag;
	private String streetNo;
	private String streetName;
	private String city;
	
	public int getRestID() {
		return RestID;
	}
	public void setRestID(int restID) {
		RestID = restID;
	}
	public String getRName() {
		return RName;
	}
	public void setRName(String rName) {
		RName = rName;
	}
	
	public Restaurant()	{
		super();
		RestID = 0;
		RName = "";
		email = "";
		phone = "";
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiningType() {
		return diningType;
	}
	public void setDiningType(String diningType) {
		this.diningType = diningType;
	}
	public String getPriceRange() {
		return priceRange;
	}
	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}
	public String getDeliveryFlag() {
		return deliveryFlag;
	}
	public void setDeliveryFlag(String deliveryFlag) {
		this.deliveryFlag = deliveryFlag;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
