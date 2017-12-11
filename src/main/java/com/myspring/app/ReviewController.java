package com.myspring.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.sql.Date;

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
import com.myspring.app.model.Review;
import com.myspring.app.service.RestaurantService;
import com.myspring.app.service.ReviewService;

@Controller
public class ReviewController {

	private static final Logger logger = LoggerFactory.getLogger(ReviewController.class);
	private RestaurantService rs = new RestaurantService();
	private ReviewService reviewService = new ReviewService();
	private int RestIDRequiredForReview;
	
	@RequestMapping(value = "/restaurantReviewList", method = RequestMethod.GET)
	public String newReview(@ModelAttribute("review") Review review,
			@ModelAttribute("rlist") ArrayList<Restaurant> rlist,
			Model model) {
		
		logger.info("In newReview");
		Review r = new Review();
		model.addAttribute("review", r);
		
		rlist = rs.getResturants();
		model.addAttribute("rlist", rlist);
		

		
		return "restaurantReviewList";
	}
	
	@RequestMapping(value = "restaurantReview", method = RequestMethod.GET)
	public String restaurantReview(
			@RequestParam("restID") int restID,
			@ModelAttribute("Restaurant") Restaurant r,
			@ModelAttribute("MenuItems") ArrayList<MenuItem> menuItems,
			@ModelAttribute("review") Review review,
			Model model) {
	
		RestIDRequiredForReview = restID;
		
		return "newReview";
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "InsertReview", method = RequestMethod.POST)
	public String insertReview(
			@ModelAttribute("review") Review review,
			Model model) {
		
		int n = ReviewID();
		
		LocalDate localDate = GetCurrentDate(); 
		
		review.setReviewDate(new java.sql.Date(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth()));
		
		review.setRestID(RestIDRequiredForReview);
		review.setReviewID(12000 + n);
		logger.info(review.getRestID() + ", " + review.getReviewID());
		
		int result = reviewService.InsertReview(review);
		
		if (result == 0) {
			JOptionPane.showMessageDialog(null, "Error adding customer information!", "Error", JOptionPane.ERROR_MESSAGE);
		}
			model.addAttribute(new Restaurant());
			return "mainpage";
	}
	
	
	private int ReviewID() {
		Random random = new Random();
		int n = random.nextInt(100) + 4;
		return n;
	}
	
	private LocalDate GetCurrentDate() {
		java.util.Date date = new java.util.Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate;
	}
}
