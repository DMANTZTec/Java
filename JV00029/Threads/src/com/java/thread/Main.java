package com.java.thread;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Double>> randomNumLists = new 	ArrayList<ArrayList<Double>>();

		for (int i=0;i<10;i++)
		{
			randomNumLists.add(new ArrayList<Double>());
			
		}
		for(int i=0; i<randomNumLists.size(); i++) {
			 ArrayList<Double> nonInit = randomNumLists.get(i);
			 System.out.println(i);
			
 			 for (int j=0; j<100000; j++) {
				 nonInit.add(Math.random() * 100);
				 
			 }
		}
		
		long startTime = System.currentTimeMillis();
//		for(ArrayList<Double> arrayList : randomNumLists)
//		{
//			Collections.sort(arrayList );
//		}
		ArrayList<Thread> joinedThreads = new ArrayList<Thread>();
		
		
		int listNum = 0;
		
		//System.out.println(randomNumLists);
		for(ArrayList<Double> arrayList : randomNumLists) {
			 System.out.println("Firing new thread");
			
		final int index = listNum;
			Thread t = new Thread(new Runnable()
					{
				      @Override
				      public void run() {
				    	  Collections.sort(arrayList);
			    	  System.out.println("Finished sorting list number :"+index );
				      }
					});
		  //Collecti;ons.sort(arrayList);
		t.start();
			joinedThreads.add(t);
			listNum++;
		
		}
			for(Thread thread : joinedThreads) {
				
			
			try
			{
				System.out.println("Waiting for thread to finish");
				thread.join();
				System.out.println("Thread finished executing");
			}
			catch (InterruptedException e)
			{
			e.printStackTrace();
			}			
			listNum++;
		}
		
		//System.out.println(randomNumLists);
		System.out.println("Programm took: "+ (System.currentTimeMillis()-startTime)+"milliseconds");
	}

}
