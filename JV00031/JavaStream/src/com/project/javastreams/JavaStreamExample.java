package com.project.javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	
	private String employeeName;
    private int employeeId;
    private int employeeSalary;
	
    public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}
public class JavaStreamExample {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setEmployeeId(1);
		employee.setEmployeeName("Swapna");
		employee.setEmployeeSalary(15000);
		Employee employee1= new Employee();
		employee1.setEmployeeId(2);
		employee.setEmployeeName("Vamshi");
		employee.setEmployeeSalary(15000);
		
		List<Employee> emp= new ArrayList<Employee>();
		
		emp.add(employee);
		emp.add(employee1);
		
		 List<Employee> emp2=emp.stream().filter(emp1->emp1.getEmployeeSalary()>10000)
				 .map(emp1->emp1)
				 .collect(Collectors.toList());
		 
		 System.out.println(emp2);
		

	}

}
