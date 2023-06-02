package com.example.springprofile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.springprofile.dao.UserRepository;
import com.example.springprofile.model.User;

@Service
@Profile(value = { "loocal", "dev", "prod" })
public class UserService {
	@Autowired
	private UserRepository repository;

	public List<User> getUsers() {
		return repository.findAll();
	}

}
