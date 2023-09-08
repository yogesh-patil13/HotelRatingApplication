package com.yogesh.microservices.hotel.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogesh.microservices.hotel.entity.Hotel;
import com.yogesh.microservices.hotel.exception.ResourceNotFoundException;
import com.yogesh.microservices.hotel.repo.HotelRepo;
import com.yogesh.microservices.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
    
	@Autowired
	HotelRepo hotelRepo;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		String hotelId=UUID.randomUUID().toString();
		hotel.setId(hotelId);
		Hotel savedHotel=hotelRepo.save(hotel);
		return savedHotel;
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getHotel(String id) {
		// TODO Auto-generated method stub
		Hotel hotel= hotelRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel not present with given Id"));
		return hotel;   
	}

}
