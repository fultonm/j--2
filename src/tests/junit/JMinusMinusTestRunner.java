// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas


package tests.junit;

import java.io.File;
import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;
import tests.pass.*;
import tests.junit.*;

/**
 * JUnit test suite for running the j-- programs in tests/pass.
 */

public class JMinusMinusTestRunner {

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(HelloWorldTest.class);
        suite.addTestSuite(FactorialTest.class);
        suite.addTestSuite(GCDTest.class);
        suite.addTestSuite(SeriesTest.class);
        suite.addTestSuite(ClassesTest.class);
        return suite;
    }

    /**
     * Runs the test suite using the textual runner.
     */

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
