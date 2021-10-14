package com.DLS.TraineeManager;

import java.util.Scanner;

public class TraineeManager {
	int TraineeManagerid;
	String TraineeManagerName;
	String TraineeManagerEmail;
	public void addtrainee()
	{
		System.out.println("add the trainee name ");
		Scanner sn=new Scanner(System.in);
		 String s=sn.next();
		 System.out.println("Successfully added");
	}
	public void updatetrainee() {
		System.out.println("update the trainee name ");
		Scanner sn=new Scanner(System.in);
		 String s=sn.next();
		 System.out.println("Successfully updated");
		
	}
	public void searchtrainee() {
		
	}
	public void assigncourses() {
		
	}
	public static void main(String[] args) {
		TraineeManager tm= new TraineeManager();
		//tm.addtrainee();
	tm.updatetrainee();
	
	}

}

