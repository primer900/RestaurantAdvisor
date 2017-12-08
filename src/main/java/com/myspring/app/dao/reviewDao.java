package com.myspring.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.myspring.app.model.Review;

public class reviewDao {

	public reviewDao() {
		
	}
	
	public int InsertReview(Review review) {
		SqlSession session = com.myspring.app.util.ConnectionFactory.getSqlSessionFactory().openSession();
		int result;
		try {
			result = session.insert("com.mapper.CustomerMapper.insertReview", review);
			session.commit();
		} finally {
			session.close();
		}
		return result;
	}
}
