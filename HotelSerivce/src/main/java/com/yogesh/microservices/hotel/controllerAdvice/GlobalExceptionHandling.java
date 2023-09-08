package com.yogesh.microservices.hotel.controllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.yogesh.microservices.hotel.exception.ResourceNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandling {
       
	@ExceptionHandler(ResourceNotFoundException.class)
	public String handleResourceNotFoundException(ResourceNotFoundException e)
	{
		return e.getErorMessage();
	}
}
