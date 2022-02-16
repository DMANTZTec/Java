package collectiondemo6;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
       HashSet hs=new HashSet();
		//HashSet hs=new HashSet(100,(float)0.90);
       hs.add(100);
       hs.add("welcome");
       hs.add(19.0);
       hs.add(100);
       hs.add(true);
       System.out.println(hs);
       //remove
       hs.remove(100);
       System.out.println(hs);
       //contains
       System.out.println(hs.contains(100));
       for(Object h:hs)
       {
    	   System.out.println(h);
       }
       Iterator it=hs.iterator();
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
      
       
       
		
	}

}
