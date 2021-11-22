package com.JUnitTest;

import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {

	   String message = "to ignore test";	
	   IgnoreClass t1 = new IgnoreClass(message);
	   
	   @Ignore
	   @Test
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	      message = "to ignore test";
	      assertEquals(message,t1.printMessage());
	   }

	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "This is"+" "+"to ignore test";
	      assertEquals(message,t1.salutationMessage());
	   }
		
	}

