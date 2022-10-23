package model;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Appointment {
	//Declare variables
		private String iD;
		private Date date;
		private String description;
		
		
	//default constructor
		public Appointment(String iD, Date date, String description) {
			
			Date localDate = new Date();
			
			//Check length of strings 
			//Check string is not null
			
			if (iD == null || iD.length() > 10) {
				throw new IllegalArgumentException("Invalid Input, ID must be shorter than 10 characters.");
			}
			else if (description == null || description.length() > 50) {
				throw new IllegalArgumentException("Invalid Input, task must be less than 50 characters.");
			}
			
			//TODO: date cant be in the past
			else if (date == null || localDate.before(date)) {
				throw new IllegalArgumentException("Invalid Input, name must be shorter than 20 characters.");
			}
			this.iD = iD;
			this.date = date;
			this.description = description;
		}

	//getters and setters
		public String getiD() {
			return iD;
		}
		public Date getDate() {
			return date;
		}
		public String getTask() {
			return description;
		}
		
		public void setiD(String iD) {
			this.iD = iD;
		}
		public void setName(Date date) {
			this.date = date;
		}
		public void setTask(String task) {
			this.description = task;
		}
		
		
	}

	
