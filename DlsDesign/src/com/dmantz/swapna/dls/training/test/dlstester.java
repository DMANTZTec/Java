package com.dmantz.swapna.dls.training.test;
import com.dmantz.swapna.dls.training.common.*;
import com.dmantz.swapna.dls.training.common.Module;
import com.dmantz.swapna.dls.training.managers.CourseManager;
import com.dmantz.swapna.dls.training.managers.TraineeManager;
import com.dmantz.swapna.dls.training.managers.Worklog;

import java.util.ArrayList;
import java.util.ListIterator;

public class dlstester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course testcourse=new Course();
		testcourse.setCourseId(1);
		testcourse.setCourseName("Java");
		testcourse.setCreateDate("1-10-2021");
		testcourse.setCreatedBy("Eren Bali");
		testcourse.setCourseProvider("Udemy");
		testcourse.setRecommendedDuration("45 days");
		System.out.println(testcourse.getCourseId()+" "+testcourse.getCourseName()+" "+testcourse.getCreateDate()+" "+testcourse.getCreatedBy()+" "+testcourse.getCourseProvider()+" "+testcourse.getRecommendedDuration());
        
		Course testcourse1=new Course();
		testcourse1.setCourseId(1);
		testcourse1.setCourseName("Python");
		testcourse1.setCreateDate("12-11-2021");
		testcourse1.setCreatedBy("Eren Bali");
		testcourse1.setCourseProvider("Udemy");
		testcourse1.setRecommendedDuration("60 days");
		System.out.println(testcourse1.getCourseId()+" "+testcourse1.getCourseName()+" "+testcourse1.getCreateDate()+" "+testcourse1.getCreatedBy()+" "+testcourse1.getCourseProvider()+" "+testcourse1.getRecommendedDuration());
        
		
		
		CourseManager coursemanager=new CourseManager();
        coursemanager.addCourse(testcourse);
        coursemanager.addCourse(testcourse1);
        System.out.println(coursemanager.getCourseCount());
        coursemanager.deleteCourse(testcourse);
        System.out.println(coursemanager.getCourseCount());
        coursemanager.addCourse(testcourse1);
        System.out.println(coursemanager.getCourseCount());
        coursemanager.searchCourse(testcourse);
        coursemanager.updateCourse(testcourse);
       
        Module module=new Module();
        Module module1=new Module();
        module.setModuleId(1);
        module.setModuleName("JDBC");
        module1.setModuleId(2);
        module1.setModuleName("MultiThreading");
        
        ArrayList<Module> mods=new ArrayList();
        mods.add(module);
        mods.add(module1);
       // for(Module mod)
        
        
        Topic topic=new Topic();
        Topic topic1=new Topic();
        topic.setTopicId(1);
        topic.setTopicName("Drivers");
        topic1.setTopicId(2);
        topic1.setTopicName("Statements");
        topic1.setTopicDescription("To send queiries from java application to the database and to bring the result from database to the java application");
        System.out.println("TopicId-->"+topic1.getTopicId()+"  TopicName-->"+topic1.getTopicName()+"  TopicDescription--> "+topic1.getTopicDescription());
       
        ArrayList<Topic> topics=new ArrayList();
        topics.add(topic);
        topics.add(topic1);
        for(Topic topi: topics)
        {
        	System.out.println(topi.getTopicId()+topi.getTopicName()+topi.getTopicDescription());

            
        	
        }

        Trainee trainee=new Trainee();
        Trainee trainee1=new Trainee();
        Trainee trainee2=new Trainee();
        Trainee trainee3=new Trainee();
              
        trainee.setTraineeId(100);
        trainee.setTraineeName("Swapna");
        trainee1.setTraineeId(101);
        trainee1.setTraineeName("Vamshi");
        trainee2.setTraineeId(102);
        trainee2.setTraineeName("Amulya");
        trainee3.setTraineeId(102);
        trainee3.setTraineeName("Mamatha");
        
       TraineeManager traineemanager= new TraineeManager();
       traineemanager.addTrainee(trainee);
       traineemanager.addTrainee(trainee1);
       traineemanager.addTrainee(trainee2);
       traineemanager.addTrainee(trainee3);
       System.out.println(traineemanager.getTraineeCount());
       traineemanager.deleteTrainee(trainee);
       System.out.println(traineemanager.getTraineeCount());
       traineemanager.searchTrainee(trainee1);
       traineemanager.reviewTrainee(trainee2);
       traineemanager.updateTrainee(trainee);
       
       
       Worklog worklog=new Worklog();
       worklog.setTrainee(trainee1);
       worklog.setCourse(testcourse1);
       worklog.setModule(null);
       worklog.setTopic(topic1);
       worklog.setTaskId(null);
       worklog.setStatus(null);
       worklog.setStartDate(null);
       worklog.setEndDate(null);
       System.out.println(worklog.getTrainee());
	           
	
	}

}
