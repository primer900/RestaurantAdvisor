package com.myspring.app.service;

import java.util.ArrayList;
import java.util.List;

import com.myspring.app.dao.restaurantDao;
import com.myspring.app.model.Restaurant;

public class RestaurantService {

	public RestaurantService() {
		
	}
	
	public ArrayList<Restaurant> getResturants() {
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurantDao rd = new restaurantDao();
		restaurants = rd.getRestaurants();
	
		
		return (ArrayList<Restaurant>) restaurants;
	}
	
}
