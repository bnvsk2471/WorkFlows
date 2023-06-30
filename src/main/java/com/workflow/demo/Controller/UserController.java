package com.workflow.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workflow.demo.Entity.Users;


@RestController
@RequestMapping
public class UserController {
	
	@GetMapping
	public ResponseEntity<String> ValidateUser(
			@RequestBody Users users
			){
		return new ResponseEntity<String>("Login Sucessfull",HttpStatus.OK);
	}
	//Test

}
