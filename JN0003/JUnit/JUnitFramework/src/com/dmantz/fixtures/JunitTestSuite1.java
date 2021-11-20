package com.dmantz.fixtures;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite1 {

	public static void main(String[] args) {
		
		TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestCaseClass.class );
	      TestResult result = new TestResult();
	      suite.run(result);
	      System.out.println("Number of test cases = " + result.runCount());

	}

}
