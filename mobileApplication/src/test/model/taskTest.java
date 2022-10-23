package test.model;

import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import model.Task;

class taskTest {

	@Test
	void testTask() {
		Task task = new Task("001", "rebuild", "rebuild the old database from the ground up");
		assertTrue(task.getiD().equals("001"));
		assertTrue(task.getName().equals("rebuild"));
		assertTrue(task.getTask().equals("rebuild the old database from the ground up"));
	}
	//test to check if the ID is longer than 10 characters
	@Test
	void testIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Task("1234567891011", "Create", "create new website");});
	}
	//Test to check if the name is longer than 20 characters
	@Test
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Task("003", "testing is life for sure 123456789", "test all my tests");});
		
	}
	//test to check if the name is longer than 50 characters
	@Test 
	void testTaskTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("004", "Running", "Running is fun. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
			+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex. dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in"
			+ "culpa qui officia deserunt mollit anim id est laborum.");});
			
	}

}
