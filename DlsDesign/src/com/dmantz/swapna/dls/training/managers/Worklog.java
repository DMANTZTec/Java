package com.dmantz.swapna.dls.training.managers;

import java.util.Date;

import com.dmantz.swapna.dls.training.common.Course;
import com.dmantz.swapna.dls.training.common.Topic;
import com.dmantz.swapna.dls.training.common.Trainee;
import com.swapna.training.dls.common.Module;
import com.swapna.training.dls.common.Traniee;

public class Worklog {
	private Trainee trainee;
	private Course course;
	private Module module;
	private Topic  topic;
	private String TaskId;
	private String status;
	private Date startDate;
	private Date endDate;
	
	public Trainee getTrainee() {
		return trainee;
	}
	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
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

