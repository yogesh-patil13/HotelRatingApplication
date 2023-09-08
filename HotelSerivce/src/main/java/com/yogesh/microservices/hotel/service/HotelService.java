package com.yogesh.microservices.hotel.service;

import java.util.List;

import com.yogesh.microservices.hotel.entity.Hotel;

public interface HotelService {
    
	//create
	public Hotel createHotel(Hotel hotel);
	
	//getAll
	public List<Hotel> getAllHotels();
	
	
	//get single
	
	public Hotel getHotel(String id);
}
