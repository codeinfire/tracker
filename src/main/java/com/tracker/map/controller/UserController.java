package com.tracker.map.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.map.entity.User;
import com.tracker.map.repository.UserRepository;

@RestController
@RequestMapping( value = "/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@RequestParam("mobileNumber") String mobileNumber) {
		return new ResponseEntity<>(userRepository.findByMobileNumber(mobileNumber),HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE)
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		User resUser = userRepository.findByMobileNumber(user.getMobileNumber());
		if(resUser == null && null == resUser.getMobileNumber()) {
			userRepository.insert(user);
			return new ResponseEntity<>("User added successfully.",HttpStatus.OK);
		}
		return new ResponseEntity<>("User already exists.",HttpStatus.CONFLICT);
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<>(userRepository.findAll(),HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@RequestParam("mobileNumber") String mobileNumber){
		userRepository.deleteByMobileNumber(mobileNumber);
		return new ResponseEntity<>("User deleted successfully.", HttpStatus.OK);
		
	}

}
