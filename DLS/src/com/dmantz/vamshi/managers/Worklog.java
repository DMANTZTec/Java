package com.dmantz.vamshi.managers;
import java.util.Date;

import com.dmantz.vamshi.common.Course;
import com.dmantz.vamshi.common.Topic;
import com.dmantz.vamshi.common.Trainee;
import com.dmantz.vamshi.common.Module;

public class Worklog {
	private Trainee traineeId;
	private Course courseId;
	private Module moduleName;
	private Topic topicName;
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
	public Module getModuleName() {
		return moduleName;
	}
	public void setModuleName(Module moduleName) {
		this.moduleName = moduleName;
	}
	public Topic getTopicName() {
		return topicName;
	}
	public void setTopicName(Topic topicName) {
		this.topicName = topicName;
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
	
	
	

}
