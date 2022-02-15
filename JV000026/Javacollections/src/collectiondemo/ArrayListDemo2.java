package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("B");
		al.add("Z");
		al.add("D");
		al.add("M");
		System.out.println(al);
		ArrayList al1 = new ArrayList();
		System.out.println(al1.addAll(al));
		System.out.println(al1);
		al1.removeAll(al);
		// sorting
		System.out.println("elements in array" + al1);
		Collections.sort(al);
		System.out.println("after sorting " + al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("after revers" + al);
		// shuffling
		Collections.shuffle(al);
		System.out.println("after shuffling" + al);
 
	}

}
