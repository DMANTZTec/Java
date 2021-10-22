package com.dmantz.swapna.dls.training.common;

import java.util.ArrayList;



public class Course {
	private int courseId;
	private String courseName;
	private String createdBy;
	private String CreateDate;
	private String recommendedDuration;
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
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(String createDate) {
		CreateDate = createDate;
	}
	public String getRecommendedDuration() {
		return recommendedDuration;
	}
	public void setRecommendedDuration(String recommendedDuration) {
		this.recommendedDuration = recommendedDuration;
	}
	public String getCourseProvider() {
		return courseProvider;
	}
	public void setCourseProvider(String courseProvider) {
		this.courseProvider = courseProvider;
	}
	
	
	
}
