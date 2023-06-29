package com.workflow.demo.Tasks;

import com.workflow.demo.Interface.Task;

public class Task1 implements Task{
	
	private final String assignedUser;

    public Task1(String assignedUser) {
        this.assignedUser = assignedUser;
    }

	@Override	
	public void execute() {
		System.out.println("Executing Task 1 assigned to " + assignedUser);
		//Task 1 Logic here
	}

	@Override
	public String getAssignedUser() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
