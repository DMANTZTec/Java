import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		class Holder<K,V>
		{
			private K key;
			private V value;
			public Holder (K key, V value) {
				this.key=key;
			    this.value= value;
				
			}
		}
		
		Holder<Integer, String> h1= new Holder<Integer,String>(10,"Bob");
		Holder<Integer, String> h2= new Holder<Integer,String>(20,"Willy");
		Holder<Integer, String> h3= new Holder<Integer,String>(30,"Eilly");
		Holder<Integer, String> h4= new Holder<Integer,String>(40,"Emily");
		Holder<Integer, String> h5= new Holder<Integer,String>(50,"Samantha");
		
		ArrayList<Holder<Integer, String>> list= new ArrayList<>();
		list.add(h1);
		list.add(h2);
		list.add(h3);
		list.add(h4);
		list.add(h5);
		
		int desiredId = 30;
		System.out.println(list);
		for(Holder<Integer,String> li: list)
		{
			if(li.key== desiredId)
			{
				System.out.println(li.value);
				break;
			}
			
		}
		
		HashMap<Integer,String> schoolRecords = new HashMap<Integer,String>();
		schoolRecords.put(10,"Bob");
		
		schoolRecords.put(20,"Willy");
		schoolRecords.put(30,"Samantha");
		
		String studentName = schoolRecords.get(20);
		if(studentName!= null)
		{
			System.out.println(studentName);
		}
		else {
			System.out.println("we couldn't find a student for that id");
		}
	}

	}


