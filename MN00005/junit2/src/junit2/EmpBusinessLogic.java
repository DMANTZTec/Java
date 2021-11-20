package junit2;

public class EmpBusinessLogic {
	public double calculateYearlySalary(employeeDetails employeeDetails) {
	      double yearlySalary = 0;
	      yearlySalary = employeeDetails.getMonthlySalary() * 12;
	      return yearlySalary;
	   }
	public double calculateAppraisal(employeeDetails eployeeDetails) {
	      double appraisal = 0;
			
	      if(eployeeDetails.getMonthlySalary() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
			
	      return appraisal;
	   }
}
