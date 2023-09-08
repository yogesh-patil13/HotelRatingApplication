package com.yogesh.microservices.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yogesh.microservices.hotel.entity.Hotel;
import com.yogesh.microservices.hotel.service.HotelService;

@RestController
public class HotelController {
    
	@Autowired
	private HotelService hotelService;
	
	//create
	@PostMapping("/hotel")
	public Hotel createHotel(@RequestBody Hotel hotel)
	{
		return hotelService.createHotel(hotel);
	}
	
	
	//getAll
	@GetMapping("/hotel")
	public List<Hotel> getAllHotels()
	{
		return hotelService.getAllHotels();
	}
	
	//get
	@GetMapping("/hotel/{hotelId}")
	public  ResponseEntity<Hotel> getHotel(@PathVariable String hotelId)
	{
		Hotel hotel= hotelService.getHotel(hotelId);
		return new ResponseEntity<Hotel>(hotel,HttpStatus.FOUND);
		//return new ResponseEntity<String>("Ok",HttpStatus.FOUND);
		//return "Jay Sambhu narayan";
	}
	
}
