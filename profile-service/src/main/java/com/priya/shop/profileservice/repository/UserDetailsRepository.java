package com.priya.shop.profileservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.priya.shop.profileservice.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends MongoRepository<UserDetails,String> {

	UserDetails findByMobileNo(Long mobileNo);

	UserDetails findByFirstName(String firstName);

	UserDetails deleteByUserId(String userId);
	
	
}
