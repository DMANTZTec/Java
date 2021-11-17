package com.dmantz.swapna.dls.training.test;

import java.util.ArrayList;

import com.dmantz.swapna.dls.training.common.Course;
import com.dmantz.swapna.dls.training.common.Module;
import com.dmantz.swapna.dls.training.common.Topic;
import com.dmantz.swapna.dls.training.common.Trainee;
import com.dmantz.swapna.dls.training.common.Worklog;
import com.dmantz.swapna.dls.training.managers.CourseManager;
import com.dmantz.swapna.dls.training.managers.Director;
import com.dmantz.swapna.dls.training.managers.Supervisor;
import com.dmantz.swapna.dls.training.managers.Worklogentry;

public class dlstester {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Course testcourse=new Course();
	
		CourseManager coursemanager=new CourseManager();
	
		//coursemanager.deleteTopic(1);
		//coursemanager.deleteModule(1);
		//coursemanager.deleteCourse(4);
		coursemanager.addTopic(0, "if statement", "jdakfadjlfgadjlgks",1,1);
		
		coursemanager.addModule(0 ,"Css Building Blocks",2,7);
		
		coursemanager.viewCourseDetails();
       //coursemanager.addCourse(10,"Tableau","Pat Hanrahan,Christian chatbot"," ","30 hours","Udemy");
		
		
        Module module=new Module();
        
        Director director=new Director();
        //director.addTrianee(8,"Valishetty Suresh","Tipparthi");         
        Supervisor supervisor=new Supervisor();
       //supervisor.assignCoursesToTrainees(1, 1, 1);
        supervisor.viewDailyProgressofTrainees();
        
        
        
        
       ArrayList<Module> mods=new ArrayList();
       
       Topic topic=new Topic();
      
       ArrayList<Topic> topics=new ArrayList();
       Trainee trainee=new Trainee();
       
        Worklog worklog=new Worklog();
        
        Worklogentry worklogentry=new Worklogentry();
        worklogentry.reportDailyProgress("swapna koyagura",1,"java","jdbc","drivers",4,"completed","2021-7-5","2021-7-6","no");
        worklogentry.viewReportDailyProgress();
        worklogentry.viewAllAvailableCourses();
        worklogentry.viewMyAssignedCourses(1);
	           
	
	}

}
