package com.yogesh.microservices.rating.service;

import java.util.List;

import com.yogesh.microservices.rating.entity.Rating;

public interface RatingService {
     
	//create
	Rating createRating(Rating rating);
	
	//getAll ratings
	List<Rating> getAllRating();
	
	//get rating by userId
	List<Rating> getRatingByUser(String userId);
	
	//get rating by hotelId
	List<Rating> getRatingByhotel(String hotelId);
	
}
