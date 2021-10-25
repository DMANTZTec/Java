package com.dmantz.vamshi.test;

import java.util.ArrayList;
import java.util.Arrays;

import com.dmantz.vamshi.common.Course;
import com.dmantz.vamshi.common.Module;
import com.dmantz.vamshi.common.Topic;
import com.dmantz.vamshi.common.Trainee;
import com.dmantz.vamshi.managers.Admin;
import com.dmantz.vamshi.managers.CourseManager;
import com.dmantz.vamshi.managers.TraineManager;

public class DlsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Topic t=new Topic();  //object for topic
		t.setTopicId(1);
		t.setTopicName("list");
		t.setTopicDescription("list is a dynamical array");
		Topic t1=new Topic();
		t1.setTopicId(2);
		t1.setTopicName("buttons");
		t1.setTopicDescription("it performs some action");
		
		Module m=new Module(); //object for module
		m.setModuleId(1);
		m.setModuleName("collections");
		System.out.println();
		Module m1=new Module(); //object for another module
		m1.setModuleId(2);
		m1.setModuleName("swing");
		

		ArrayList<Topic> top = new ArrayList<Topic>();
		top.add(t);
		top.add(t1);
		
		for(Topic tt:top)
		{
			System.out.println(tt.getTopicId()+" "+tt.getTopicName()+" "+tt.getTopicDescription());
		}
			System.out.println();
		
		
		
		
		Course c=new Course(); //object for course
		c.setCourseId(1);
		c.setCourseName("java");
		System.out.println(c.getCourseId());
		System.out.println(c.getCourseName());
		System.out.println();
		ArrayList<Module> mod = new ArrayList<Module>();
		mod.add(m);
		mod.add(m1);
		
		for(Module mm:mod)
		{
			System.out.println(mm.getModuleId()+" "+mm.getModuleName());
		}
System.out.println();
		
		Course c1=new Course(); //object for course
		c1.setCourseId(2);
		c1.setCourseName("AI");
		System.out.println(c1.getCourseId());
		System.out.println(c1.getCourseName());
		ArrayList<Module> mod1 = new ArrayList<Module>();
		mod.add(m);
		mod.add(m1);
		for(Module mm1:mod1)
		{
			System.out.println(mm1.getModuleId()+" "+mm1.getModuleName());
		}

				
		
		
		
		CourseManager cm=new CourseManager(); //object for course manager
		cm.addCourse(c);
		cm.deleteCourse(c1);
		
		System.out.println();
		Trainee tr=new Trainee(); //object for trainee1
		tr.traineId=1;
		tr.traineName="vamshi";
		tr.traineMail="bhairojuvamshi01444@gmail.com";
		
		
		System.out.println(tr.traineId);
		System.out.println(tr.traineName);
		System.out.println(tr.traineMail);
		
		
		
		System.out.println();
		
		Trainee t2=new Trainee(); //object for trainee2
		
		t2.traineId=2;
		t2.traineName="raju";
		t2.traineMail="raju@gmail.com";
		
		System.out.println(t2.traineId);
		System.out.println(t2.traineName);
		System.out.println(t2.traineMail);
		
		Admin ad=new Admin();//creating object for admin
		ad.monitoringTrainees();
		
		
		TraineManager tm=new TraineManager(); //object for trainemanager
		tm.addTrainees(tr);
		tm.deleteTrainees(t2);
		tm.updateTrainees(tr);
		

	}

	

	

}
