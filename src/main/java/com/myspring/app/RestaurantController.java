package com.myspring.app;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String restaurantList(Model model) {
		logger.info("Now in real RestaurantController file");
		return "restaurantlist";
	}
	
	
}
