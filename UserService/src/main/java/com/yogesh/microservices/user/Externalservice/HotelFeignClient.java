package com.yogesh.microservices.user.Externalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.yogesh.microservices.user.entity.Hotel;

@FeignClient("HOTELSERVICE")
public interface HotelFeignClient {
    
	@GetMapping("/hotel/{ratingId}")
	Hotel getHotel(@PathVariable String ratingId);
}
