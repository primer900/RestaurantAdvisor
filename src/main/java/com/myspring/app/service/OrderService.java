package com.myspring.app.service;

import org.springframework.stereotype.Controller;

import com.myspring.app.dao.orderDao;
import com.myspring.app.model.Order;
import com.myspring.app.model.RestaurantOrder;

@Controller
public class OrderService {

	private orderDao od = new orderDao();
	
	public OrderService() {
		
	}
	
	public int InsertOrder(Order o, RestaurantOrder ro) {
		int i;
		i = od.InsertOrderAndRestaurantOrder(o, ro);
		
		return i;
	}
}
