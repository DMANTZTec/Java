package com.project.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//HashSet hs=new HashSet(100);  //intial capacity 100
		//HashSet hs=new HashSet(100,(float)0.90);
		//HashSet <Integer> hs=new HashSet<Integer>
		
		HashSet hs=new HashSet(); // default capacity 16 Load factor 0.75

		//Add objects/elements into HashSet
		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		//remove()
		hs.remove(16.4);
		System.out.println("After removing element:"+hs);
		
		//contains()
		System.out.println(hs.contains("welcome"));
		System.out.println(hs.contains(16));
		System.out.println(hs.isEmpty());
		
		//Reading objects/elements from hashset using for..loop
		/* for(Object e:hs)
		 *{
	        System.out.println(e); 
	        
		 */
		Iterator it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		HashSet <Integer> evenNumber=new HashSet<Integer>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		
		System.out.println("Hashset:"+evenNumber);
		//addAll
		HashSet<Integer> numbers=new HashSet<Integer>();
		
		numbers.addAll(evenNumber);
		numbers.add(10);
		System.out.println("New HashSet:"+numbers);
		
		//removeAll
		
		numbers.removeAll(evenNumber);
		System.out.println(numbers);
		
		
		
		
		
		
		
		
		
		
		
	}

}
