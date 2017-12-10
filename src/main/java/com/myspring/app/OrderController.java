package com.myspring.app;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspring.app.model.MenuItem;
import com.myspring.app.model.Order;
import com.myspring.app.model.Restaurant;
import com.myspring.app.model.RestaurantOrder;
import com.myspring.app.service.MenuItemService;
import com.myspring.app.service.OrderService;
import com.myspring.app.service.RestaurantService;

@Controller
public class OrderController {

	private RestaurantService rs = new RestaurantService();
	private MenuItemService mis = new MenuItemService();
	private OrderService os = new OrderService();
	private static final Logger logger = LoggerFactory.getLogger(RestaurantController.class);
	private int RestIDRequiredForOrdering;
	
	@RequestMapping(value = "restaurantOrderList", method = RequestMethod.GET)
	public String restaurantList(@ModelAttribute("rlist") ArrayList<Restaurant> rlist, Model model) {
		rlist = new ArrayList<Restaurant>();
		rlist = rs.getResturants();
		model.addAttribute("rlist", rlist);
		return "restaurantOrderList";
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "MakeOrder", method = RequestMethod.POST)
	public String MakeOrder(@ModelAttribute("restaurant") Restaurant restaurant, @ModelAttribute("Order") Order order, Model model) {
		
		int result;
		RestaurantOrder ro = new RestaurantOrder();
		int Ono = NewOno();
		
		ro.setOno(Ono);
		LocalDate localDate = GetCurrentDate();
		ro.setOrderDate(new java.sql.Date(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth()));
		ro.setCustEmail(order.getCustEmail());
		
		if(order.getDeliveryType().equals("Dine In"))
			ro.setOrderDineInFlag("Y");
		else if(order.getDeliveryType().equals("Deliver"))
			ro.setOrderDeliveryFlag("Y");
		else if(order.getDeliveryType().equals("Pick Up"))
			ro.setOrderPickUpFlag("Y");
		
		order.setOno(Ono);
		order.setRestID(RestIDRequiredForOrdering);
		
		result = os.InsertOrder(order, ro);
		
		result = 1;
		if (result == 0) {
			JOptionPane.showMessageDialog(null, "Error adding customer information!", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		model.addAttribute("restaurant", new Restaurant());
		return "mainpage";
	}
	
	@RequestMapping(value = "restaurantMenuOrder", method = RequestMethod.GET)
	public String restaurantMenuOrder(
			@RequestParam("restID") int restID,
			@ModelAttribute("Restaurant") Restaurant r,
			@ModelAttribute("MenuItems") ArrayList<MenuItem> menuItems,
			@ModelAttribute("Order") Order order,
			Model model) {
		
		RestIDRequiredForOrdering = restID;
		r = rs.getRestaurantByRestID(restID);
		logger.info("rname " + r.getRName());
		model.addAttribute("Restaurant", r);

		menuItems = new ArrayList<MenuItem>();
		menuItems = mis.GetMenuItems(restID);
		model.addAttribute("MenuItems", menuItems);
		

		order.setRestID(restID);
		model.addAttribute("Order", order);
		
		return "restaurantMenuOrder";
	}
	
	private LocalDate GetCurrentDate() {
		java.util.Date date = new java.util.Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate;
	}
	
	private int NewOno() {
		Random random = new Random();
		int n = random.nextInt(27000) + 3;
		return n;
	}
}
