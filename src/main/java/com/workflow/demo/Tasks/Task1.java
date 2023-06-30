package com.workflow.demo.Tasks;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Component;

import com.workflow.demo.Entity.Users;
import com.workflow.demo.Interface.Task;
import com.workflow.demo.Repository.UserRepo;
import com.workflow.demo.exce.ResourceNotFoundException;

@Component
public class Task1 implements Task {
	
	@Autowired
	UserRepo repo;
	
	private String assignedUser;

	public Task1() {
		super();
	}

	public Task1(String assignedUser) {	
        this.assignedUser = assignedUser;
	}
	
	@Override
	public void execute() {
		System.out.println("Enter some thing From Task 1" + assignedUser);
		Scanner myobj = new Scanner(System.in);
		String input = myobj.nextLine();
		System.out.println("TASK : 1 " + input);

	}

	@Override
	public String isValidUser() {
		System.out.println(assignedUser);
		 Optional user2 = Optional.ofNullable(assignedUser);
		 System.out.println(user2);
		 Optional<Users> user =repo.findByuserName(user2);
		//Users user = repo.findByuserName("user1").orElseThrow(()->new ResourceNotFoundException("jjj"));
		//System.out.println(user != null);
	    return "user1";
	}

	
}
