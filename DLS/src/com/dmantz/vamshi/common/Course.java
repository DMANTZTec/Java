package com.dmantz.vamshi.common;

import java.util.ArrayList;
import java.util.Date;

public class Course {
	private int courseId;
	private String courseName;
	private Date createdBy;
	private String courseProvider;
	private ArrayList<Module> modules;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Date getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}
	public String getCourseProvider() {
		return courseProvider;
	}
	public void setCourseProvider(String courseProvider) {
		this.courseProvider = courseProvider;
	}
	public ArrayList<Module> getModules() {
		return modules;
	}
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	

}
