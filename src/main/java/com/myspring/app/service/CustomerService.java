package com.myspring.app.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.myspring.app.dao.customerDao;
import com.myspring.app.model.Customer;

@Controller
public class CustomerService {
	
	public CustomerService() {
		
	}

	public int insertCustomer(Customer c) {
		customerDao cd = new customerDao();
		int i;
		i = cd.insertCustomer(c);
		return i;
		
	}
	
	public boolean checkCustomer(String email, String password) {
		List<Customer> cust = new ArrayList<Customer>();
		boolean flag = false;
		customerDao cd = new customerDao();
		cust = cd.checkCustomer(email);
		for(Customer c : cust) {
			if (c.getEmail().equals(email) && c.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public Customer getCustomer(String email, String password) {
		List<Customer> cust = new ArrayList<Customer>();
		customerDao cd = new customerDao();
		cust = cd.checkCustomer(email);
		for(Customer c : cust) {
			if (c.getEmail().equals(email) && c.getPassword().equals(password)) {
				return c;
			}
		}
		
		return null;
	}
}
