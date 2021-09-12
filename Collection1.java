package com.collections;

import java.util.*;


public class Collection1 {
public static void main(String[] args)
{

	List<String> arr=new ArrayList<>();
	  arr.add("Naresh");
	  arr.add("Giridhar");
	  arr.add("Mamatha");
	  arr.add("Harish");
	  arr.add("harish");
	  arr.add("Vamshi");
	  arr.add("Amulya");
	  arr.add("Suresh");
	  arr.add(3,"Rakesh");
	  arr.add(2,"Swapna");
	  arr.add("Kalpana");
	  arr.sort(Comparator.naturalOrder());
	  System.out.println(arr);
	  System.out.println(arr.subList(2, 6));
	  
	 List<String> arr1=new ArrayList<>();
	  arr1.add("Kavya");
	  arr1.add("Amani");
	   arr1.clear();
	  arr1.add("Chandana");
	  arr1.add("Divya");
	  arr1.add("Kavya");
	  arr1.add("Amani");
	  arr1.add("Srija");
	  arr1.add("Kavya");
	  arr1.add("Amani");
      arr1.addAll(3,arr);
      System.out.println(arr1.lastIndexOf("Divya"));
      System.out.println(arr1.lastIndexOf("Amani"));
      System.out.println(arr1.contains("Srija"));
	  List<String> arr2=new ArrayList<>();
	  
	  arr2.add("Naresh");
	  arr2.add("Giridhar");
	  arr2.add("Mamatha");
	  arr2.add("Harish");
	  arr2.add("Vamshi");
	  arr2.add("Amulya");
	  arr2.add("Suresh");
	  arr2.add(3,"Rakesh");
	  arr2.add(2,"Swapna");
	  arr2.sort(String.CASE_INSENSITIVE_ORDER);
	  arr2.remove(0);
	  System.out.println(arr2);
	  System.out.println(arr.equals(arr2));
	  System.out.println(arr1.isEmpty());
	  System.out.println(arr1.indexOf("Giri"));
	   
	  
	  
   for(int i=0;i<arr.size();i++)
     {
    	 System.out.println(arr.get(i));
     }
   System.out.println();
   for(int i=0;i<arr2.size();i++)
   {
  	 System.out.println(arr2.get(i));
   }

	  
}
}
