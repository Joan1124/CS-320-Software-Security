package test.model;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;



import model.Appointment;


class AppointmentTest {
	
	//Test creating a new task works properly
		@Test
		void testTask() throws ParseException {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			String date="31/12/1998";  
		    Date futureDate= formatter.parse(date);
			Appointment appt = new Appointment("001", futureDate, "Dental appointment");
			assertTrue(appt.getiD().equals("001"));
			assertTrue(appt.getDate().equals(futureDate));
			assertTrue(appt.getTask().equals("Dental appointment"));
		}
		//test to check if the ID is longer than 10 characters
		@Test
		void testIDTooLong() throws ParseException {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			String date="31/12/1998";  
		    Date futureDate= formatter.parse(date);
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1234567891011",futureDate, "Dental appointment");});
		}
		//Test to check if the date is not in the past
		@Test
		void testDateIsNotInPast() throws ParseException {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			String date2 = "10/11/2024" ;
		    Date pastDate= formatter.parse(date2);
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("003", pastDate, "Hello there");});
			
		}
		//test to check if the name is longer than 50 characters
		@Test 
		void testDescriptionTooLong() throws ParseException {
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				String date3="31/12/1998";  
				Date futureDate1= formatter.parse(date3);
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Appointment("004", futureDate1, "Running is fun. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
				+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex. dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in"
				+ "culpa qui officia deserunt mollit anim id est laborum.");});
				
		}

}
