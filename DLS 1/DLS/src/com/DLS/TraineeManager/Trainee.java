package com.DLS.TraineeManager;

import java.util.Scanner;

public class Trainee {
	int traineeID;
	String traineeName;
    int courseTraineeId;
	public void setTarineeName(String traineename)
	{
		System.out.println("Enter the trainee Name ");
		Scanner sn=new Scanner(System.in);
		 String s=sn.next();

	}
	
	
	public static void main(String[] args)
	{
		
	
	Trainee trainee=new Trainee();
	trainee.setTarineeName("swapna");
	Course course=new Course();
	course.addCourse();
	Module module=new Module();
	module.addModule();
	Topic topic=new Topic();
	topic.addTopicName();
	}
	

}

/* 
  output 

Enter the trainee Name 
swapna
Enter the Course
java
Enter the Module 
control statements
Enter the topic name 
Nested loops
*/