package collectiondemo7;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet ls=new LinkedHashSet();
		ls.add(1);
		ls.add("kiran");
		ls.add(1.90);
		ls.add(true);
		System.out.println(ls);
		//using forEach loop
		for(Object e:ls)
		{
			System.out.println(e);
		}
		//using iterators
		Iterator itr=ls.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}

	}

}
