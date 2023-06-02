package com.example.springprofile.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springprofile.model.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

	List<User> findAll();

}
