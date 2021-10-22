package com.dmantz.vamshi.test;

import java.util.ArrayList;
import java.util.Arrays;

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
		
		Course c1=new Course(); //object for course
		c1.setCourseId(2);
		c1.setCourseName("spring");
		System.out.println(c.getCourseId());
		System.out.println(c.getCourseName());
		
		
		CourseManager cm=new CourseManager(); //object for course manager
		cm.addCourse(c);
		cm.deleteCourse(c1);
		
		System.out.println();
		
				
		
		Topic t=new Topic();  //object for topic
		t.setTopicId(1);
		t.setTopicName("basics1");
		t.setTopicDescription("java is lifetime language");
		
		
		
		System.out.println(t.getTopicId());
		System.out.println(t.getTopicName());
		System.out.println(t.getTopicDescription());
		
		System.out.println();
		Module m=new Module(); //object for module
		m.setModuleId(1);
		m.setModuleName("udy");
		System.out.println(m.getModuleName());
		System.out.println(m.getModuleId());
		ArrayList<Topic> top = new ArrayList<Topic>();
		top.add(t);
		System.out.println(top);
			
				
		
		



		
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
