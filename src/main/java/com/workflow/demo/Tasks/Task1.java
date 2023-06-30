package com.workflow.demo.Tasks;

import java.util.Scanner;

import com.workflow.demo.Interface.Task;

public class Task1 implements Task{
	
	private final String assignedUser;

    public Task1(String assignedUser) {
        this.assignedUser = assignedUser;
    }

	@Override	
	public void execute() {
		System.out.println("Enter some thing From Task 1");
		try (Scanner myobj = new Scanner(System.in)) {
			String test=myobj.nextLine();
			System.out.println("TASK : 1 "+test+" "+ assignedUser);
		}
	}

	@Override
	public String getAssignedUser() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
