package filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Integer> list=Arrays.asList(12,11,76,89,99,66,89);
		List<Integer> evenNumberList=new ArrayList();
		List<Integer> evenNumberList2=new ArrayList();
		//witho streams
		for(int i:list)
		{
			if(i%2==0)
			{
				evenNumberList.add(i);
			}
			
		}
		System.out.println("without streams"+evenNumberList);
		//with streams
		evenNumberList2=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("with streams"+evenNumberList2);
		//using for each loop
		    list.stream().filter(n->n%2==0).forEach(n->System.out.println("using for each loop"+n));
		list.stream().filter(n->n%2==0).forEach(System.out::println);

	}

	

}
