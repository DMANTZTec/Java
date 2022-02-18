package map.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2);
		List<Integer> list2=Arrays.asList(3,4);
		List<Integer> list3=Arrays.asList(5,6);
		
		List<List<Integer>>finalist=Arrays.asList(list1,list2,list3);//list of objects
		 
		
		List<Integer> finalresults=finalist.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
		
		System.out.println(finalresults);		
	}

}
