package UnitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import vehicle.app.State;
import vehicle.hal.Temp;

class TestFalse {

	// Object of State class
	State s = new State();
	
	// This function is called/run before every test method
	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}
	
	// Test method to test False functionality
	@Test
	public void testFalse() {
		Temp.iTemp1 = 51;
		// Print the container class of the test method
		System.out.println("Starting JUnit testFalse" + new Object() {
		}.getClass().getEnclosingClass().getName());

		// Assign the value returned from bValidateHighPerformance function into variable
		boolean result = s.bValidateHighPerformance(); //false

		// Compare expected result with actual one
		assertEquals(false, result);
	}

	// This method is called/run after every test
	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}
	
}
