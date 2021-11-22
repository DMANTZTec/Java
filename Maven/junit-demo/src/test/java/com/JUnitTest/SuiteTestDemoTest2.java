package com.JUnitTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuiteTestDemoTest2 {

   String message = "ExampleSuiteTest";	
   SuiteTestDemo m = new SuiteTestDemo(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Test2()");
      message = "This is an" + "ExampleSuiteTest";
      assertEquals(message,m.salutationMessage());
   }
}
