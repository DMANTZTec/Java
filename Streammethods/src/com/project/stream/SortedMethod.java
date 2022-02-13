package com.project.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortedMethod {
	
	
	public static void main(String[] args) {
		
		
	    List<Integer> list=Arrays.asList(21,10,2,10,3,4,5,6,4,7,8);
	    
	   // Optional<Integer>  distinctlistIntegers= list.distinct().collect(Collectors.toList());
	     
	    List<Integer> sortedlist = list.stream().sorted().collect(Collectors.toList());
	    
	    
	    System.out.println(sortedlist);
	    
	    List<Integer> reversesortedlist=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    
	    System.out.println(reversesortedlist);
	    
	    
	   List<String> namelist = Arrays.asList("Vamshi","Amulya","Mamatha","Swapna","Naresh","Giri","Harish");
	   
	   List<String>  sortednamelist= namelist.stream().sorted().collect(Collectors.toList());
	   
	   System.out.println( sortednamelist);
	       
	   List<String> reversesortednamelist= namelist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	   
	   System.out.println(reversesortednamelist);
	   
	   
	   
	   
	   
	    
	}

}
