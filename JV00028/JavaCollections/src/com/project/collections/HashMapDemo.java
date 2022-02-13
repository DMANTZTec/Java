package com.project.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		  
		//HashMap hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(3, "Kafka");
		hm.put(4, "Angular");
		hm.put(5, "Springboot");
		hm.put(3, "Tableu");
		hm.put(6, "Java");
		
		//System.out.println(hm); //{1=Java, 2=Python, 3=Kafka, 4=Angular, 5=Springboot}
		System.out.println(hm);//{1=Java, 2=Python, 3=Tableu, 4=Angular, 5=Springboot, 6=Java}
		
		System.out.println(hm.get(4)); //Angular
		
		hm.remove(6);
		System.out.println(hm); //{1=Java, 2=Python, 3=Tableu, 4=Angular, 5=Springboot}
		
        System.out.println(hm.containsKey(2)); //true
        System.out.println(hm.containsValue("Springboot")); //true
        
        System.out.println(hm.containsValue("Swapna")); //false
        
        System.out.println(hm.isEmpty()); //false
        
        System.out.println( hm.keySet());//[1, 2, 3, 4, 5]
        System.out.println(hm.values());//[Java, Python, Tableu, Angular, Springboot]
        System.out.println(hm.entrySet());// [1=Java, 2=Python, 3=Tableu, 4=Angular, 5=Springboot]
        
        for(Entry<Integer, String> i:hm.entrySet()) {
        	System.out.println(i);
        }
        for(int i:hm.keySet()) { 
        	System.out.println(i +"="+hm.get(i));
        }
        
        //Entry Methods
        for(Map.Entry entry:hm.entrySet())
        {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //iterator
        
        Set s=hm.entrySet();
        
         
        Iterator itr=s.iterator();
        
        while(itr.hasNext()) {
           Map.Entry entry=(Entry) itr.next();
           System.out.println(entry.getKey()+" "+entry.getValue());
        }

	}
	
	
}
