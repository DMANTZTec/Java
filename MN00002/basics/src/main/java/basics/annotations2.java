package basics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class annotations2 {
	 @AfterClass
	 public static void setup()
	 {
		 System.out.println("s");
	 }
	 
@Test
 public void method1() {
	System.out.println("v");
}
@Test
public void method2() {
	System.out.println("q");
}
}
