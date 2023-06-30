package com.workflow.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workflow.demo.TestService;
import com.workflow.demo.Entity.Users;
import com.workflow.demo.Execution.WorkflowEngine;


@RestController
@RequestMapping("/Users")
public class UserController {
	
	@Autowired
	TestService wfe;
	
	/*
	 * @GetMapping public ResponseEntity<String> ValidateUser(
	 * 
	 * @RequestBody Users users ){ String response=wfe.validateUser(users); return
	 * new ResponseEntity<String>(response,HttpStatus.OK); }
	 */

}
