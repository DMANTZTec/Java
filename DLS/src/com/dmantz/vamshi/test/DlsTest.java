package com.dmantz.vamshi.test;

import com.dmantz.vamshi.common.Course;
import com.dmantz.vamshi.common.Module;
import com.dmantz.vamshi.common.Topic;
import com.dmantz.vamshi.common.Trainee;
import com.dmantz.vamshi.managers.CourseManager;
import com.dmantz.vamshi.managers.TraineManager;

public class DlsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c=new Course(); //object for course
		c.setCourseId(1);
		c.setCourseName("java");
		System.out.println(c.getCourseId());
		System.out.println(c.getCourseName());
		
		CourseManager cm=new CourseManager(); //object for course manager
		cm.addCourse(c);
		
		Module m=new Module(); //object for module
		Topic t=new Topic();  //object for topic
		System.out.println();
		Trainee t1=new Trainee(); //object for trainee1
		t1.traineId=1;
		t1.traineName="vamshi";
		t1.traineMail="bhairojuvamshi01444@gmail.com";
		
		System.out.println(t1.traineId);
		System.out.println(t1.traineName);
		System.out.println(t1.traineMail);
		
		
		
		System.out.println();
		
		Trainee t2=new Trainee(); //object for trainee2
		
		t2.traineId=2;
		t2.traineName="raju";
		t2.traineMail="raju@gmail.com";
		
		System.out.println(t2.traineId);
		System.out.println(t2.traineName);
		System.out.println(t2.traineMail);
		
		
		
		TraineManager tm=new TraineManager(); //object for traineemanager
		tm.addTrainees(t1);
		tm.deleteTrainees(t2);
		tm.updateTrainees(t1);
		

	}

}
