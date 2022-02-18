package com.java.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ListSort {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Double>> randomLists = new ArrayList<ArrayList<Double>>();
        for (int i=0;i<10;i++)
        {
        	randomLists.add(new ArrayList<Double>());
        	;
        }
      
        for(int i=0; i<randomLists.size(); i++)
        {
        	ArrayList<Double> nonInit = randomLists.get(i);
        	for(int j=0;j<1000 ; j++)
        	{
        		nonInit.add(Math.random()*100);
        	}
        	  System.out.println(i);
        	  System.out.println(randomLists);
        }
      
        long startTime =System.currentTimeMillis();
//        
//        ArrayList<Callable<ArrayList<Double>>> callables=new  ArrayList<Callable<ArrayList<Double>>>();
//        randomLists.stream().forEach((listToSort)->
//        {
//        	callables.add(()->
//        			{
//        			Collections.sort(listToSort);
//        			return listToSort;
//        			
//        			});
//        			
//        });
//         
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//        
//        try
//        {
//        	 List<Future<ArrayList<Double>>>  out=service.invokeAll(callables);
//        	 service.shutdown();
//        	 randomLists.stream().forEach((sortedList)-> 
//        	 {
//        	double avg=sortedList.stream()
//        	.mapToDouble((x)->x)
//        	.average()
//        	.getAsDouble();
//        	System.out.println(" List Avg is "+avg);
//        	 });
//        	
//        }
//        catch (InterruptedException e)
//        {
//        	e.printStackTrace();
//        }
        System.out.println("Programm took: "+ (System.currentTimeMillis()-startTime)+"milliseconds");
       
	}

	
}
