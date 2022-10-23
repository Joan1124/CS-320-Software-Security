package test.service;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import model.Appointment;
import service.AppointmentService;

class AppointmentServiceTest {
	
	//Test to see if the add method pass works as intended
		@Test
		public void testMethodAddPass() throws ParseException {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			String date="31/12/1998";  
		    Date futureDate= formatter.parse(date);
			AppointmentService a = new AppointmentService();
			Appointment a1 = new Appointment("001", futureDate, "Dental appointment");
			 Appointment a2 = new  Appointment("002", futureDate, "car show appointment");
			 Appointment a3 = new  Appointment("003", futureDate, "Doctor appointment");
			assertEquals(true, a.add(a1));
			assertEquals(true, a.add(a2));
			assertEquals(true, a.add(a3));
			}
		//Test see if the add method will fail when intended to
		@Test
		public void testMethodAddFail() throws ParseException {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			String date="31/12/1998";  
		    Date futureDate= formatter.parse(date);
			 AppointmentService a = new  AppointmentService();
			 Appointment a1 = new Appointment("001", futureDate, "Dental appointment");
			 Appointment a2 = new  Appointment("002", futureDate, "car show appointment");
			 Appointment a3 = new  Appointment("003", futureDate, "Doctor appointment");
			assertEquals(true, a.add(a1));
			assertEquals(false, a.add(a1));
			assertEquals(true, a.add(a2));
			assertEquals(true, a.add(a3));
			}
	//Test to see if the delete method pass works as intended
	@Test
	public void testMethodDeletePass() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String date="31/12/1998";  
	    Date futureDate= formatter.parse(date);
		 AppointmentService a = new  AppointmentService();
		 Appointment a1 = new Appointment("001", futureDate, "Dental appointment");
		 Appointment a2 = new  Appointment("002", futureDate, "car show appointment");
		 Appointment a3 = new  Appointment("003", futureDate, "Doctor appointment");
		assertEquals(true, a.add(a1));
		assertEquals(true, a.add(a2));
		assertEquals(true, a.add(a3));
		
		assertEquals(true, a.delete("003"));
		assertEquals(true, a.delete("002"));
		}

	//Test to see if the delete method will fail when needed
	@Test
	public void testMethodDeleteFail() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String date="31/12/1998";  
	    Date futureDate= formatter.parse(date);
		 AppointmentService a = new  AppointmentService();
		 Appointment a1 = new Appointment("001", futureDate, "Dental appointment");
		 Appointment a2 = new  Appointment("002", futureDate, "car show appointment");
		 Appointment a3 = new  Appointment("003", futureDate, "Doctor appointment");
		
		assertEquals(true, a.add(a1));
		assertEquals(true, a.add(a2));
		assertEquals(true, a.add(a3));

		assertEquals(false, a.delete("005"));
		assertEquals(true, a.delete("002"));
		}


}
