package com.workflow.demo.Tasks;

import com.workflow.demo.Interface.Task;

public class Task2 implements Task{
	
	private final String assignedUser;

    public Task2(String assignedUser) {
        this.assignedUser = assignedUser;
    }

	@Override	
	public void execute() {
		System.out.println("Executing Task 2 assigned to " + assignedUser);
		//Task 2 Logic here
	}

	@Override
	public String getAssignedUser() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
