package com.yogesh.microservices.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yogesh.microservices.user.entity.User;
import com.yogesh.microservices.user.service.UserService;

@RestController
public class UserController {
     
	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user)
	{
		return userService.createUser(user);
	}
	
	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable  String userId)
	{
		return userService.getUser(userId);
	}
	
	@GetMapping("/user")
	public List<User> getAllusers()
	{
		return userService.getAllUsers();
	}
}
