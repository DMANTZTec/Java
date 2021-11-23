package parametetrizedtest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class testClass {
	   public int inputNumber;
	   public Boolean expectedResult;
	   public primeNumberChecker primeNumberChecker;

	   @Before
	   public void initialize() {
		   primeNumberChecker = new primeNumberChecker();
	   }

	   
	   public testClass(int inputNumber, Boolean expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }

	   @Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2, true },
	         { 6, false },
	         { 19, true },
	         { 22, false },
	         { 23, true }
	      });
	   }

	   @Test
	   public void testPrimeNumberChecker() {
	      System.out.println("Parameterized Number is : " + inputNumber);
	      assertEquals(expectedResult, 
	      primeNumberChecker.validate(inputNumber));
	   }

}
