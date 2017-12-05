package com.myspring.app.dao;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.myspring.app.model.Customer;
import com.myspring.app.util.ConnectionFactory;

@Controller
public class customerDao {
	
	public customerDao() {
		
	}

	public List<Customer> checkCustomer(String email) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		List<Customer> c = new ArrayList<Customer>();
		try {
			c = session.selectList("com.mapper.CustomerMapper.selectCustomer",email);
		} finally {
			session.close();
		}
		return c;
	}
		
	public int insertCustomer(Customer c) {
		SqlSession session = com.myspring.app.util.ConnectionFactory.getSqlSessionFactory().openSession();
		int result;
		try {
			result = session.insert("com.mapper.CustomerMapper.insertCustomer",c);
			session.commit();
		} finally {
			session.close();
		}
		return result;		
	}
	
}
