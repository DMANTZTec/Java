package com.project.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
// only the difference between linkedlist and priorityQueue is heterogeneousdata allowed in linkedlist ,not allowed in priorityqueue  
public class QueueDemo {

	public static void main(String[] args) {
		
        PriorityQueue q=new PriorityQueue();
        
        //Adding elements add() offer()
        q.add("Java");
        q.add("Python");
        q.add("Angular");
        q.add("Kafka");
        q.offer("Tableu");
        
         System.out.println(q); //insertion order preserved and duplicates allowed
        
        //get head element   elemeny() peek()
        
         //System.out.println(q.element());// Angular returns head element, if empty returns NoSuchElementException
         
         //System.out.println(q.peek()); //Angular returns head element, if empty returns null
         
         
         //Return & remove element from queue remove() poll()
         
         System.out.println(q.poll()); //Angular
         System.out.println(q); //[Java, Kafka, Tableu, Python]
         
         System.out.println(q.remove());//Java
         System.out.println(q); //[Kafka, Python, Tableu]
         
         
         Iterator itr=q.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }
         
         
	}

}
