package com.dmantz.sampleproject;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestJunit {
	
	String message = "Hello World";	
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {
	      assertEquals(message,messageUtil.printMessage());
	   }

}
