package UnitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/* The class that will run the tests
 * it takes the runnable class
 */
@RunWith(Suite.class)

/*
 * The classes which contain the test methodes 
 */

@SuiteClasses({TestTrue.class,TestFalse.class})

public class TestSuite {

}
