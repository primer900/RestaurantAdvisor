package com.myspring.app.model;

import java.sql.Date;

public class RestaurantOrder {

	private int Ono;
	private String CustEmail;
	private String OrderDineInFlag;
	private String OrderDeliveryFlag;
	private String OrderPickUpFlag;
	private Date OrderDate;
	private Date OrderPickUpDate;
	private Date OrderDeliveryDate;
	private Date OrderDineInReceivedDate;
	
	public RestaurantOrder() {
		this.OrderDineInFlag = new String("N");
		this.OrderDeliveryFlag = new String("N");
		this.OrderPickUpFlag = new String("N");
		this.OrderPickUpDate = null;
		this.OrderDeliveryDate = null;
		this.OrderDineInReceivedDate = null;
	}

	public String getOrderPickUpFlag() {
		return OrderPickUpFlag;
	}

	public void setOrderPickUpFlag(String orderPickUpFlag) {
		OrderPickUpFlag = orderPickUpFlag;
	}

	public String getOrderDeliveryFlag() {
		return OrderDeliveryFlag;
	}

	public void setOrderDeliveryFlag(String orderDeliveryFlag) {
		OrderDeliveryFlag = orderDeliveryFlag;
	}

	public String getOrderDineInFlag() {
		return OrderDineInFlag;
	}

	public void setOrderDineInFlag(String orderDineInFlag) {
		OrderDineInFlag = orderDineInFlag;
	}

	public String getCustEmail() {
		return CustEmail;
	}

	public void setCustEmail(String custEmail) {
		this.CustEmail = custEmail;
	}

	public int getOno() {
		return Ono;
	}

	public void setOno(int ono) {
		Ono = ono;
	}

	public Date getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}

	public Date getOrderPickUpDate() {
		return OrderPickUpDate;
	}

	public void setOrderPickUpDate(Date orderPickUpDate) {
		OrderPickUpDate = orderPickUpDate;
	}

	public Date getOrderDeliveryDate() {
		return OrderDeliveryDate;
	}

	public void setOrderDeliveryDate(Date orderDeliveryDate) {
		OrderDeliveryDate = orderDeliveryDate;
	}

	public Date getOrderDineInReceivedDate() {
		return OrderDineInReceivedDate;
	}

	public void setOrderDineInReceivedDate(Date orderDineInReceivedDate) {
		OrderDineInReceivedDate = orderDineInReceivedDate;
	}
	
	
}
