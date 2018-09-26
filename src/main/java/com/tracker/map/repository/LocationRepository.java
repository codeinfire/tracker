package com.tracker.map.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tracker.map.entity.Location;

public interface LocationRepository extends MongoRepository<Location, String>{

	public Location findByUserMobileNumber(String userMobileNumber);
}
