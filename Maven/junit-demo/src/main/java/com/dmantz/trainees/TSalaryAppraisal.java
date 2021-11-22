package com.dmantz.trainees;

public class TSalaryAppraisal {
	// Calculate the yearly salary of Trainee
	   public double calculateYearlySalary(TraineeDetails traineeDetails) {
	      double yearlySalary = 0;
	      yearlySalary = traineeDetails.getMonthlySalary() * 12;
	      return yearlySalary;
	   }
		
	   // Calculate the appraisal amount of Trainee
	   public double calculateAppraisal(TraineeDetails traineeDetails) {
	      double appraisal = 0;
			
	      if(traineeDetails.getMonthlySalary() < 15000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
			
	      return appraisal;
	   }
	}


