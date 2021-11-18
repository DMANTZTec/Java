package com.assetions;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class asserions1Test {
	
	asserions1 math;
	@BeforeAll
	static void BeforeAllInit()
	{
		System.out.println("this needs to run before all methods");
	}
	@BeforeEach
	void init()
	{
		 math=new asserions1();
		 System.out.println("before each");
	}
	@Test
	void test()
	{
		int expected=2;
		int actual=math.add(1, 1);
		assertEquals(expected,actual,"add method should be");
	}
	@Test
	void testcircumarea()
	{
		
		assertEquals(314.1592653589793,math.computeCircleArea(10),"should return area");
		
	}
	@Test
	void testDivide()
	{
		assertThrows(ArithmeticException.class, () ->math.div(1,0),"divide by zero should throw");
	}
	@AfterEach
	void aftereach()
	{
		System.out.println("after each clean up");
	}
	@AfterAll
	static void afteralla()
	{
		System.out.println("after all");
	}
	
	
	

}
