package com.dmantz.swapna.dls.training.managers;

import java.util.ArrayList;
import java.util.List;

import com.dmantz.swapna.dls.training.common.Course;

public class CourseManager {
	
	private List<Course> course=new ArrayList();//as of now saving in list,database not available
	public void addCourse(Course course) {
		//add to the database
		this.course.add(course);
	}
	public void deleteCourse(Course course)
	{
		this.course.remove(course.getCourseId());
	}
	public void updateCourse(Course course)
	{
		this.course.add(course.getCourseId(),course);	
	}
	public void searchCourse(Course course) {
		
		this.course.add(course.getCourseId(),course);
		
	}
	public int getCourseCount() {
		return course.size();
	}

}
