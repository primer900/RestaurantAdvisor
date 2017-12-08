package com.myspring.app.service;

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
}
