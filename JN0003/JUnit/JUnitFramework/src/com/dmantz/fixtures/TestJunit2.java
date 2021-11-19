package com.dmantz.fixtures;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestJunit2 {
	
	String message = "Robbert";
	MessageUtil messageutil = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robbert";
		assertEquals(message,messageutil.salutationMessage());
	}

}
