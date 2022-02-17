package collectiondemo9;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap m=new HashMap();
		HashMap<Integer,String> m=new HashMap();
		m.put(1, "vamshi");
		m.put(2, "kiran");
		m.put(3, "amulya");
		m.put(4, "swapna");
//		m.put(5, 80);
		m.put(3, "naresh");
		
		System.out.println(m);
		//getting by key
		System.out.println(	m.get(1));
		//removing by key
		m.remove(2);
		System.out.println(m );
		System.out.println(m.containsKey(9));
		System.out.println(m.containsValue("naresh"));
		System.out.println(m.isEmpty());
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet() );
		//using foreach
		for(Object i:m.keySet())
		{
			System.out.println(i);
		}
		 //geting values using foreach
		for(Object i:m.values())
		{
			System.out.println(i);
		}
	//getting entry using for each
		for(Object i:m.keySet())
		{
			System.out.println(i+":"+m.get(i));
		}
		//entry methods
  		for(Map.Entry entry:m.entrySet())
  		{
  			System.out.println(entry.getKey()+" "+entry.getValue());
  		}
  		

	}

}
