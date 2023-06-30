package com.workflow.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workflow.demo.Entity.Users;
import com.workflow.demo.Repository.UserRepo;

@Service
public class TestService {
	
	@Autowired
	UserRepo repo;

	/*
	 * public String validateUser(Users user) { Optional<Users> isValid =
	 * repo.findByuserName(user.getUserName()); return isValid.getUserName();
	 * 
	 * }
	 */

}
