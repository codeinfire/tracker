package com.tracker.map.entity;

import org.springframework.data.annotation.Id;

public class Location {
	
	@Id
	public String id;
	
	public String userMobileNumber;
	
	public double latitude;
	
	public double longitude;

	public Location(String userMobileNumber, double latitude, double longitude) {
		this.userMobileNumber = userMobileNumber;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", userMobileNumber=" + userMobileNumber + ", latitude=" + latitude
				+ ", Longitude=" + longitude + "]";
	}
	

}
