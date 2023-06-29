package com.workflow.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.workflow.demo.Execution.WorkflowEngine;
import com.workflow.demo.Tasks.Task1;
import com.workflow.demo.Tasks.Task2;
import com.workflow.demo.Tasks.Task3;

@SpringBootApplication
public class SimpleWorkFlowEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWorkFlowEngineApplication.class, args);
		WorkflowEngine workflowEngine = new WorkflowEngine();
		
		 // Create task instances with assigned users
        Task1 task1 = new Task1("User1");
        Task2 task2 = new Task2("User2");
        Task3 task3 = new Task3("User1");
        
     // Add tasks to the workflow engine
        workflowEngine.addTask(task1);
        workflowEngine.addTask(task2);
        workflowEngine.addTask(task3);

        // Execute the workflow
        workflowEngine.executeWorkflow();
	}

}
