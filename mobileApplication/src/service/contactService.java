package service;
import java.util.ArrayList;

import model.Contact;

public class contactService {
	
//create an array with the all the contacts
private ArrayList <Contact> contacts;

public contactService() {
	contacts = new ArrayList<>();
	}

//Add a contact 
public boolean add(Contact contact) {
	
boolean alreadyExists = false;	//check if there's already a contact
boolean check = true;

	for (Contact c : contacts) {
	if (c.equals(contact)) {
		alreadyExists = true;}
	
	//check if the inputs have the required length
	
	if (!alreadyExists) {
		if(c.getFirstName().length() > 10) {
			check = false;	
		}
		else if (c.getLastName().length() > 10) {
			check = false;}
		
		else if (c.getPhoneNumber().length() != 10) {
			check = false;
		}
		else if (c.getAdress().length() > 30) {
			check = false;
		}
		
	}
	}
	
	//display error message if they do not
	if (!check) {
		System.out.println("Invalid input, check input and try again.");
		return true;
	}
	
	//add contact if they meet the requirements 
	if (check && !alreadyExists) {
		contacts.add(contact);
		System.out.println("Contact Added!");
		return true;
	}
	
	//display message if contact already exist
	else {
	System.out.println("Contact already exists!");
	return false;
	}
	}

//this method remove a contact with given contactId if present in our list 

public boolean remove(String contactID) {
	for (Contact c : contacts) {
		if (c.getContactID().equals(contactID)) {
			contacts.remove(c);
			System.out.println("Contact removed");
			return true;
		}
		}
	System.out.println("Contact doesn't exists");
	return false;
}



//Updates contact of the contactID such as firstName, lastName, etc.

public boolean update(String contactID, String firstName, String lastName, String phoneNumber, String adress) {
	
for (Contact c : contacts) {
	if (c.getContactID().equals(contactID)) {
		if (!firstName.equals(""))
			c.setFirstName(firstName);
		if (!lastName.equals(""))
			c.setLastName(lastName);
		if (!phoneNumber.equals(""))
			c.setPhoneNumber(phoneNumber);
		if (!adress.equals(""))
			c.setAdress(adress);
		System.out.println("Contact updated Successfully!");
		return true;
}
}

System.out.println("Contact doesnt exists");
return false;
}


}
	
	

