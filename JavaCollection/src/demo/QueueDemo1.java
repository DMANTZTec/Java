package demo;

import java.util.LinkedList;
//import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		LinkedList q=new LinkedList(); 
		//heterogeneous data  allowed
        //Adding elements
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("100"); //
		System.out.println(q);
		
		//get head element  element() peek()
		System.out.println(q.element()); //A returns head element , if empty returns NoSuchElementException
		System.out.println(q.peek()); //A Returns head , if empty returns null
		
		//remove element  remove() poll()
		System.out.println(q.remove()); //A
		System.out.println(q); //[B, C, 100]
		
		System.out.println(q.poll()); //B
		System.out.println(q); //[C, 100]
}
}
