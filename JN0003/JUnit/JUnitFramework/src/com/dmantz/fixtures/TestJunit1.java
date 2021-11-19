package com.dmantz.fixtures;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestJunit1 {
	
	String message= "Robert";
	MessageUtil messageutil= new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		
		System.out.println("Inside testPrintMessage()");
		assertEquals(message,messageutil.printMessage());
		
	}
	
	
	

}
