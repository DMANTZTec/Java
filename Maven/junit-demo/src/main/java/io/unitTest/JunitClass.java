package io.unitTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JunitClass {
	@Test
	public void setUp() {
		String str="First Unit Testing";
		assertEquals("First Unit Testing",str);
				
	}

}
