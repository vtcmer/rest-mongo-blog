package com.vmp.blog.repository;

import com.vmp.blog.model.User;

public interface UserRepository  {
	
	
	public User getUser(final String userName);

}
