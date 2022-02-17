package collectiondemo8;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q=new PriorityQueue();
  		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.offer("D");
		System.out.println(q);
		//get head element
		System.out.println(q.element());
		System.out.println(q.peek());
		//return and remove element from the queue
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		//using iterator
		Iterator it=q.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//using foreach loop
		for(Object t:q)
		{
			System.out.println(t);
		}



		
		

	}

}
