package com.vmp.blog.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.vmp.blog.model.User;
import com.vmp.blog.repository.UserRepository;

@Repository
public class UserMongoDBRepository   implements UserRepository{
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public static final String COLLECTION_NAME = "users";

	@Override
	public User getUser(String userName) {
		
		User user = mongoTemplate.findById(userName, User.class,COLLECTION_NAME);
		
				
		System.out.println(user.getId() + " Email: "+user.getEmail());
		
		System.out.println();
		
		return user;
		
		
	}

}
