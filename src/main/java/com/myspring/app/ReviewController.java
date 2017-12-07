package com.myspring.app;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspring.app.model.Restaurant;
import com.myspring.app.model.Review;
import com.myspring.app.service.RestaurantService;

@Controller
public class ReviewController {

	@RequestMapping(value = "/review", method = RequestMethod.GET)
	public String newReview(@ModelAttribute("Restaurant") ArrayList<Restaurant> rlist, Model model) {
		RestaurantService rs = new RestaurantService();
		rlist = new ArrayList<Restaurant>();
		rlist = rs.getResturants();
		model.addAttribute("rlist", rlist);
		
		return "restaurantToReview";
	}
	
	@RequestMapping(value = "NewReview", method = RequestMethod.GET)
	public String newReview(@ModelAttribute("Review") Review review,  Model model) {
		model.addAttribute(review);
		return "newReview";
	}
	
	@RequestMapping(value = "InsertReview", method = RequestMethod.POST)
	public String insertReview(@ModelAttribute("Review") Review review, Model model) {
		model.addAttribute(review);
		return "newReview";
	}
}
