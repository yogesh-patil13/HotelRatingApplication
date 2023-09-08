package com.yogesh.microservices.rating.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogesh.microservices.rating.entity.Rating;

public interface RatingRepo extends JpaRepository<Rating, String> {
	
	List<Rating> findByUserId(String userID);
	List<Rating> findByHotelId(String hotelId);
 
}
