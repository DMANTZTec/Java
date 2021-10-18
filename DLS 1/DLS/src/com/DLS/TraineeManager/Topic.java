package com.DLS.TraineeManager;

import java.util.Scanner;

public class Topic {
	
	public String TopicName;
    public 	int TopicId;
    
    public String getTopicName()
    {
    	return TopicName;
    	
    }
    public void  addTopicName()
    {
    	System.out.println("Enter the topic name ");
		Scanner sn=new Scanner(System.in);
		 String s=sn.next();
    }
	
}
