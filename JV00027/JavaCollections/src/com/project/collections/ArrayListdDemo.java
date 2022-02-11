package com.project.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListdDemo {
	
	public static void main(String[] args) {
	  //declare arraylist
      //ArrayList<Integer> al=new ArrayList<Integer>();
      //ArrayList<String> str=new ArrayList<String>();
      ArrayList al=new ArrayList();
		
      //add new elements to the arraylist
      al.add(101);
      al.add("swapna");
      al.add(15000.00);
      al.add(true);
      System.out.println(al);
      for(Object name:al) {
    	  
    	  System.out.println(name);
    	  
      }
      
      //size
      System.out.println("No of elements in list:"+al.size());
      //remove
      System.out.println(al.remove(1)); //here 1 is an index
      al.remove(15000.000);// here 15000.00 is an object
      System.out.println(al);
      
      //insert a new element
      //add(index,object)
      al.add(1,"Mamatha");
      System.out.println("After inserting"+al);
      
      //retreive specific element
      System.out.println(  al.get(2));
      
      //change element/replace
      al.set(2, 15000.00);
      al.add("Angular");
      System.out.println("After replacing ang inserting"+al);
      
      //search-contains() - Return true/false
      System.out.println(al.contains("Mamatha"));
      System.out.println(al.contains("Swapna"));
      
      //isEmpty
      
       System.out.println(al.isEmpty());  
       
       // Reading elements using for-loop
       
//       for(int i=0;i<al.size();i++) {
//    	   
//    	   System.out.println(al.get(i));
//       }
       
       //Reading elements using for..each loop
       
//       for(Object i:al ) {
//    	   
//    	   System.out.println(i);
//    	   
//       }
      // Reaing elements using iterator() method    
       
       Iterator it=al.iterator();
       while(it.hasNext())
       {
    	  System.out.println(it.next()); //printing the element and move to next
       }
       // removeAll method used to remove elements at a time   
       al.removeAll(al);
       System.out.println(al);
       
       // using addAll() one group of collection is add to another collection
       al.add(101);
       al.add("swapna");
       al.add(15000.00);
       al.add(true);
       System.out.println(al);
       
       ArrayList al_dup= new ArrayList();
       al_dup.addAll(al);
       System.out.println("Using addAll method:"+al_dup);
       
        //sort ... Collections.sort() 
       ArrayList sortedlist= new ArrayList();
       sortedlist.add(1);
       sortedlist.add(20);
       sortedlist.add(13);
       sortedlist.add(5);
       sortedlist.add(99);
       sortedlist.add(23);
       System.out.println("Before sorting:"+sortedlist);
       Collections.sort(sortedlist);
       System.out.println("After sorting:"+sortedlist);
       Collections.sort(sortedlist,Collections.reverseOrder());
       System.out.println("After sorting in reverse order"+sortedlist);
       
       //Shuffle 
       Collections.shuffle(sortedlist);
       System.out.println("After shuffling:"+sortedlist);
       Collections.shuffle(sortedlist);
       System.out.println("After shuffling:"+sortedlist);
       
       // convert Array into ArrayList
       
       String arr[] = {"Swapna","Amulya","Vamshi"};
       
       for(String value:arr)
       {
    	   System.out.println(value);
    		   
       }
       ArrayList arraylist = new ArrayList(Arrays.asList(arr));
       System.out.println(arraylist);
       
     }
	}


/* Output
[101, swapna, 15000.0, true]
101
swapna
15000.0
true
No of elements in list:4
swapna
[101, true]
After inserting[101, Mamatha, true]
true
After replacing ang inserting[101, Mamatha, 15000.0, Angular]
true
false
false
101
Mamatha
15000.0
Angular
[]
[101, swapna, 15000.0, true]
Using addAll method:[101, swapna, 15000.0, true]
Before sorting:[1, 20, 13, 5, 99, 23]
After sorting:[1, 5, 13, 20, 23, 99]
After sorting in reverse order[99, 23, 20, 13, 5, 1]
After shuffling:[5, 20, 99, 23, 13, 1]
After shuffling:[99, 13, 20, 5, 23, 1]
Swapna
Amulya
Vamshi
[Swapna, Amulya, Vamshi]  */
