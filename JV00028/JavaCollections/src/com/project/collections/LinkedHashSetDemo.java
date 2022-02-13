package com.project.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String args[]) {
		
		//HashSet lset=new HashSet();
		LinkedHashSet lset=new LinkedHashSet();
		
		lset.add(100);
		lset.add(200);
	    lset.add(300);
		lset.add(400);
	    lset.add(500);
		lset.add(600);
		//System.out.println("HashSet"+lset);//[400,100,500,200,600,300]
		
		System.out.println("LinkedHashSet"+lset); //[100,200,300,400,500,600]
		
	
		
		
	}

}
