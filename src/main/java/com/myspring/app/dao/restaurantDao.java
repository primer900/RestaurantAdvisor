package com.myspring.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.myspring.app.model.Restaurant;
import com.myspring.app.util.ConnectionFactory;

public class restaurantDao {

	public restaurantDao() {
		
	}
	
	public List<Restaurant> getRestaurants(){
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		
		try {
			restaurants = session.selectList("com.mapper.CustomerMapper.selectRestaurant");
		}
		finally {
			session.close();
		}
		return restaurants;
	}
	
	public List<Restaurant> searchForRestaurant(String restaurantName) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		List<Restaurant> restaurant = new ArrayList<Restaurant>();
		
		try {
			restaurant = session.selectList("com.mapper.CustomerMapper.getRestaurantDetails", restaurantName);
		}
		finally {
			session.close();
		}
		
		return restaurant;
	}
}