package service;

import java.util.ArrayList;

import model.Appointment;

public class AppointmentService {
	
	//create new array
		private ArrayList <Appointment> appointments;
		
		public  AppointmentService() {
			appointments = new ArrayList<>();
	}
		
		//add a new appointment
		public boolean add(Appointment newAppointment) {
			
		boolean alreadyExists = false;
			
		//check jf appt already exists
			for (Appointment a: appointments) {
				if (a.equals(newAppointment)) {
					alreadyExists = true;
				}
			}
			if (!alreadyExists) {
				appointments.add(newAppointment);		//adds new task
				System.out.println("Appointment Succesfully created!");
				return true;
			}
			else {
				System.out.println("Appointment already exists!");
				return false;
			}
			
			
		}
		
		
		//delete tasks
		public boolean delete(String iD) {
			for (Appointment a : appointments) {
				if (a.getiD().equals(iD)) {
					appointments.remove(a);		//removes task if it exists
					System.out.println("Appointment removed");
					return true;
				}			}
			
			System.out.println("Appointment doesn't exists");
			return false;
			}
		
	

}
