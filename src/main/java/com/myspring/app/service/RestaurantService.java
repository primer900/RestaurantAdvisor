package com.myspring.app.service;

import java.util.ArrayList;
import java.util.List;

import com.myspring.app.dao.restaurantDao;
import com.myspring.app.model.Restaurant;

public class RestaurantService {

	private restaurantDao rd = new restaurantDao();
	public RestaurantService() {
		
	}
	
	public ArrayList<Restaurant> getResturants() {
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurants = rd.getRestaurants();
	
		
		return (ArrayList<Restaurant>) restaurants;
	}
	
	public Restaurant getRestaurantByName(String Name) {
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurants = rd.getRestaurants();
		
		for(Restaurant r : restaurants) 
			if(r.getRName().equals(Name))
				return r;

		return null;
	}
	
	public Restaurant getRestaurantDetails(String RName) {
		List<Restaurant> restaurant = rd.searchForRestaurant(RName);
		
		if(restaurant.get(0).getRName().equals(RName))
			return restaurant.get(0);
		
		return null;
	}
	
	public Restaurant getRestaurantByRestID(int RestID) {
		List<Restaurant> restaurant = rd.getRestaurants();
		
		for(Restaurant r : restaurant)
			if(r.getRestID() == RestID)
				return r;
		
		return new Restaurant();
	}
	
}
