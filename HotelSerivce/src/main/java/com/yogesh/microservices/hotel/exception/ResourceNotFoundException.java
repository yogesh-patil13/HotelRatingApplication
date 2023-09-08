package com.yogesh.microservices.hotel.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
	
	String ErorMessage;

	public ResourceNotFoundException(String message) {
		super();
		this.ErorMessage = message;
	}
	
	
  
}
