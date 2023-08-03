package com.taskManager;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TaskManagerGUI{
	
	private TaskManager taskManager = new TaskManager();
	private DefaultListModel<String> taskListModel = new DefaultListModel<>();
	private JList<String> taskList = new JList<>(taskListModel);
	private JTextField taskNameInput = new JTextField(20);
	private JTextField taskDescriptionInput = new JTextField(20);
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new TaskManagerGUI().createAndShowGUI());
	}

	private void createAndShowGUI() {
		
		JFrame frame = new JFrame("Task Manager");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(10, 10));
		
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(2, 2, 5, 5)); // 2 rows, 2 columns, and gaps of 5 pixels between components

		inputPanel.add(new JLabel("Task Name: "));
		inputPanel.add(taskNameInput);
		inputPanel.add(new JLabel("Task Description"));
		inputPanel.add(taskDescriptionInput);
		
		JPanel buttonPanel = new JPanel();
		JButton addButton = new JButton("add task");
		addButton.addActionListener(e -> addTask());
		buttonPanel.add(addButton);
		
		JButton deleteButton = new JButton("delete task");
		deleteButton.addActionListener(e-> deleteTask());
		buttonPanel.add(deleteButton);
		
		JButton markAsCompletedButton = new JButton("mark as complete");
		markAsCompletedButton.addActionListener(e->markAsComplete());
		buttonPanel.add(markAsCompletedButton);
		
		
		contentPane.add(inputPanel, BorderLayout.NORTH);
		contentPane.add(new JScrollPane(taskList), BorderLayout.CENTER);
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		
		frame.setContentPane(contentPane);
		frame.pack();
		frame.setVisible(true);
		
		
	}

	private void markAsComplete() {
		int selectedIndex = taskList.getSelectedIndex();
		if(selectedIndex >= 0) {
			taskManager.markTaskAsCompleted(selectedIndex);
			updateTaskList();
		}
	}

	private void deleteTask() {
		int selectedIndex = taskList.getSelectedIndex();
		if(selectedIndex >= 0) {
			taskManager.deleteTask(selectedIndex);
			updateTaskList();
		}
	}

	private void addTask() {
		String Name = taskNameInput.getText();
		String description = taskDescriptionInput.getText();
		Task task = new Task(Name, description);
		taskManager.addTask(task);
		updateTaskList();
		taskNameInput.setText("");
		taskDescriptionInput.setText("");
	}

	private void updateTaskList() {
		
		taskListModel.clear();
		for(Task task: taskManager.getTasks()) {
			taskListModel.addElement(task.getName()+ " - " + task.getDescription()+ "( completed: "+ task.isCompleted() + ")");
			
		}
	}
	
}