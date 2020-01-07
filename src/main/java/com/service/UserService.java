package com.service;

import com.model.User;

public interface UserService {
	
	public User readById(int userId); 
	public User readByName(String userName); 

}
