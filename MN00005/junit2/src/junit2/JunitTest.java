package junit2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {
	
	String message="java";
	MessageUtill m=new MessageUtill(message);
	
	@Test
	public void testJunit()
	{		
		assertEquals(message,m.printMessage());
	}
	

}
