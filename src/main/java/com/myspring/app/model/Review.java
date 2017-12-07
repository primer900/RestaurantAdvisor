package com.myspring.app.model;

import java.sql.Date;

public class Review {
	private int ReviewID;
	//private String CustEmail;
	private int RestID;
	private String ReviewTitle;
	private String ReviewDescr;
	//private Date ReviewDate;
	private int Rating;
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	/*public Date getReviewDate() {
		return ReviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		ReviewDate = reviewDate;
	}*/
	public String getReviewDescr() {
		return ReviewDescr;
	}
	public void setReviewDescr(String reviewDescr) {
		ReviewDescr = reviewDescr;
	}
	public String getReviewTitle() {
		return ReviewTitle;
	}
	public void setReviewTitle(String reviewTitle) {
		ReviewTitle = reviewTitle;
	}
	public int getRestID() {
		return RestID;
	}
	public void setRestID(int restID) {
		RestID = restID;
	}
	/*public String getCustEmail() {
		return CustEmail;
	}
	public void setCustEmail(String custEmail) {
		CustEmail = custEmail;
	}*/
	public int getReviewID() {
		return ReviewID;
	}
	public void setReviewID(int reviewID) {
		ReviewID = reviewID;
	}
}
