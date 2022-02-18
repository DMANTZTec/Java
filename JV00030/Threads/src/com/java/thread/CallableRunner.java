package com.java.thread;

import java.util.concurrent.Callable;
class CallableTask implements Callable<String>{
String name;
	
	public CallableTask(String name) {
		
		this.name= name;
	}

	@Override
	public String call() throws Exception {
		
		//Thread.sleep(100);
		return "Hello " +name;
	}
	
}

public class CallableRunner implements Callable{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
   
	
}
