package com.project.javastreams;

import java.util.Arrays;
import java.util.List;

class Course
{
	
	int courseId;
	String courseName;
	int noOfHours;
	
	public Course( int courseId,String courseName,int noOfHours){
		this.courseId=courseId;
		this.courseName=courseName;
		this.noOfHours=noOfHours;
		
	}
	public String getCourseName() {
		
		return this.courseName;
	
		
	}
  public int getCourseId() {
		
		return this.courseId ;
	
		
	}
  public int getNoOfHours() {
		
		return     this.noOfHours ;
	
		
	}
}


public class ParrallelStreams {

	public static void main(String[] args) {
       
		List<Course> courseList =Arrays.asList(
				new Course(1,"Java",40),
				new Course(2,"Springboot", 30),
				new Course(3 ,"Python", 45),
				new Course(4,"Kafka", 20),
				new Course(5,"Angular", 35),
				new Course(6,"Tableu", 10),
				new Course(7,"HTMLCSS", 15),
				new Course(8,"NodeJs", 42),
				new Course(9,"MySql", 25) 
		   );
		//using stream()-sequential 
		courseList.stream()
		          .filter(c->c.getNoOfHours()>=25)
		          .limit(3)
		          .forEach(cl->System.out.println(cl.getCourseId()+" "+cl.getCourseName()+" "+cl.getNoOfHours()));
		
		//parallel stream
		courseList.parallelStream()
        .filter(c->c.getNoOfHours()>=25)
        .limit(3)
        .forEach(cl->System.out.println(cl.getCourseId()+" "+cl.getCourseName()+" "+cl.getNoOfHours()));
  
		//convert Sream() --> parallelStream()
		//parallel
		courseList.stream()
		.parallel()
        .filter(c->c.getNoOfHours()>=25)
        .limit(3)
        .forEach(cl->System.out.println(cl.getCourseId()+" "+cl.getCourseName()+" "+cl.getNoOfHours()));

	}

}
