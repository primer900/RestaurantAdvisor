package com.myspring.app;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspring.app.model.MenuItem;
import com.myspring.app.model.Restaurant;
import com.myspring.app.service.MenuItemService;
import com.myspring.app.service.RestaurantService;

@Controller
public class OrderController {

	private RestaurantService rs = new RestaurantService();
	private MenuItemService mis = new MenuItemService();
	private static final Logger logger = LoggerFactory.getLogger(RestaurantController.class);
	
	@RequestMapping(value = "restaurantOrderList", method = RequestMethod.GET)
	public String restaurantList(@ModelAttribute("rlist") ArrayList<Restaurant> rlist, Model model) {
		rlist = new ArrayList<Restaurant>();
		rlist = rs.getResturants();
		model.addAttribute("rlist", rlist);
		return "restaurantOrderList";
	}
	
	@RequestMapping(value = "restaurantMenuOrder", method = RequestMethod.GET)
	public String restaurantMenuOrder(
			@RequestParam("restID") int restID,
			@ModelAttribute("Restaurant") Restaurant r,
			@ModelAttribute("MenuItems") ArrayList<MenuItem> menuItems,
			Model model) {
		
		r = rs.getRestaurantByRestID(restID);
		logger.info("rname " + r.getRName());
		model.addAttribute("Restaurant", r);

		menuItems = new ArrayList<MenuItem>();
		menuItems = mis.GetMenuItems(restID);
		model.addAttribute("MenuItems", menuItems);
		
		return "restaurantMenuOrder";
	}
}
