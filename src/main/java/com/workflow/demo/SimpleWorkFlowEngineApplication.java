package com.workflow.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleWorkFlowEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWorkFlowEngineApplication.class, args);	
		  TaskFlow flow=new TaskFlow(); 
		  flow.flowexecution();
	}

}
