package collectiondemo6;

import java.util.HashSet;

public class HasgsetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		System.out.println(hs);
		HashSet hs2=new HashSet();
		hs2.add(2);
		hs2.add(4);
		hs2.add(6);
		System.out.println(hs2);
		//union
		hs.addAll(hs2);
		System.out.println(hs);
		//intersection
		hs.retainAll(hs2);
		System.out.println(hs);
		//difference
		hs.removeAll(hs2);
		System.out.println(hs);

	}

}
