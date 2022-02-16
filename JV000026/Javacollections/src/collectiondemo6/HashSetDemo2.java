package collectiondemo6;

import java.util.HashSet;

public class HashSetDemo2 {
   public static void main(String[] args) {
	   HashSet hs=new HashSet();
		hs.add(10);
		hs.add(2);
		hs.add(4);
		hs.add(6);
		System.out.println(hs);
		HashSet hs2=new HashSet();
		hs2.addAll(hs);
		hs2.add(16);
		System.out.println(hs2);
   }


}
