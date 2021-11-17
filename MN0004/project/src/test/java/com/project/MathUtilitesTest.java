package com.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilitesTest {
	MathUtilites mathutils;
	
	@BeforeAll
	 static void beforeAllInit()
	{
		System.out.println("This needs to run before all");
	}
	@BeforeEach
	void init()
	{
		 mathutils=new MathUtilites();
		 System.out.println("beforeEach");
	}
	@AfterEach
	void cleanup()
	{
		System.out.println("Cleaning up......");
	}
	@Test
	void test() {
		int expected =2;
		int actual = mathutils.add(1, 1);
		assertEquals(expected,actual,"The add method to add numbers");
		System.out.println("This test ran");
	}
	@Test
	void testDivide()
	{
		assertThrows(ArithmeticException.class, () ->mathutils.div(1,0),"divide by zero should throw");
	}
	@Test
	void testComputeCircleRadius()
	{
		assertEquals(314.1592653589793,mathutils.computeCircleArea(10),"Should return right circle area");
		
	}
	

}
