package com.yogesh.microservices.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="hotels")
public class Hotel {
      
	@Id
	private String id;
	
	
	private String name;
	
	private String location;
	
	private String about;
	
}
