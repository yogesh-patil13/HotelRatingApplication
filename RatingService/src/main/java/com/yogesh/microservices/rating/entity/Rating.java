package com.yogesh.microservices.rating.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity 
public class Rating {
	
	@Id
	private String id;
	
	private String userId;
	
	private String hotelId;
	
	private int rating;
	
	private String feedback;

}
