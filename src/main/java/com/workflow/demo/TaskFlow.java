package com.workflow.demo;

import com.workflow.demo.Execution.WorkflowEngine;
import com.workflow.demo.Tasks.Task1;

public class TaskFlow {
	
	public void flowexecution() {
	WorkflowEngine workflowEngine = new WorkflowEngine();
	
 		Task1 task1=new Task1("user1");
		//Task1 task2=new Task1("user2");
		//Task1 task3=new Task1("user3");

    // Add tasks to the workflow engine
	   workflowEngine.addTask(task1);
     //  workflowEngine.addTask(task2);
     //  workflowEngine.addTask(task3);
     
       workflowEngine.executeWorkflow();
       
	}

}
