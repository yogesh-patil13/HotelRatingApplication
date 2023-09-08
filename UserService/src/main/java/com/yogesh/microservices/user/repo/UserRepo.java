package com.yogesh.microservices.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogesh.microservices.user.entity.User;

public interface UserRepo extends JpaRepository<User, String> {

}
