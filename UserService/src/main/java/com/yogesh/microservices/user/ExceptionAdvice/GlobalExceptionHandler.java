package com.yogesh.microservices.user.ExceptionAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.yogesh.microservices.user.exceptions.ResourceNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler  {
    
	@ExceptionHandler(ResourceNotFoundException.class)
	public String handleResourceException(ResourceNotFoundException e)
	{
		return e.getMessage();
	}
}
