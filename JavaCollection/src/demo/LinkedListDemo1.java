package demo;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
    
		//declare linkedlist
		LinkedList l=new LinkedList();
		
		//add elements
		l.add(100);
		l.add("hello");
		l.add(29.5);
		l.add('a');
		l.add(true);
		l.add(null);
		System.out.println(l);
		System.out.println(+l.size());
		
		//remove elements
		l.remove(3); //by index
		System.out.println("after removing:"+l);
		
		//insert elements
		l.add(3, "java");
		System.out.println("after inserting:"+l);
		
		//contains()
		System.out.println(l.contains("java")); //true
		System.out.println(l.contains("python")); //false
		
		//using for loop
		for(Object e:l)
		{
			System.out.println(e);
		}
		}
}
