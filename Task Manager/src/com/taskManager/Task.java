package com.taskManager;

public class Task {
	
	private String name;
	private String description;
	private boolean isCompleted;
	public Task(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		this.isCompleted = false; // tasks are initiated as not completed by default
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean Completed) {
		this.isCompleted = Completed;
	}
	
	
	
	
	
}
