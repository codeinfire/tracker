package com.tracker.map.entity;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	public String id;

	public String mobileNumber;

	public String name;

	public String profilePic;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", mobileNumber=" + mobileNumber + ", name=" + name + ", profilePic=" + profilePic
				+ "]";
	}

}
