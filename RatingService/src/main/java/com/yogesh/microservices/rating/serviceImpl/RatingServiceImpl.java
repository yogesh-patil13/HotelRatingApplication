package com.yogesh.microservices.rating.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogesh.microservices.rating.entity.Rating;
import com.yogesh.microservices.rating.repo.RatingRepo;
import com.yogesh.microservices.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
    
	@Autowired
	RatingRepo ratingRepo;
	
	@Override
	public Rating createRating(Rating rating) {
		// TODO Auto-generated method stub
		
		String ratingId=UUID.randomUUID().toString();
		rating.setId(ratingId);
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		// TODO Auto-generated method stub
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUser(String userId) {
		// TODO Auto-generated method stub
		return ratingRepo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByhotel(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepo.findByHotelId(hotelId);
	}
     
	
}
