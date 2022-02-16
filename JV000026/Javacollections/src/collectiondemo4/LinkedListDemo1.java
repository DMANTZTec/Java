package collectiondemo4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		// LinkedList l=new LinkedList();
		// LinkedList<Integer> l=new LinkedList();
		List l = new LinkedList();
		l.add(100);
		l.add("kiran");
		l.add('J');
		l.add(true);
		System.out.println(l);
		System.out.println(l.size());
		// sublist
		List al = l.subList(0, 1);
		System.out.println(al);
		// remove
		l.remove(1);
		System.out.println(l);
		// removing by object
		l.remove("kiran");
		System.out.println("after removing element" + l);
        //		l.addAll(al);
     //		System.out.println(l);
		l.add(1, 2);
		System.out.println("After inserting element" + l);
         //retriving object
		System.out.println("getting specified object" + l.get(2));
		// replacing
		System.out.println("after replacing" + l.set(1, "raju"));
		// contains
		System.out.println(l.contains("java"));
		//isEmpty
		System.out.println(l.isEmpty());
		System.out.println();
		//using for loop
		System.out.println("using for loop");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println();
		//using for each loop
		System.out.println("using for each loop");
		for(Object e:l)
		{
			System.out.println(e);
		}
		//using iterator
		System.out.println();
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
