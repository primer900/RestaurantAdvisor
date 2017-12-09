package com.myspring.app.model;

public class MenuItem {
	private int RestID;
	private String FoodName;
	private int Price;
	
	public MenuItem() {
		
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
	
	public int getPrice() {
		return Price;
	}
	
	public void setPrice(int price) {
		Price = price;
	}
}
