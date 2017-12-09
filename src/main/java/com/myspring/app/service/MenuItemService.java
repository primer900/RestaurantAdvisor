package com.myspring.app.service;

import java.util.ArrayList;
import java.util.List;

import com.myspring.app.dao.menuItemDao;
import com.myspring.app.model.MenuItem;

public class MenuItemService {
	private menuItemDao mid = new menuItemDao();
	
	public MenuItemService() {
		
	}
	
	public ArrayList<MenuItem> GetMenuItems(int RestID) {
		List<MenuItem> items = mid.selectMenuItems(RestID);
		return (ArrayList<MenuItem>) items;
	}
}
