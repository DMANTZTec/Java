package demo;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
	    //HashSet hs=new HashSet(100); //initial capacity
		//HashSet <Integer>hs=new HashSet<Integer>();
		
		HashSet hs=new HashSet(); //default capacity 16
		
		//add elements/objects
		hs.add(100);
		hs.add("welcome");
		hs.add(23.7);
		hs.add('a');
		hs.add(true);
		hs.add(null);
		System.out.println(hs); //insertion order not fixed
		
		//remove element
		hs.remove(23.7); //value
		System.out.println("after removing"+hs);
		//get method is not specified
		//cannot modify existing value, there is no set method
		
		//contains()
		System.out.println(hs.contains("welcome")); //true
		System.out.println(hs.contains("java")); //false
		System.out.println(hs.isEmpty()); //false
	}

}
