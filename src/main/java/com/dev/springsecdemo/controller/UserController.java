package com.dev.springsecdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.springsecdemo.model.User;
import com.dev.springsecdemo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("register")
	public User register(@RequestBody User user) {
	  return service.saveUser(user);
	}
}
