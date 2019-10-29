package co.grandcircus;

import java.util.Scanner;

public class TaskManagerApp {

	public static void main(String[] args) {
		
	int counter = 0;
	Scanner scan = new Scanner(System.in);
	Tasks tasks = new Tasks();
	int userNum;
		
	System.out.println("Welcome to the Task Manager!");
	
	do {
	
	// display menu
	System.out.println();
	System.out.println("1. List tasks");
	System.out.println("2. Add tasks");
	System.out.println("3. Delete task");
	System.out.println("4. Mark task complete");
	System.out.println("5. Quit");
	System.out.println();
	
	userNum = Validator.getInt(scan, "What would you like to do? (enter 1-5): ", 1, 5);
	
	
	if (userNum == 2) {
		System.out.println();
		System.out.println("ADD TASK");
		System.out.println();
		String name = Validator.getString(scan, "Team Member Name: ");
		tasks.setName(name);
		System.out.println();
		String description = Validator.getString(scan, "Task Description: ");
		tasks.setDescription(description);
		System.out.println();
		String dueDate = Validator.getString(scan, "Due date: ");
		tasks.setDueDate(dueDate);
		tasks.setTasks(tasks.getDate(), tasks.getName(), tasks.getDescription());
		counter = counter + 1;
		System.out.println();
		System.out.println("Task entered!");
	
	}
	
	else if (userNum == 1) {
		System.out.println("Done? " + "Due Date " + "Team Member " + "Description");
		System.out.println(tasks.getTasks());
		
	}
	
	else if (userNum == 3) {
		System.out.println(tasks.getTasks());
		System.out.println();
		System.out.print("Which task would you like to delete? (enter number): ");
		int userNumber = scan.nextInt();
		System.out.print("Are you sure you want to delete: Task " + userNumber + "? (y/n): ");
		String userSure = scan.next();
		if (userSure.equalsIgnoreCase("y")) { 
		tasks.deleteTask(userNumber - 1);
		} 
		
	}
	else if (userNum == 4) {
		System.out.print("Which task would you like to mark as complete? (enter number): ");
		int userTaskNum = Validator.getInt(scan, "Which task would you like to mark as complete? (enter number): ", 1, counter);
		
	}
	
	
	} while (userNum > 0 && userNum < 5);
	
	if (userNum == 5) {
		System.out.println();
		System.out.println("Goodbye!");
	}
	
	
	
	
	
	

	}

}
