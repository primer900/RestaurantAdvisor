package com.myspring.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.myspring.app.model.Customer;
import com.myspring.app.model.Order;
import com.myspring.app.model.RestaurantOrder;

public class orderDao {

	public orderDao() {
		
	}
	
	public int InsertOrderAndRestaurantOrder(Order o, RestaurantOrder ro) {
		SqlSession session = com.myspring.app.util.ConnectionFactory.getSqlSessionFactory().openSession();
		int result;
		try {
			session.insert("com.mapper.CustomerMapper.InsertRestaurantOrder", ro);
			result = session.insert("com.mapper.CustomerMapper.InsertOrder", o);
			session.commit();
		} finally {
			session.close();
		}
		return result;
	}
}
