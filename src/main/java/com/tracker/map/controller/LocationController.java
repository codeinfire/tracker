package com.tracker.map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.map.entity.Location;
import com.tracker.map.repository.LocationRepository;

@RestController
@RequestMapping(value = "/location")
public class LocationController {
	
	@Autowired
	private LocationRepository locationRepository;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE)
	public Object saveLocation(@RequestBody Location location) {
		
		locationRepository.save(new Location(location.getUserMobileNumber(),location.getLatitude(), location.getLongitude()));
		return "Location found with findByUserMobileNumber: "+locationRepository.findByUserMobileNumber(location.getUserMobileNumber()).toString();
	}

}
