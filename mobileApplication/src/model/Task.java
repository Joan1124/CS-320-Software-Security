package model;


public class Task {

//Declare variables
	private String iD;
	private String name;
	private String description;
	
//default constructor
	public Task(String iD, String name, String task) {
		
		//Check length of strings 
		//Check string is not null
		
		if (iD == null || iD.length() > 10) {
			throw new IllegalArgumentException("Invalid Input, ID must be shorter than 10 characters.");
		}
		else if (task == null || task.length() > 50) {
			throw new IllegalArgumentException("Invalid Input, task must be less than 50 characters.");
		}
		else if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid Input, name must be shorter than 20 characters.");
		}
		this.iD = iD;
		this.name = name;
		this.description = task;
	}

//getters and setters
	public String getiD() {
		return iD;
	}
	public String getName() {
		return name;
	}
	public String getTask() {
		return description;
	}
	
	public void setiD(String iD) {
		this.iD = iD;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTask(String task) {
		this.description = task;
	}
	
	
}
