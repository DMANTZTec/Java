package collectiondemo4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkeListDemo2 {
	public static void main(String[] args)
	{
		String a[]= {"K","R","T"};
		LinkedList l=new LinkedList(Arrays.asList(a));
		l.add("B");
		l.add("C");
		l.add("X");
		l.add("D");
		l.add("E");
		l.add("F");
		LinkedList l2=new LinkedList();
		l2.addAll(l);
		System.out.println(l);
		//sorting
		System.out.println("befor sorting"+l);
		Collections.sort(l);
		System.out.println("after sorting"+l);
		//reverse orde
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		//shuffling
		Collections.shuffle(l);
		System.out.println("after shuffling"+l);


		
	}

}
