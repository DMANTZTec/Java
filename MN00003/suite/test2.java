package junit2.suite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test2 {
	String message="kiran";
	MessageUtill ms=new MessageUtill(message);
	@Test
	public void testextendemessage()
	{
		assertEquals("hi"+"message",ms.extendedMessage());
	}
	

}
