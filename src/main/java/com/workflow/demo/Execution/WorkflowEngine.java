package com.workflow.demo.Execution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.workflow.demo.Interface.Task;

public class WorkflowEngine {
	private List<Task> tasks;

    public WorkflowEngine() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void executeWorkflow() {
        Map<String, List<Task>> tasksByUser = groupTasksByUser();
        for (Map.Entry<String, List<Task>> entry : tasksByUser.entrySet()) {
            String user = entry.getKey();
            List<Task> userTasks = entry.getValue();
            System.out.println("Executing tasks assigned to " + user);
            for (Task task : userTasks) {
                task.execute();
            } 
        }
    }
    

    private Map<String, List<Task>> groupTasksByUser() {
        Map<String, List<Task>> tasksByUser = new HashMap<>();
        for (Task task : tasks) {
            String assignedUser = task.getAssignedUser();
            tasksByUser.computeIfAbsent(assignedUser, k -> new ArrayList<>()).add(task);
        }
        return tasksByUser;
    }

}
