package com.myspring.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.myspring.app.model.MenuItem;
import com.myspring.app.model.Restaurant;
import com.myspring.app.util.ConnectionFactory;

public class menuItemDao {
	public menuItemDao() {
		
	}
	
	public List<MenuItem> selectMenuItems(int RestID) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		List<MenuItem> menuItems = new ArrayList<MenuItem>();
		
		try {
			menuItems = session.selectList("com.mapper.CustomerMapper.selectMenuItems", RestID);
		}
		finally {
			session.close();
		}
		return menuItems;
	}
}
