package com.myspring.app.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private String FName;
	private String LName;
	private String Email;
	private String StreetNo;
	private String Street;
	private String City;
	private String State;
	private String Zip;
	private String Phone;
	private String Password;
	
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getStreetNo() {
		return StreetNo;
	}
	public void setStreetNo(String streetNo) {
		StreetNo = streetNo;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	@Override
	public String toString() {
		return "Customer [FName=" + FName + ", LName=" + LName + ", Email=" + Email + ", StreetNo="
				+ StreetNo + ", Street=" + Street + ", City=" + City + ", State=" + State + ", Zip=" + Zip + ", Phone="
				+ Phone + ", Password=" + Password + "]";
	}
	
	public Customer(String firstName, String lastName, String email, String streetNo, String street, String city,
			String state, String zip, String phone, String password) {
		super();
		FName = firstName;
		LName = lastName;
		Email = email;
		StreetNo = streetNo;
		Street = street;
		City = city;
		State = state;
		Zip = zip;
		Phone = phone;
		Password = password;
	}

	public Customer() {
		super();
		FName = "";
		LName = "";
		Email = "";
		StreetNo = "";
		Street = "";
		City = "";
		State = "";
		Zip = "";
		Phone = "";
		Password = "";
	}	
	

}
