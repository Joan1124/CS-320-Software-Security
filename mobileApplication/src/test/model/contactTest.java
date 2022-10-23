package test.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import model.Contact;
class contactTest {

	@Test
	void contactTest() {
		Contact c = new Contact("001", "Pedro", "Martinez", "0123456789", "Calle 5" );
		assertTrue(c.getContactID().equals("001"));
		assertTrue(c.getFirstName().equals("Pedro"));
		assertTrue(c.getLastName().equals("Martinez"));
		assertTrue(c.getPhoneNumber().equals("0123456789"));
		assertTrue(c.getAdress().equals("Calle 5"));
	}
	//test to check if the ID is longer than 10 characters
	@Test
	void testIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789011", "Pedro", "Martinez", "0123456789", "Calle 5" );});
	}
	//Test to check if the name is longer than 20 characters
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("001", "Pedro de la rosa espinal", "Martinez", "0123456789", "Calle 5" );});
		
	}
	//test to check if the name is longer than 50 characters
	@Test 
	void testLastNameTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("001", "Pedro", "Martinez sanches de la cruz", "0123456789", "Calle 5" );});
			
	}
	
	@Test 
	void testPhoneNumberTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("001", "Pedro", "Martinez", "01234567891122", "Calle 5" );});
			
	}
	
	@Test 
	void testAdressTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("001", "Pedro", "Martinez", "01234567891122", "P sherman 42 Wallaby way sydney. southern new hampshire university in the south yada yaad yada yada too long already I hope" );});
			
	}
	
}



