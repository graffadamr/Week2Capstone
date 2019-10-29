package co.grandcircus;

import java.util.ArrayList;

public class Tasks {
	
	private String name;
	private String dueDate;
	private String description;
	private String tempList;
	private int listNum = 0;
	private ArrayList<String> addedTasks = new ArrayList<>();
	
	

	public Tasks() {
	
	}
	
	public void setName(String name)  {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public String getDate() {
		return dueDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	
	}
	
	public void setTasks(String dueDate, String name, String description) {
		listNum = listNum + 1;
		addedTasks.add(listNum + " " + "false" + " " + dueDate + " " + name + " " + description);
		
	}
	
	public void deleteTask(int userNumber) {
		addedTasks.remove(userNumber);
	}
	
	public String getTasks() {
		for (String tempList : addedTasks ) {
			System.out.println(tempList);
		}
		return tempList; 
	
	
	// task 4 -- change one element from false to true
}

}
