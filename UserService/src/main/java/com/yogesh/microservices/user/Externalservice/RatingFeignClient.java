package com.yogesh.microservices.user.Externalservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.yogesh.microservices.user.entity.Rating;



@FeignClient("RATINGSERVICE")
public interface RatingFeignClient {
   
	@GetMapping("/rating/user/{userId}")
	public List<Rating> getRatings(@PathVariable String userId);
}
