package service;

import java.util.ArrayList;

import model.Task;

public class TaskService {
	
	//create new array
	private ArrayList <Task> Tasks;
	
	public TaskService() {
		Tasks = new ArrayList<>();
}
	
	//add a new contact 
	public boolean add(Task newTask) {
		
	boolean alreadyExists = false;
		
	//check jf contact already exists
		for (Task t: Tasks) {
			if (t.equals(newTask)) {
				alreadyExists = true;
			}
		}
		if (!alreadyExists) {
			Tasks.add(newTask);		//adds new task
			System.out.println("Task Added!");
			return true;
		}
		else {
			System.out.println("Task already exists!");
			return false;
		}
		
		
	}
	
//delete tasks
public boolean delete(String iD) {
	for (Task t : Tasks) {
		if (t.getiD().equals(iD)) {
			Tasks.remove(t);		//removes task if it exists
			System.out.println("Task removed");
			return true;
		}			}
	
	System.out.println("Task doesn't exists");
	return false;
	}

	//Update tasks name and description
public boolean update(String iD, String name, String description) {
	
for (Task t : Tasks) {
	
	//Check if task exists
	//if yes, only update name and task
	if (t.getiD().equals(iD)) {
		
		if (!name.equals(""))
			t.setName(name);
		
		if (!description.equals(""))
			t.setTask(description);
		
		System.out.println("Task updated Successfully!");
		return true;
}
}

System.out.println("Task doesn't exists");
return false;
}
	
	
	
	
}
