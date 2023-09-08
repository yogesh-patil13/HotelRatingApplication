package com.yogesh.microservices.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HotelSerivceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelSerivceApplication.class, args);
		System.out.print("Jai Shree Ram");
	}

}
