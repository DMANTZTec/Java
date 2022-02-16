package collectiondemo4;

import java.util.LinkedList;

public class LinkedListDemo3 {
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add("cat");
		l.add("cat");
		l.add("dog");
		l.add("dog");
		System.out.println(l);
		l.addFirst("tiger");
		l.addLast("Kiran");
		//after adding first and last elements
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		

	}

}
