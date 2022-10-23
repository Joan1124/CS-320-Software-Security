package test.service;

import static org.junit.Assert.*;
import org.junit.Test;

import model.Contact;
import service.contactService;


public class contactServiceTest {

//Tests add contact function
@Test
public void testMethodAddPass() {
	contactService cs = new contactService();
	Contact c1 = new Contact("001", "Pedro", "Martinez", "0123456789", "Calle 5" );
	Contact c2 = new Contact("002", "Jim", "Halpert", "0123456789", "57 west");
	Contact c3 = new Contact("003", "James", "Lebron", "0123456789", "1430 east");
	assertEquals(true, cs.add(c1));
	assertEquals(true, cs.add(c2));
	assertEquals(true, cs.add(c3));
	}

//checks if the method wont work unless right credentials are provided
@Test
public void testMethodAddFail() {
	contactService cs = new contactService();
	Contact c1 = new Contact("001", "Pedro", "Martinez","0123456789", "Calle 5" );
	Contact c2 = new Contact("002", "Jim", "Halpert", "0123456789", "57 west");
	Contact c3 = new Contact("003", "James", "Lebron","0123456789", "1430 east");
	assertEquals(true, cs.add(c1));
	assertEquals(false, cs.add(c1));
	assertEquals(true, cs.add(c3));
	assertEquals(true, cs.add(c2));
	}

//checks if delete method works properly
@Test
public void testMethodDeletePass() {
	contactService cs = new contactService();
	Contact c1 = new Contact("001", "Pedro", "Martinez", "0123456789", "Calle 5" );
	Contact c2 = new Contact("002", "Jim", "Halpert", "0123456789", "57 west");
	Contact c3 = new Contact("003", "James", "Lebron", "0123456789", "1430 east");
	
	assertEquals(true, cs.add(c2));
	assertEquals(true, cs.add(c3));

	assertEquals(true, cs.remove("003"));
	assertEquals(true, cs.remove("002"));
	}

//checks if delete method will fail when necessary
@Test
public void testMethodDeleteFail() {
	contactService cs = new contactService();
	Contact c1 = new Contact("001", "Pedro", "Martinez", "0123456789", "Calle 5" );
	Contact c2 = new Contact("002", "Jim", "Halpert", "0123456789", "57 west");
	Contact c3 = new Contact("003", "James", "Lebron","0123456789", "1430 east");
	assertEquals(true, cs.add(c1));
	assertEquals(true, cs.add(c3));
	assertEquals(true, cs.add(c2));

	assertEquals(false, cs.remove("005"));
	assertEquals(true, cs.remove("002"));
	}

//checks if update method works as intended
@Test
public void testUpdatePass() {
	contactService cs = new contactService();
	Contact c1 = new Contact("001", "Pedro", "Martinez", "5518886450", "Calle 5" );
	Contact c2 = new Contact("002", "Jim", "Halpert", "5533325543", "57 west");
	Contact c3 = new Contact("003", "James", "Lebron", "1233425435", "1430 east");

	assertEquals(true, cs.add(c1));
	assertEquals(true, cs.add(c3));
	assertEquals(true, cs.add(c2));

	assertEquals(true, cs.update("003", "Triple", "H", "2344554",""));
	assertEquals(true, cs.update("002", "Albert", "Pujols", "3435535442", "698 HR "));
	}

//checks if update method will fail when needed
@Test
public void testUpdateFail() {
	contactService cs = new contactService();
	Contact c1 = new Contact("001", "Pedro", "Martinez", "5518886450", "Calle 5" );
	Contact c2 = new Contact("002", "Jim", "Halpert", "5533325543", "57 west");
	Contact c3 = new Contact("003", "James", "Lebron", "1233425435", "1430 east");
	assertEquals(true, cs.add(c1));
	assertEquals(true, cs.add(c3));
	assertEquals(true, cs.add(c2));

	assertEquals(false, cs.update("005", "Ricky", "MArtin","2344534565", ""));
	assertEquals(true, cs.update("002", "Jimmy", "neutron", "2334534656", "34 south"));
	}

}
