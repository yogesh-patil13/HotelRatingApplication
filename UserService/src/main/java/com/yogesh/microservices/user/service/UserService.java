package com.yogesh.microservices.user.service;

import java.util.List;

import com.yogesh.microservices.user.entity.User;

public interface UserService {
     
	
	//create
	User createUser(User user);
	
	
	//get User
	User getUser(String userId);
	
	//getAllUser
	List<User> getAllUsers();
	
	
}
