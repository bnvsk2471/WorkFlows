package com.workflow.demo.Execution;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workflow.demo.Entity.Users;
import com.workflow.demo.Interface.Task;
import com.workflow.demo.Repository.UserRepo;

@Service
public class WorkflowEngine {

	@Autowired
	UserRepo repo;

	private List<Task> tasks;

	public WorkflowEngine() {
		tasks = new ArrayList<>();
	}

	public void addTask(Task task) {
		tasks.add(task);
		System.out.println("TaskAdded");
	}

	/*
	 * public void executeWorkflow() { Map<String, List<Task>> tasksByUser =
	 * groupTasksByUser(); for (Map.Entry<String, List<Task>> entry :
	 * tasksByUser.entrySet()) { String user = entry.getKey(); List<Task> userTasks
	 * = entry.getValue(); System.out.println("Executing tasks assigned to " +
	 * user); for (Task task : userTasks) { task.execute(); } } }
	 */

	public void executeWorkflow() {
		for (Task task : tasks) {
			if (task.isValidUser().equals("user1")) {
				try {
					task.execute();
				} catch (Exception e) {
					System.out.println("Invalid user: " + e.getMessage());
				}
			}
			else {
				System.out.println("Invalid user for task: ");
				}
		}
	}

	/*
	 * private Map<String, List<Task>> groupTasksByUser() { Map<String, List<Task>>
	 * tasksByUser = new HashMap<>(); for (Task task : tasks) { String assignedUser
	 * = task.getAssignedUser(); tasksByUser.computeIfAbsent(assignedUser, k -> new
	 * ArrayList<>()).add(task); } return tasksByUser; }
	 */

	

}
