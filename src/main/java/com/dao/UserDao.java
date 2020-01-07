package com.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.model.User;

public interface UserDao extends CrudRepository<User, Integer> {
	
	public User findByUserId(int userId);
	@Query("select user from User user where userName=?1")
	public User findByUserName(String userName);
	
	

}
