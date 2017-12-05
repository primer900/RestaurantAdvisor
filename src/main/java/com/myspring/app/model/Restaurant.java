package com.myspring.app.model;

import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	private int RestID;
	private String RName;
	private String phone;
	private String email;
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
}
