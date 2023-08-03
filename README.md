# TaskManager
## 1. Introduction

### 1.1 Overview
The Task Manager is a simple Java application that allows users to manage their tasks. It provides a command-line interface (CLI) and a graphical user interface (GUI) for adding, viewing, marking tasks as completed, and deleting tasks.

### 1.2 Purpose
The purpose of the Task Manager is to help users organize and keep track of their tasks effectively. Users can easily add new tasks, mark them as completed, and remove completed or unnecessary tasks.

### 1.3 Scope
The Task Manager focuses on basic task management functionality, including adding, viewing, and deleting tasks. It does not include advanced features like task priorities, reminders, or task categorization.

### 1.4 Goals
- Create a user-friendly interface for managing tasks.
- Allow users to add new tasks with names and descriptions.
- Provide options to mark tasks as completed and delete tasks.
- Implement graphical interfaces for user interaction.

## 2. Technologies Used
- Java SE 8 (Standard Edition) or higher.
- AWT (Abstract Window Toolkit) for GUI development.

## 3. Requirements

### 3.1 Functional Requirements
- Users can add a new task with a name and description.
- Users can view the list of tasks.
- Users can mark a task as completed.
- Users can delete a task.

## 4. Project Structure

### 4.1 Overview
The Task Manager project consists of three main Java classes that form the core components of the application:

**Task.java**
- *Description*: The Task class represents a single task with attributes and methods for task management. Each task has a name, description, and completion status.
- *Purpose*: It allows users to create and manage individual tasks with their respective details.

**TaskManager.java**
- *Description*: The TaskManager class manages a list of tasks and provides methods for adding, viewing, marking, and deleting tasks.
- *Purpose*: It serves as the central manager for the collection of tasks and enables users to interact with the list of tasks.

**TaskManagerGUI.java**
- *Description*: The TaskManagerGUI class contains the AWT-based graphical user interface for the task manager. It provides a user-friendly GUI for managing tasks.
- *Purpose*: It allows users to interact with tasks using a graphical interface, improving the user experience compared to the command-line interface.

### 4.2 Directory Structure
The project's directory structure is organized as follows:

TaskManager/  
|-- Task.java  
|-- TaskManager.java  
|-- TaskManagerGUI.java  
|-- Main.java (deprecated, not needed for GUI version)  


The TaskManager directory contains the Java files that implement the classes for the Task Manager project. The deprecated Main.java file is no longer needed since the GUI version is now the main entry point.

## 5. Class Overview

### 5.1 Task Class

#### 5.1.1 Description
The Task class represents a single task with attributes like name, description, and completion status. It provides methods to manage tasks, such as getting and setting attributes.

#### 5.1.2 Attributes
- `name` (String): The name of the task.
- `description` (String): The description of the task.
- `completed` (boolean): Indicates whether the task is completed or not.

#### 5.1.3 Methods
- `Task(String name, String description)`: Constructor to create a new task with a given name and description.
- `getName()`: Get the name of the task.
- `getDescription()`: Get the description of the task.
- `isCompleted()`: Check if the task is completed.
- `setCompleted(boolean completed)`: Set the completion status of the task.

### 5.2 TaskManager Class

#### 5.2.1 Description
The TaskManager class manages a list of tasks and provides methods for adding, viewing, marking, and deleting tasks.

#### 5.2.2 Attributes
- `tasks` (List<Task>): A list of tasks managed by the task manager.

#### 5.2.3 Methods
- `TaskManager()`: Constructor to initialize the list of tasks.
- `addTask(Task task)`: Add a new task to the list.
- `getTasks()`: Get the list of tasks.
- `markTaskAsCompleted(int index)`: Mark the task at the specified index as completed.
- `deleteTask(int index)`: Delete the task at the specified index from the list.

## 6. TaskManagerGUI Class

### 6.1 Description
The TaskManagerGUI class provides an AWT-based graphical user interface for the task manager. It allows users to interact with tasks through a simple GUI.

### 6.2 GUI Components
The GUI components used in the TaskManagerGUI class include:
- `JList<String>`: Displays the list of tasks in the GUI.
- `JTextField`: Input fields for entering task name and description.
- `JButton`: Buttons for adding, deleting, and marking tasks as completed.

### 6.3 Methods
- `createAndShowGUI()`: Initializes and displays the GUI.
- `addTask()`: Event handler for adding a new task.
- `deleteTask()`: Event handler for deleting a task.
- `markTaskAsCompleted()`: Event handler for marking a task as completed.
- `updateTaskList()`: Updates the task list displayed in the GUI.



