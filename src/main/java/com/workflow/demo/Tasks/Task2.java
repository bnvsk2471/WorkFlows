package com.workflow.demo.Tasks;

import java.util.Scanner;

import com.workflow.demo.Interface.Task;

public class Task2 implements Task{
	
	private final String assignedUser;

    public Task2(String assignedUser) {
        this.assignedUser = assignedUser;
    }

	@Override	
	public void execute() {
		System.out.println("Enter some thing From Task 2");
		try (Scanner myobj = new Scanner(System.in)) {
			String test=myobj.nextLine();
			System.out.println("TASK : 2 "+test+" "+ assignedUser);
			//Task 2 Logic here
		}
	}

	@Override
	public String getAssignedUser() {
		// TODO Auto-generated method stub
		return assignedUser;
	}
	

}
