import java.util.ArrayList;

public class HashMain {

	public static void main(String[] args) {
		
		class Holder<T,K>
		{
			private T key;
			private K value;
			public Holder (T key, K value) {
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
	}

}
