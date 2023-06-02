package com.example.springprofile.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springprofile.model.User;
import com.example.springprofile.service.UserService;

@RestController
public class UserController {

	private UserService service;

	@GetMapping("/findAllUsers")
	public List<User> findAllUsers() {
		return service.getUsers();
	}

}
