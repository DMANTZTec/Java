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
		
		//Union, Intersection , difference
		
		HashSet <Integer> set1= new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println("HashSet 1:"+set1);
		
		HashSet <Integer> set2= new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		System.out.println("HashSet2 2:"+set2);
		
//		Union 
//		set1.addAll(set2);
//		System.out.println("Union:"+set1);
//		
//		Intersection
//		set1.retainAll(set2);
//		System.out.println("Intersections:"+set1);
		
		//difference
//		set1.removeAll(set2);
		System.out.println("difference:"+set1);
//		
		//subset
		System.out.println(set1.containsAll(set2));
		System.out.println("subset"+set1);
		
	}
 }

/*output
  [null, A, 100, 16.4, welcome, true]
After removing element:[null, A, 100, welcome, true]
true
false
false
null
A
100
welcome
true
Hashset:[2, 4, 6]
New HashSet:[2, 4, 6, 10]
[10]
HashSet 1:[1, 2, 3, 4, 5]
HashSet2 2:[3, 4, 5]
difference:[1, 2, 3, 4, 5]
true
subset[1, 2, 3, 4, 5]
*/
