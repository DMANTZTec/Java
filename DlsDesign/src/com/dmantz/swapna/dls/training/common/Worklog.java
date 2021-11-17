package com.dmantz.swapna.dls.training.common;

import java.util.Date;

import com.dmantz.swapna.dls.training.common.Course;
import com.dmantz.swapna.dls.training.common.Topic;
import com.dmantz.swapna.dls.training.common.Trainee;

public class Worklog {
	private Trainee traineeName;
	private String TaskId;
	private Course courseName;
	private Module moduleName;
	private Topic  topicId;
	private Topic topicName;
	private String status;
	private Date startDate;
	private Date endDate;
	private String issue;
	
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public Trainee getTraineeName() {
		return traineeName;
	}
	public void setTrainee(Trainee traineeName) {
		
		this.traineeName = traineeName;
	}
	public Course getCourseName() {
		return courseName;
	}
	public void setCourseName(Course courseName) {
		this.courseName = courseName;
	}
	public Module getModuleName() {
		return moduleName;
	}
	public void setModuleName(Module moduleName) {
		this.moduleName = moduleName;
	}
	public Topic getTopicId() {
		return topicId;
	}
	public void setTopic(Topic topicId) {
		this.topicId = topicId;
	}
	public Topic getTopicName() {
		return topicName;
	}
	public void setTopicName(Topic topicName) {
		this.topicName = topicName;
	}
	public String getTaskId() {
		return TaskId;
	}
	public void setTaskId(String taskId) {
		TaskId = taskId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		
}                

