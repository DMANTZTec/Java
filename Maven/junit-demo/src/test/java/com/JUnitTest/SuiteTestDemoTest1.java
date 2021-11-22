package com.JUnitTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuiteTestDemoTest1 {

   String message = "ExampleSuiteTest";	
   SuiteTestDemo m = new SuiteTestDemo(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Test1");    
      assertEquals(message, m.printMessage());     
   }
}
