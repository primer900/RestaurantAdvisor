package com.myspring.app;



import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspring.app.model.Restaurant;
import com.myspring.app.service.RestaurantService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class RestaurantController {
	

	private static final Logger logger = LoggerFactory.getLogger(RestaurantController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/restaurantList", method = RequestMethod.GET)
	public String restaurantList(@ModelAttribute("rlist") ArrayList<Restaurant> rlist, Model model) {
		logger.info("Now in real RestaurantController file");
		RestaurantService rs = new RestaurantService();
		rlist = new ArrayList<Restaurant>();
		rlist = rs.getResturantNames();
		model.addAttribute("rlist", rlist);
		return "restaurantlist";
	}
	
	
}