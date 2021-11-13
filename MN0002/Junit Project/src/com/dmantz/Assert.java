package com.dmantz;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Assert {
    @Test
	public void testAssertions()
	{
		String str=new String("java");
		String str1=new String("java");
		String str2=null;
		String str3="JUnit";
		String str4="JUnit";
		int val=5;
		int val1=6;
		String[] expectedArray= {"one","two","three"};
		String[] resultArray= {"one","two","three"};
		assertEquals(str,str1);
		assertTrue(val<val1);
		assertFalse(val1<val);
		assertNotNull(str);
		assertNull(str2);
		assertSame(str3,str4);
		assertNotSame(str,str1);
		assertArrayEquals(expectedArray,resultArray);
		
		
		
	}



}
