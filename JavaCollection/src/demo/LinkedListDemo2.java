package demo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void main(String[] args)
	{
		//create object linkedlist
		LinkedList l=new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		
		//create new object
		LinkedList new_l=new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l);
		new_l.removeAll(l);
		System.out.println(new_l);
		
		//sort()
		System.out.println("Before sorting:"+l);
		Collections.sort(l);
		System.out.println("After sorting:"+l);
		
		//reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("reverse order:"+l);
		
		
	}

}
