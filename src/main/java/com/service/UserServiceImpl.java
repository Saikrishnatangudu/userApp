package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public User readById(int userId) {

		return userDao.findByUserId(userId);
	}

	@Override
	public User readByName(String userName) {
		
		return userDao.findByUserName(userName);
	}

}
