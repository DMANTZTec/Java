package com.java.thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		long startTime =System.currentTimeMillis();
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		List<CallableTask> tasks= List.of(new CallableTask("Java"), new CallableTask("Python"), new CallableTask("SpringBoot"));
		  String result =executorService.invokeAny(tasks);
		  
		  System.out.println(result);
		  executorService.shutdown(); 
		  System.out.println("Programm took: "+ (System.currentTimeMillis()-startTime)+"milliseconds");

	}
	

}
