package junit2.suite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test1 {
	String message="kiran";
	MessageUtill ms=new MessageUtill(message);
	@Test
	public void testprintmessage()
	{
		assertEquals(message,ms.printMessage());
	}

}
