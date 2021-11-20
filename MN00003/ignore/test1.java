package junit2.ignore;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;


public class test1 {
	String message="kiran";
	MessageUtill ms=new MessageUtill(message);
	@Ignore
	@Test
	public void testprintmessage()
	{
		assertEquals(message,ms.printMessage());
	}

}
