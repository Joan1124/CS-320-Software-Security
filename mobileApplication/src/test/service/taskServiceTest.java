package test.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


import model.Task;
import service.TaskService;

class taskServiceTest {
	//Test creating a new task works properly
	
	//Test to see if the add method pass works as intended
	@Test
	public void testMethodAddPass() {
		TaskService t = new TaskService();
		Task t1 = new Task("001", "rebuild", "rebuild the old database from the ground up");
		Task t2 = new Task("002", "Create", "create new website");
		Task t3 = new Task("003", "testing", "test all my test cases");
		assertEquals(true, t.add(t1));
		assertEquals(true, t.add(t2));
		assertEquals(true, t.add(t3));
		}
	//Test see if the add method will fail when intended to
	@Test
	public void testMethodAddFail() {
		TaskService t = new TaskService();
		Task t1 = new Task("001", "rebuild", "rebuild the old database from the ground up");
		Task t2 = new Task("002", "Create", "create new website");
		Task t3 = new Task("003", "testing", "test all my test cases");
		assertEquals(true, t.add(t1));
		assertEquals(false, t.add(t1));
		assertEquals(true, t.add(t2));
		assertEquals(true, t.add(t3));
		}
//Test to see if the delete method pass works as intended
@Test
public void testMethodDeletePass() {
	TaskService t = new TaskService();
	Task t1 = new Task("001", "rebuild", "rebuild the old database from the ground up");
	Task t2 = new Task("002", "Create", "create new website");
	Task t3 = new Task("003", "testing", "test all my test cases");
	assertEquals(true, t.add(t1));
	assertEquals(true, t.add(t2));
	assertEquals(true, t.add(t3));
	
	assertEquals(true, t.delete("003"));
	assertEquals(true, t.delete("002"));
	}

//Test to see if the delete method will fail when needed
@Test
public void testMethodDeleteFail() {
	TaskService t = new TaskService();
	Task t1 = new Task("001", "rebuild", "rebuild the old database from the ground up");
	Task t2 = new Task("002", "Create", "create new website");
	Task t3 = new Task("003", "testing", "test all my test cases");
	
	assertEquals(true, t.add(t1));
	assertEquals(true, t.add(t2));
	assertEquals(true, t.add(t3));

	assertEquals(false, t.delete("005"));
	assertEquals(true, t.delete("002"));
	}
//Test to see if the update method pass works as intended
@Test
public void testMethodUpdatePass() {
	TaskService t = new TaskService();
	Task t1 = new Task("001", "rebuild", "rebuild the old database from the ground up");
	Task t2 = new Task("002", "Create", "create new website");
	Task t3 = new Task("003", "testing", "test all my test cases");
	
	assertEquals(true, t.add(t1));
	assertEquals(true, t.add(t2));
	assertEquals(true, t.add(t3));

	assertEquals(true, t.update("003", "salta", "jumping but in spanish"));
	assertEquals(true, t.update("002", "goodbye", "adios pero en ingles"));
	}

//Test to see if the update method will fail when needed
@Test
public void testMethodUpdateFail() {
	TaskService t = new TaskService();
	Task t1 = new Task("001", "rebuild", "rebuild the old database from the ground up");
	Task t2 = new Task("002", "Create", "create new website");
	Task t3 = new Task("003", "testing", "test all my test cases");
	
	assertEquals(true, t.add(t1));
	assertEquals(true, t.add(t2));
	assertEquals(true, t.add(t3));

	assertEquals(false, t.update("006", "salta", "jumping but in spanish"));
	assertEquals(true, t.update("002", "goodbye", "adios pero en ingles"));
	}

}

