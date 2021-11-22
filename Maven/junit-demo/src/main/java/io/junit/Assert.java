package io.junit;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Assert {
	@Test
	public void Assertions() {
		String str=new String("Good Morning");
		String str1=new String("Good Morning");
		String str2="Dmantz";
		String str3="Dmantz";
		String str4=null;
		int val1=23;
		int val2=31;
		String[] expectedArray= {"Mon","tue","wed"};
		String[] resultArray= {"Mon","tue","wed"};
		assertEquals(str,str1);
		assertSame(str2,str3);
		assertTrue(val1<val2);
		assertFalse(val1>val2);
		assertNotNull(str);
		assertNull(str4);
		assertArrayEquals(expectedArray,resultArray);
		
	}

}
