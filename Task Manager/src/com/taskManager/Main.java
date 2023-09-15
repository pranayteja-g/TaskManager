package com.taskManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Task Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. View Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task newTask = new Task(name, description);
                    taskManager.addTask(newTask);
                    System.out.println("\nTask added successfully!");
                    break;
                case 2:
                    System.out.print("Enter the task index to mark as completed: ");
                    int taskIndex = scanner.nextInt();
                    taskManager.markTaskAsCompleted(taskIndex);
                    break;
                case 3:
                    taskManager.viewTasks();
                    break;
                case 4:
                    System.out.print("Enter the task index to delete: ");
                    int deleteIndex = scanner.nextInt();
                    taskManager.deleteTask(deleteIndex);
                    System.out.println("Task deleted successfully!");
                    break;
                case 5:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
