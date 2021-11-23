package com.dmantz.junit.paramerterizedtest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestPalindrome {
		String original="madam";
	@Test
    public void testPalindrome()
	{
		assertEquals(original,"madam");
	}

}
