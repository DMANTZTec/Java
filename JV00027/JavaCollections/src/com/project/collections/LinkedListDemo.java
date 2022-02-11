package com.project.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String args[]) {
		
		  //Declare Linked List
		   LinkedList linkedlist= new LinkedList();
		   
		  //LinkedList<Integer> linkedlist=new LinkedList<Integer>();
		  //LinkedList<String> linkedlist= new LinkedList<String>();
		   linkedlist.add(1);
		   linkedlist.add("Java");
		   linkedlist.add("Oops");
		   linkedlist.add(15643.98);
		   linkedlist.add(true);  
		   linkedlist.add(null);
		   
		   System.out.println(linkedlist);
		   System.out.println(linkedlist.size());
		   
		   //remove
		   linkedlist.remove(2);  //index
		   System.out.println("After removing"+linkedlist);
		   linkedlist.remove(15643.98);
		   System.out.println("After removing,new list:"+linkedlist);
		   
		   
		   //Insert/adding element in the middle of linkedlist
		   linkedlist.add(3,"Udemy");
		   System.out.println("After inserting:"+linkedlist);
		   
		   //retriving value/object
		   System.out.println(linkedlist.get(3)); 
		   
		   //set value /object
		   linkedlist.set(3, "Python");
		   System.out.println("After changing the value"+linkedlist);
		   
		   //contains()
		   System.out.println(linkedlist.contains("Java"));
		   System.out.println(linkedlist.contains("Udemy"));
		   
		   //isEmpty
		   System.out.println(linkedlist.isEmpty());
		   
		   //Reading elements from LL using for loop
		   
		   for(int i=0;i<linkedlist.size();i++)
		   {
			   System.out.println(linkedlist.get(i));
		   }
		   
		   
		   LinkedList linkedlist_dup=new LinkedList();
		   //addAll()
		   linkedlist_dup.addAll(linkedlist);
		   System.out.println( linkedlist_dup);
		   
		   //removeAll()
		   linkedlist_dup.removeAll(linkedlist);
		   System.out.println(linkedlist_dup);
		   
		   //sort
		   LinkedList li=new LinkedList();
		   li.add(12);
		   li.add(10);
		   li.add(31);
		   li.add(15);
		   li.add(9);
		   System.out.println(li);
		   Collections.sort(li);
		   System.out.println("After sorting"+li);
		   
		   //sort..reverse order
		   Collections.sort(li,Collections.reverseOrder());
		   System.out.println("After reverse sorting:"+li);
		   
		   //shuffle
		   Collections.shuffle(li);
		   System.out.println("After shuffling:"+li);
		   
		   //addFirst,addLast,removeFirst,removeLast,getFirst,getLast
		   li.addFirst("Honey");
		   System.out.println(li);
		   li.addLast("Tea");
		   System.out.println(li);
		   
		   System.out.println(li.getFirst());
		   System.out.println(li.getLast());
		 
		  li.removeFirst();
		  li.removeLast();
		  System.out.println(li);
		   
	}

}
