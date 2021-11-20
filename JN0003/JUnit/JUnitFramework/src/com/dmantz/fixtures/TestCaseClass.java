package com.dmantz.fixtures;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestCaseClass extends TestCase {
	
	   protected double fValue1;
	   protected double fValue2;
	   
	   @Before 
	   public void setUp() {
	      fValue1 = 2.0;
	      fValue2 = 3.0;
	   }
		
	   @Test
	   public void testAdd() {
	      //count the number of test cases
	      System.out.println("No of Test Case = "+ this.countTestCases());
			
	      //test getName 
	      String name = this.getName();
	      System.out.println("Test Case Name = "+ name);

	      //test setName
	      this.setName("testNewAdd");
	      String newName = this.getName();
	      System.out.println("Updated Test Case Name = "+ newName);
	   }
		
	   //tearDown used to close the connection or clean up activities
	   public void tearDown(  ) {
	   }


}
