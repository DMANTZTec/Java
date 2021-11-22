package io.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addDemoTest {

	@Test
	void test() {
		addDemo ad=new addDemo();
		int expected=5;
		int actual = ad.add(3,2);
		assertEquals(expected,actual);
	}

}
  