package com.dmantz.swapna.dls.training.managers;

import java.util.ArrayList;
import java.util.List;

import com.dmantz.swapna.dls.training.common.Trainee;

public class TraineeManager {
    List<Trainee> trainee=new ArrayList();//as of now saving in list,database not available
	public void addTrainee(Trainee trainee) {
		//add to the database
		this.trainee.add(trainee.getTraineeId(),trainee);
	}
	public void deleteTrainee(Trainee trainee) {
		
		this.trainee.remove(trainee.getTraineeId());
		
		
	}
	public void searchTrainee(Trainee trainee) {
		
		this.trainee.search(trainee.getTraineeId(),trainee);
		
	}
	public void updateTrainee(Trainee trainee) {
		
		this.trainee.add(trainee.getTraineeId(),trainee);
		
	}
	public void reviewTrainee(Trainee trainee) {
		
		this.trainee.add(trainee.getTraineeId(),trainee);
		
	}
	public int getTraineeCount()
	{
		return this.trainee.size();
	}
		
}
