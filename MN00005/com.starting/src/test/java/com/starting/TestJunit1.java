package com.starting;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit1 {

   String message = "Robert";	
   messageUtil messageUtil = new messageUtil(message);
   
   @Test
   public void testPrintMessage() {	
     System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());     
   }
}
   