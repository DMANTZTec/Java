package demo;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue(); 
		//heterogeneous data is not allowed
        //Adding elements
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		System.out.println(q);
		
		//get head element  element() peek()
		System.out.println(q.element()); //A returns head element , if empty returns NoSuchElementException
		System.out.println(q.peek()); //A Returns head , if empty returns null
		
		//remove element  remove() poll()
		System.out.println(q.remove()); //A
		System.out.println(q); //[B, C, C]
		
		System.out.println(q.poll()); //B
		System.out.println(q); //[C, C]
		
	}

}
