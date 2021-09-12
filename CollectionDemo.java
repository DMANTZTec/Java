package com.collections;
import java.util.*;
/* How to store group of elements using Listinterface(ArrayList) and different methods to print output*/
public class CollectionDemo {

	public static void main(String[] args) {
	
		List<String> arr=new ArrayList<>();
		arr.add("Swapna");
		arr.add("Narender");
		arr.add("Nihal");
		arr.add("Prajwal");
		arr.add("kavya");
		arr.add("swathi");
		/*arr.add(2);
		arr.add(3.14);
		System.out.println(arr);
		
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}*/
		
		
		ListIterator<String> itr=arr.listIterator();
		System.out.println(" in forward Direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("---------------------------------------");
		System.out.println(" in Reverse Direction");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
			
		}
		System.out.println("---------------------------------------");
			Iterator itrr=arr.iterator();
			while(itrr.hasNext())
			{
				System.out.println(itrr.next());
			}
		System.out.println("---------------------------------------");
		arr.forEach(a->{
			System.out.println(a);
		});
		System.out.println("---------------------------------------");
		Iterator<String> itre=arr.iterator();
		itre.forEachRemaining(a->{
			System.out.println(a);
		});
	}

}










/*output of program:
 *  in forward Direction
Swapna
Narender
Nihal
Prajwal
kavya
swathi
---------------------------------------
 in Reverse Direction
swathi
kavya
Prajwal
Nihal
Narender
Swapna
---------------------------------------
Swapna
Narender
Nihal
Prajwal
kavya
swathi
---------------------------------------
Swapna
Narender
Nihal
Prajwal
kavya
swathi
---------------------------------------
Swapna
Narender
Nihal
Prajwal
kavya
swathi*/
