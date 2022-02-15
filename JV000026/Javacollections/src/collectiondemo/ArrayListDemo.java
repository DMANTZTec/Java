package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(28);
		al.add("");
		al.add(23.4);
		al.add(true);
		al.add('a');
		System.out.println(al);
		System.out.println("number of elements in array list:" + al.size());
		al.remove(1);
		System.out.println(al);
		al.add(2, "java");
		System.out.println("after insertion:" + al);
		System.out.println(al.get(2));// retrieving specific element
		al.set(1, "python");// replace element
		System.out.println("After replacing element" + al);
		System.out.println(al.contains("java"));// searching element
		System.out.println(al.contains("vamshi"));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		// 1)for loop
		System.out.println("reading elements using for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("using for each loop");
		for (Object e : al) {
			System.out.println(e);
		}
		System.out.println("using iterator");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
