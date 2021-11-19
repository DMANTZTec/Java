package com.dmantz.fixtures;

import junit.framework.*;

public class JavaTest extends TestCase {
		int value1;
		int value2;
	public void setup() {
		 value1 = 3;
		 value2 = 3;
	}
	public void testAdd() {
	    int result = value1 + value2;
		System.out.println(result);
		assertTrue(result == 6);
	}

}
