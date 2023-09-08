package com.yogesh.microservices.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yogesh.microservices.rating.entity.Rating;
import com.yogesh.microservices.rating.service.RatingService;



@RestController
public class RatingController {
    
	
	@Autowired
	private RatingService ratingService;
	
	//create
	@PostMapping("/rating")
	public Rating createRating(@RequestBody Rating rating)
	{
		return ratingService.createRating(rating);
	}
	
	//getAll rating
	@GetMapping("/rating")
	public List<Rating> getAllRating()
	{
		return ratingService.getAllRating();
	}
	
	
	//get Rating by userId
	
	@GetMapping("/rating/user/{userId}")
	public List<Rating> getRatingByUser(@PathVariable String userId)
	{
		return ratingService.getRatingByUser(userId);
	}
	
	//get rating by hotelId
	@GetMapping("/rating/hotel/{hotelId}")
	public List<Rating> getRatingByHotel(@PathVariable String hotelId)
	{
		return ratingService.getRatingByhotel(hotelId);
	}
}
