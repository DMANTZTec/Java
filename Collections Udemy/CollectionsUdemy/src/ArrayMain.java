package com.project.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayMain {

	public static void main(String[] args) {
		 
		
//		String[] items= {"Swapna","Amulya","Vamshi"};
//		
//		for(String item:items) {
//			
//			System.out.println(item);
//		}
//		String[] copy=items;
//		items=new String[4];
//		
//		for(int i=0; i<copy.length; i++) {
//			items[i]=copy[i];
//		}
//		items[3]="Fourth Item";
//		for(String str:items)
//		{
//			System.out.println(str);
//		}
//		items[4]= "Fifth Item";
		
		ArrayList<String> arrayList=new ArrayList<String>();
		 arrayList.add("Swapna");
		 arrayList.add("Kavya");
		 arrayList.add("Amani");
		 Collections.sort( arrayList, new Comparator<String>()
		 {

			@Override
			public int compare(String o1, String o2) 
			{
				if(o1.charAt(0)<o2.charAt(0)) {
					return -1;	
				}
				else
				{
					return 1;
				}
				
			}
			 
		 });
		 
		 for(Object name: arrayList) {
			 System.out.println(name);
		 }
		
		
	

	}

}
