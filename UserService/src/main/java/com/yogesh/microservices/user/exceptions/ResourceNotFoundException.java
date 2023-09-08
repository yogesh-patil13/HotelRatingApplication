package com.yogesh.microservices.user.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException{
       
	 String message;

	public ResourceNotFoundException(String message) {
		super();
		this.message = message;
	}
	
}
