package model;

public class Contact {
	
//declare variables	
private String contactID;
private String firstName;
private String lastName;
private String phoneNumber;
private String adress;

//constructors

public Contact(String iD, String firstName, String lastName, String phoneNumber, String adress) {
	if (iD == null || iD.length() > 10) {
		throw new IllegalArgumentException("Invalid Input, ID cant be more than 10 characters.");
	}
	else if (firstName == null || firstName.length() > 10) {
		throw new IllegalArgumentException("Invalid Input, task cant be more than 10 characters.");
	}
	else if (lastName == null || lastName.length() > 10) {
		throw new IllegalArgumentException("Invalid Input, name cant be more than 10 characters.");
	}
	else if (phoneNumber == null || phoneNumber.length() != 10) {
		throw new IllegalArgumentException("Invalid Input, phone number must 10 characters");
	}
	else if (adress == null || adress.length() > 30) {
		throw new IllegalArgumentException("Invalid Input, address cant be longer than 30 characters ");
	}
this.contactID = iD;
this.firstName = firstName;
this.lastName = lastName;
this.phoneNumber = phoneNumber;
this.adress = adress;
}

//Get and set 

public String getContactID() {
	return contactID;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}




}

