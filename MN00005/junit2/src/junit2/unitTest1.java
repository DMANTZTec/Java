package junit2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class unitTest1 {
	@Test
	   public void testAdd() {
	      int num = 5;
	      String temp = "null";
	      String str = "Junit is working fine";

	      assertEquals("Junit is working fine", str);
	      
	      assertTrue(num < 6);

	      assertNotNull(temp);
	   }

}
