package com.tracker.map.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tracker.map.entity.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	public User findByMobileNumber(String mobileNumber);
	
	public void deleteByMobileNumber(String MobileNumber);

}
