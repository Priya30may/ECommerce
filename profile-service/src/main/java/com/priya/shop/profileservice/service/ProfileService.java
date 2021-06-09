package com.priya.shop.profileservice.service;

import java.util.List;
import java.util.Optional;

import com.priya.shop.profileservice.entity.UserDetails;

public interface ProfileService {

	Optional<UserDetails> getByUserId(String userId);

	List<UserDetails> getAllProfiles();
	
	UserDetails addNewCustomerProfile(UserDetails userDetails);
	
	UserDetails addAdminProfile(UserDetails userDetails);

	UserDetails getByFirstName(String firstName);

	UserDetails updateProfile(UserDetails userDetails);

	UserDetails deleteUserById(String userId);

	
	
	
	

}
