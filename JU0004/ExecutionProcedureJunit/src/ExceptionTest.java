import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExceptionTest {

	
		
		String message = "Swapna";
		Exception exception = new Exception(message);
		
		@Test(expected = ArithmeticException.class)
		
		public void testPrintMessage() {
			System.out.println("Inside testPrintMessage()");
			exception.printMessage();
		}
      @Test
      public void testSalutationMessage() {
    	  System.out.println("Inside testSalutationMessage()");
    	  message = "Hello!" + "Swapna";
    	  assertEquals(message,exception.salutationMessage());
      }
      
	}


