package com.dmantz.trainees;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TraineeDetailsTest {
	TSalaryAppraisal tSalaryAppraisal = new TSalaryAppraisal();
	TraineeDetails trainee = new TraineeDetails();

	   //test to check appraisal
	   @Test
	   public void testCalculateAppriasal() {
	      trainee.setName("Amulya");
	      trainee.setAge(23);
	      trainee.setMonthlySalary(10000);
			
	      double appraisal = tSalaryAppraisal.calculateAppraisal(trainee);
	      assertEquals(500, appraisal, 0.0);
	   }

	   // test to check yearly salary
	   @Test
	   public void testCalculateYearlySalary() {
		   trainee.setName("Amulya");
		   trainee.setAge(23);
		   trainee.setMonthlySalary(10000);
			
	      double salary = tSalaryAppraisal.calculateYearlySalary(trainee);
	      assertEquals(120000, salary, 0.0);
	   }
	}
	


