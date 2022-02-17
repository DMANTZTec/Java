package filter.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	
	public static void main(String[] args) {
		
	
	List<Integer> numberList=Arrays.asList(10,15,20,25,30,44);
	List<Integer> evenNumbersList=new ArrayList<Integer>();
	
//	for(int n:numberList)
//	{
//		if(n%2==0)
//			evenNumbersList.add(n);
//		
//	}
//	System.out.println(evenNumbersList);
	
	//using streams
	
	evenNumbersList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println(evenNumbersList);
	
	// numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	
}
}
