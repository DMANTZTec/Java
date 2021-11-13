package com.dmantz.vamshi.test;

import java.util.ArrayList;
import java.sql.*;
import java.util.Arrays;

import com.dmantz.vamshi.common.Course;
import com.dmantz.vamshi.common.Module;
import com.dmantz.vamshi.common.Topic;
import com.dmantz.vamshi.common.Trainee;
import com.dmantz.vamshi.managers.Admin;
import com.dmantz.vamshi.managers.CourseManager;
import com.dmantz.vamshi.managers.TraineManager;

public class DlsTest {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		CourseManager cm=new CourseManager();
	

	/*cm.addModule(13,"1st module in kafka", 1, 7);
    cm.addTopic(37,"1st topic","1st topic in first module", 1,13);
    cm.addTopic(38,"2nd topic","2nd topic in first module", 2, 13);
     cm.addTopic(39,"3rd topic","3rd topic in first module", 3, 13);
    cm.addModule(14,"2nd module in kafka", 2, 7);
   cm.addTopic(40,"1st topic","1st topic in second module", 1,14 );
    cm.addTopic(41,"2nd topic","2nd topic in second module", 2, 14);
    cm.addTopic(42,"3rd topic","3rd topic in second module", 3, 14);*/
		
		Module m=new Module(); //object for module
       
		Topic t=new Topic();  //object for topic
		

		Module m1=new Module(); //object for module
		m1.setModuleId(2);
		m1.setModuleName("adv java");

		
		

		ArrayList<Topic> top = new ArrayList<Topic>();
				
		ArrayList<Module> mod = new ArrayList<Module>();
		
		
		Course c1=new Course(); //object for course
		ArrayList<Module> mod1 = new ArrayList<Module>();
		
		Trainee tr=new Trainee(); //object for trainee1
		//tr.viewAssignedCourses(3);
		//tr.viewAllCourses();
		//tr.reportDailyProgress(1,"100% completed", 1,1,1,1,"encapsulation", "yes");
						
		Admin ad=new Admin();//creating object for admin
		//ad.assignCoursesTrainees(1, 1, 1,"java");
		
		//ad.viewCourseProgress(1);
		tr.viewOthersProgress(2);
		TraineManager tm=new TraineManager();//object for trainemanager
		//tm.addCourse(8,"tableau","shanthi sir");
		}
	}
