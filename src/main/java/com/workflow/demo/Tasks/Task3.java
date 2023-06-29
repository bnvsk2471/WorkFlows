package com.workflow.demo.Tasks;

import com.workflow.demo.Interface.Task;

public class Task3 implements Task{
	
	private final String assignedUser;

    public Task3(String assignedUser) {
        this.assignedUser = assignedUser;
    }

	@Override	
	public void execute() {
		System.out.println("Executing Task 3 assigned to " + assignedUser);
		//Task 3 Logic here
	}

	@Override
	public String getAssignedUser() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
