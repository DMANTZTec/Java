package junit2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testEmployeeDetails {
	EmpBusinessLogic eb=new EmpBusinessLogic();
	employeeDetails ed=new employeeDetails();
	@Test
	public void  testcalculateAppraisal()
	{
		ed.setName("vamshi");
		ed.setAge(22);
		ed.setMonthlySalary(11000);
		double apprisal=eb.calculateAppraisal(ed);
		assertEquals(1000,apprisal,0.0);
		
	}
	public void testCalculateYearlySalary()
	{
		ed.setName("vamshi");
		ed.setAge(22);
		ed.setMonthlySalary(11000);
		double salary=eb.calculateYearlySalary(ed);
		assertEquals(132000,salary,0.0);
	}
	
}
