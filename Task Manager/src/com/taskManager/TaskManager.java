package com.taskManager;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	
	private List<Task>tasks;

	public TaskManager() {
		tasks = new ArrayList<>(); 
	}
	
	//method to add tasks
	public void addTask(Task task) {
		tasks.add(task);
	}
	
	public void markTaskAsCompleted(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            Task task = tasks.get(taskIndex);
            task.setCompleted(true);
            System.out.println("Task marked as completed: " + task.getName());
        } else {
            System.out.println("Invalid task index.");
        }
    }
	
	public void viewTasks() {
		for(int i=0; i< tasks.size(); i++) {
			Task task = tasks.get(i);
			
			System.out.println((i)+" . "+ task.getName() + " - " + task.getDescription() + "( completed: " + task.isCompleted() + ")" );
		}
	}
	
	public void deleteTask(int taskIndex) {
		if(taskIndex >= 0 && taskIndex < tasks.size()) {
			tasks.remove(taskIndex);
		}else {
			System.out.println("invalid task index");
		}
	}
	
	public List<Task> getTasks(){
		return tasks;
	}
	
	
	
}
