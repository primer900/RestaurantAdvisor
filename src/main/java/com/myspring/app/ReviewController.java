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

import com.myspring.app.model.Restaurant;
import com.myspring.app.model.Review;
import com.myspring.app.service.RestaurantService;
import com.myspring.app.service.ReviewService;

@Controller
public class ReviewController {

	private static final Logger logger = LoggerFactory.getLogger(ReviewController.class);
	private RestaurantService rs = new RestaurantService();
	private ReviewService reviewService = new ReviewService();
	
	@RequestMapping(value = "/review", method = RequestMethod.GET)
	public String newReview(@ModelAttribute("review") Review review, Model model) {
		logger.info("In newReview");
		Review r = new Review();
		model.addAttribute("review", r);

		
		return "newReview";
	}
	
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "InsertReview", method = RequestMethod.POST)
	public String insertReview(@ModelAttribute("review") Review review, Model model) {
		Random random = new Random();
		int n = random.nextInt(100) + 4;
		
		java.util.Date date = new java.util.Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		review.setReviewDate(new java.sql.Date(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth()));
		
		review.setReviewID(12000 + n);
		
		int result = reviewService.InsertReview(review);
		
		if (result == 0) {
			JOptionPane.showMessageDialog(null, "Error adding customer information!", "Error", JOptionPane.ERROR_MESSAGE);
		}
			model.addAttribute(new Restaurant());
			return "mainpage";
	}
}
