package com.amulya.training.dls.test;

import com.amulya.training.dls.common.Course;
import com.amulya.training.dls.common.Topic;
import com.amulya.training.dls.common.Module;
import com.amulya.training.dls.common.Supervisor;
import com.amulya.training.dls.common.Trainee;
import com.amulya.training.dls.common.Worklog;
import com.amulya.training.dls.managers.CourseManager;
import com.amulya.training.dls.managers.Director;



public class DlsTester {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Course testCourse = new Course(); //object for course
		//testCourse.setCourseId(1);
		System.out.println(testCourse.getCourseId());
		
		CourseManager courseManager = new CourseManager();
		
		
		courseManager.addCourse(1,"java","Manager","2021/09/09","Udemy","200hours");
		courseManager.addCourse(2,"Python","Manager","2021/09/09","Udemy","200hours");
		courseManager.addCourse(3,"Angular","Manager","2021/09/09","Udemy","200hours");
		courseManager.addCourse(4,"kafka","Manager","2021/09/09","Udemy","200hours");
		courseManager.addCourse(5,"Springboot","Manager","2021/09/09","Udemy","200hours");
		courseManager.addCourse(6,"ReactNative","Manager","2021/09/09","Udemy","200hours");
		
		
		courseManager.deleteCourse(1);
		courseManager.updateCourse();
		
		
		courseManager.addModule(1,"java oops",1);
		courseManager.addModule(2,"python variables",2);
		courseManager.addModule(3,"python functions",2);
		courseManager.addModule(4,"Angular",3);
		courseManager.deleteModule(1);
		courseManager.deleteTopic(1);
		
		
		courseManager.addTopic(1,"object","real entities",1,1);
		courseManager.addTopic(2,"class","collection of objects",2,1);
		courseManager.addTopic(3,"Polymorphism","overloading and overriding",3,1);
		courseManager.addTopic(4,"Inheritance","object inherits all the properties of parent object",5,1);
		courseManager.addTopic(5,"Abstraction","hiding internal details",4,1);
		courseManager.addTopic(6,"Encapsulation","Binding of data",6,1);
		courseManager.addTopic(7,"list","basics of python",1,2);
		courseManager.addTopic(8,"tuple","basics of python",2,2);
		courseManager.addTopic(9,"functions","basics of python",1,3);
		courseManager.addTopic(10,"Angular Framework","basics of Angular",1,4);
	
		
		
		
		Topic topic=new Topic();  //object for topic
		
		
		Module mod=new Module(); //object for module
		
		
		Trainee t1=new Trainee(); //object for trainee
	
		t1.viewAllCourses();
		t1.viewAssignedCourses(2);
		t1.reportDailyProgress(1, "vamshi", 0,1, "2021/08/11", "2021/08/12", "Finished");
		t1.reportDailyProgress(2, "swapna", 2,1, "2021/08/11", "2021/08/12", "Finished");
		t1.reportDailyProgress(3, "amulya", 1,1, "2021/08/11", "2021/08/12", "Finished");
		t1.reportDailyProgress(4, "mamatha",1,1, "2021/08/11", "2021/08/12", "Finished");
		
		//t1.viewCourseProgress(2);
		t1.viewOtherTraineeProgress(2);
		Supervisor s=new Supervisor();
		
		s.AssignCourses(1, 1, 1, "vamshi");
		s.AssignCourses(2, 2, 1, "swapna");
		s.AssignCourses(3, 3, 1, "amulya");
		s.AssignCourses(4, 4, 3, "mamatha");
		s.viewCourseProgress(1);
		
		
		
		
		Director d= new Director();
		//d.addTrainee(9,"Ms.R","msr@gmail.com",2);
		
		Worklog wl=new Worklog();
		
	

}
}
