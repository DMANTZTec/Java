package com.java.thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		long startTime =System.currentTimeMillis();
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<CallableTask> tasks= List.of(new CallableTask("Java"), new CallableTask("Python"), new CallableTask("SpringBoot"));
		  List<Future<String>>  results =executorService.invokeAll(tasks);
		  
		  
		  for(Future<String> result: results) {
			  
			  System.out.println(result.get());
			  
		  }
		  executorService.shutdown(); 
		  System.out.println("Programm took: "+ (System.currentTimeMillis()-startTime)+"milliseconds");

	}
	

}
