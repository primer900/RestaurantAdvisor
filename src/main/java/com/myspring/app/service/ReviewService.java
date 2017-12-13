package com.myspring.app.service;

import java.util.ArrayList;
import java.util.List;

import com.myspring.app.dao.reviewDao;
import com.myspring.app.model.Review;

public class ReviewService {
	
	private reviewDao rd = new reviewDao();
	
	public ReviewService() {
		
	}
	
	public int InsertReview(Review review) {
		int result = rd.InsertReview(review);
		return result;
	}
	
	public List<Review> SelectReviewsByCustEmail(String CustEmail) {
		List<Review> reviews;
		reviews = rd.SelectReviewByCustEmail(CustEmail);
		
		return reviews;
	}
}
