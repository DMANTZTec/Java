package com.amulya.training.dls.common;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import com.amulya.training.dls.common.Course;
import com.amulya.training.dls.common.Module;
import com.amulya.training.dls.common.Topic;
import com.amulya.training.dls.common.Trainee;


public class Worklog {
	private Trainee traineeId;
	private Course courseId;
	private Module moduleId;
	private Topic topicId;
	private Date startDate;
	private Date endDate;
	private String status;
	

	public Trainee getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(Trainee traineeId) {
		this.traineeId = traineeId;
	}
	public Course getCourseId() {
		return courseId;
	}
	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Module getModuleId() {
		return moduleId;
	}
	public void setModuleId(Module moduleId) {
		this.moduleId = moduleId;
	}
	public Topic getTopicId() {
		return topicId;
	}
	public void setTopicId(Topic topicId) {
		this.topicId = topicId;
	}
	
}
	

