package com.yogesh.microservices.hotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogesh.microservices.hotel.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String> {

}
