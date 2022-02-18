package com.project.javastreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//anyMatch()
//allMatch()
//noneMatch()


public class StreamMethods {

	public static void main(String[] args) {
		
		Set<String> fruites=new HashSet<String>();
		fruites.add("One apple");
		fruites.add("One mango");
		fruites.add("Two apples");
		fruites.add("More grapes");
		fruites.add("Two guavas");
		fruites.add("One guava");
		
		System.out.println(fruites);
		
	
		//anyMatch
		boolean	result=fruites.stream().anyMatch(value->{return value.startsWith("One");});
		System.out.println(result);//true
		
		//allMatch
		boolean	results=fruites.stream().allMatch(value->{return value.startsWith("One");});
		System.out.println(results);//false
		
		//noneMatch
		boolean	re=fruites.stream().allMatch(value->{return value.startsWith("One");});
		System.out.println(re);//false
		
		//findAny
	    Optional<String> ele=fruites.stream().findAny();
	    System.out.println(ele.get());// More grapes
	    
	    //findFirst
	    Optional<String> ele1=fruites.stream().findFirst();
	    System.out.println(ele1.get());// More grapes
	    
	    List<String> animalsList = Arrays.asList("Dog","Cat","Elephant");
	    List<String> birdsList = Arrays.asList("peackock","parrot","crow");
	    
	    Stream<String> stream1=animalsList .stream();
	    Stream<String> stream2=birdsList .stream();
	     
	    List<String> finalList=Stream.concat(stream1,stream2).collect(Collectors.toList());
	    System.out.println(finalList);
	    for(String item: finalList)
	    {
	    	System.out.println(item);
	    }
	     
		 

	}

}
