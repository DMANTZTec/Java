package junit2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class testRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result res=JUnitCore.runClasses(unitTest1.class);
		for(Failure fail : res.getFailures())
		{
			System.out.println(fail.toString());
		}
		System.out.println(res.wasSuccessful());
	}

}
