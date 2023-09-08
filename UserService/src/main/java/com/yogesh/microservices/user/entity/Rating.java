package com.yogesh.microservices.user.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rating {
	private String id;
	
	private String userId;
	
	private String hotelId;
	
	private int rating;
	
	private String feedback;
	
	private Hotel hotel;
}
