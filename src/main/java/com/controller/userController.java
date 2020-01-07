package com.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
public class userController {
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/")
	public String fun() {
		
		return "Saikrishna....,Welcome to Spring Tool Suite";
	}
	
	@RequestMapping(value = "/getbyid/{userId}")
	public User getById(@PathVariable int userId ) {
		return userService.readById(userId);
		
		
	}
	@RequestMapping(value = "/getbyname/{userName}")
	public User getByName(@PathVariable String userName ) {
		return userService.readByName(userName);
		
		
	}


}
