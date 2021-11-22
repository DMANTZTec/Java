package io.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class annotations {
	
	@BeforeClass
	public static void setUp() {
		System.out.println("Hello Everyone");
	}
	@Before
	public void setup() {
		System.out.println("Heyy");
	}
	
	@AfterClass
	public static void setUp1() {
		System.out.println("ok,bye");
	}
	
	@Test
	public void method1() 
	{
		System.out.println("Amulya");
		System.out.println("how are you");
	}
	
	@Test
	public void method2()
	{
		System.out.println("Vamshi");
		System.out.println("how are you");
	}
	
	@Test
	public void method3()
	{
		System.out.println("Swapna");
		System.out.println("how are you");
	}
}
