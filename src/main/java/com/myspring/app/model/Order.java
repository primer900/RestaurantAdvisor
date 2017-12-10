package com.myspring.app.model;

public class Order {
	private int RestID;
	private int Ono;
	private int Qty;
	private String FoodName;
	private String DeliveryType;
	private String CustEmail;
	
	public Order() {
		
	}


	public int getOno() {
		return Ono;
	}

	public void setOno(int ono) {
		Ono = ono;
	}

	public int getRestID() {
		return RestID;
	}

	public void setRestID(int restID) {
		RestID = restID;
	}

	public String getFoodName() {
		return FoodName;
	}

	public void setFoodName(String foodName) {
		FoodName = foodName;
	}


	public int getQty() {
		return Qty;
	}


	public void setQty(int qty) {
		Qty = qty;
	}


	public String getDeliveryType() {
		return DeliveryType;
	}


	public void setDeliveryType(String deliveryType) {
		DeliveryType = deliveryType;
	}


	public String getCustEmail() {
		return CustEmail;
	}


	public void setCustEmail(String custEmail) {
		CustEmail = custEmail;
	}
}
