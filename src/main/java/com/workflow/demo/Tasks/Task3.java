package com.workflow.demo.Tasks;

import java.util.Scanner;

import com.workflow.demo.Interface.Task;

public class Task3 implements Task{
	
	private final String assignedUser;

    public Task3(String assignedUser) {
        this.assignedUser = assignedUser;
    }

	@Override	
	public void execute() {
		System.out.println("Enter some thing From Task 3");
		try (Scanner myobj = new Scanner(System.in)) {
			String test=myobj.nextLine();
			System.out.println("TASK : 3 "+test+" "+ assignedUser);
			//Task 3 Logic here
		}
	}

	@Override
	public String getAssignedUser() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
