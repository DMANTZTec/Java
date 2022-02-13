package com.project.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		
		 //Hashtable ht=new Hashtable(); //capacity is 11, load factor 0.75
		// Hashtable t=new(intial capacity); //create hashtable object with some capacity
		//Hashtable t=new Hashtable(intialcapacity, fillratio/loadfactor); 
		
		Hashtable <Integer,String> t=new Hashtable<Integer, String>();
		
		t.put(1,"swapna");
		t.put(2,"kavya");
		t.put(3,"amani");
		t.put(4,"srija");
		t.put(5,"sagarika");
		//t.put(null, "Swetha"); //cannot invoke "Object.hashcode()" because key is null
		//t.put(6, null); //Null pointer Exception
		
		System.out.println(t);//{5=sagarika, 4=srija, 3=amani, 2=kavya, 1=swapna}
		
		System.out.println(t.get(3));//amani
		
		  t.remove(5);
		  System.out.println(t);
		  
		  System.out.println(t.containsKey(2));  //true
		  System.out.println(t.containsValue("srija")); //true
		  
		 System.out.println(t.isEmpty()); //false
		 
		 System.out.println(t.keySet()); //[4, 3, 2, 1]
		 System.out.println(t.values()); // [srija, amani, kavya, swapna]
		 
		 for(int k:t.keySet()) {                              
			 System.out.println(k+" "+t.get(k));
		 }
		 
		 //Entry specific methods.....
		 
		 for(Map.Entry entry:t.entrySet()) {
			 
			 System.out.println(entry.getKey()+" "+entry.getValue());
		 }
		 
		 //iterator
		 Set s=t .entrySet();
	        
         
	        Iterator itr=s.iterator();
	        
	        while(itr.hasNext()) {
	           Map.Entry entry=(Entry) itr.next();
	           System.out.println(entry.getKey()+" "+entry.getValue());
	        }
	}
 
}

	