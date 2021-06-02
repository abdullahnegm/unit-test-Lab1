package UnitTests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*
* junit.runner.JunitCore : This statement is loading JUnitCore class.
* junit.runner.Result : This statement is to load the Result class to get results of the test run.
* junit.runner.notification.Failure : This statement is to load the Failure class to get all the failures.
*/

public class JUnitRunner {

	public static void main(String[] args) {

		/*
		 * Result reference that points to the return object of run method which
		 * is invoked using anonymous object of JUnitCore
		 */
		Result result = new JUnitCore().run(TestTrue.class, TestFalse.class);

		// Get the count of the run test cases
		System.out.println("Total number of tests " + result.getRunCount());

		// Get the count of the failed test cases
		System.out.println("Total number of failed tests " + result.getFailureCount());

		/*
		 *  For each loop to iterate of failures test cases to 
		 *  get their header classes and failure message
		 */
		for (Failure fail : result.getFailures()) {
			System.out.println(fail.getTestHeader());
			System.out.println(fail.getMessage());
		}

		// print the run state true for pass / false for fail
		System.out.println(result.wasSuccessful());
	}

}
