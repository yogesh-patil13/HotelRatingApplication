package com.yogesh.microservices.user.serviceImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.yogesh.microservices.user.Externalservice.HotelFeignClient;
import com.yogesh.microservices.user.Externalservice.RatingFeignClient;
import com.yogesh.microservices.user.entity.Hotel;
import com.yogesh.microservices.user.entity.Rating;
import com.yogesh.microservices.user.entity.User;
import com.yogesh.microservices.user.exceptions.ResourceNotFoundException;
import com.yogesh.microservices.user.repo.UserRepo;
import com.yogesh.microservices.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private RatingFeignClient ratingFeignClient;
	
	@Autowired
	private HotelFeignClient hotelFeignClient;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		String userId=UUID.randomUUID().toString();
		user.setUserId(userId);
		return userRepo.save(user);         
	}
    
	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		User user=userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User Not Present with given Id"));
		//Rating[] ratingArray=restTemplate.getForObject("http://RATINGSERVICE/rating/user/"+userId, Rating[].class);
		//List<Rating> ratings=Arrays.asList(ratingArray);
		
		/*List<Rating> ratingsWithHotel=ratings.stream().map(
				rating->{
		             //http://localhost:8083/hotel/ba441191-843c-416b-aca8-d46a70080f33
					ResponseEntity<Hotel> hot=restTemplate.getForEntity("http://HOTELSERVICE/hotel/"+rating.getHotelId(), Hotel.class);
					
					rating.setHotel(hot.getBody());
					return rating;
		}
	   ).collect(Collectors.toList());*/
		
		List<Rating> ratings=ratingFeignClient.getRatings(userId);
		
		List<Rating> ratingsWithHotel=ratings.stream().map(
				rating->{
		             //http://localhost:8083/hotel/ba441191-843c-416b-aca8-d46a70080f33
					Hotel  hotel=hotelFeignClient.getHotel("ba441191-843c-416b-aca8-d46a70080f33");
					
					rating.setHotel(hotel);
					return rating;
		}
	   ).collect(Collectors.toList());
		
		user.setRatings(ratingsWithHotel);
		return user;
	}

	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return  userRepo.findAll();
	}


}
