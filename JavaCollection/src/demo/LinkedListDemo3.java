package demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l= new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		
		//using for loop
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		//for each loop
		for(Object e:l)
		{
			System.out.println(e);
		}
		
		
		//iterator() method
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
