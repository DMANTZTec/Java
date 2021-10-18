package com.DLS.TraineeManager;

import java.util.Scanner;

public class TraineeManager {
	int    traineeManagerId;
	String traineeManagerName;
	
	public void addTrainee()
	{
		System.out.println("add the trainee name ");
		Scanner sn=new Scanner(System.in);
		 String s=sn.next();
		 //System.out.println("Trainee name is"+tm.addTrainee());
		
	
	}
	public void updateTrainee() {
		System.out.println("update the trainee name ");
		Scanner sn=new Scanner(System.in);
		 String s=sn.next();
		 System.out.println("Successfully updated");
		
	}
	public void searchTrainee() {
		System.out.println("assign course ");
		Scanner sn=new Scanner(System.in);
		 String s=sn.next();

		
	}
	public void assignCourses() {
		System.out.println("assign course ");
		Scanner sn=new Scanner(System.in);
		 String s=sn.next();
		
	}
	public void reviewTrainee()
	{
		
		
	}
	public static void main(String[] args)  {
		TraineeManager tm= new TraineeManager();
		
	     
	
		tm.addTrainee();
		tm.assignCourses();
		tm.updateTrainee();	      
	
	}

}

/*output 
add trainee name 
swapna
Enter the course
java
update the traineename
Amulya
Successfully updated
*/
