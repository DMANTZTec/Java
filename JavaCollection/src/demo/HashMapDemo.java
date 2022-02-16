package demo;

import java.util.HashMap; 
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;


public class HashMapDemo {
	
	public static void main(String[] args) {
		
		//HashMap m =new HashMap();
		HashMap <Integer,String> m=new HashMap<Integer,String>();
		
		m.put(101, "Amulya");
		m.put(103, "ALEKHYA");
		m.put(106, "w");
		
		System.out.println(m);
		System.out.println(m.get(103));
		
		m.remove(106);
		
		System.out.println(m.containsKey(101));
		System.out.println(m.containsValue("Amulya"));
		System.out.println(m.containsValue("w"));
		
		System.out.println(m.keySet());
		
		for(Object i:m.keySet())
		{
			System.out.println(i);
		}
		System.out.println(m.values());
		
		for(Object i:m.values())
		{
			System.out.println(i);
		}
		
		for(Object i:m.keySet())
		{
			System.out.println(i+"  "+m.get(i));
		}
		//System.out.println(m.entrySet());
		
		//Entry methods
		
//		for(Entry entry:m.entrySet())
//		{
//			System.out.println(entry.getKey()+"  "+entry.getValue());
//		}

		
		//iterator()
		Set s= m.entrySet();
		Iterator itr=s.iterator();
		
		
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry)  itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
		
		
		
		
	}

}
