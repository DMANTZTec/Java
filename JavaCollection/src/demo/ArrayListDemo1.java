package demo;
import java.util.ArrayList;

public class ArrayListDemo1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//ArrayList <Integer> al=new ArrayList<Integer>();
			//ArrayList <String> al=new ArrayList<String>();
			//List al = new ArrayList();
			ArrayList al=new ArrayList(); //declare ArrayList
			
	        // Add new elements to the arraylist
			al.add(100);
			al.add("welcome");
			al.add(10.8);
			al.add(true);
			al.add('a');
			System.out.println(al);
			
			//size()
			System.out.println("Number of elements:"+al.size());
			
			//remove
			al.remove(3); //3 is the index
			al.remove(true);
			System.out.println("after removing elements:"+al +" " +al.size());
			
			//insert a new element
			//add(index,object)
			al.add(3,"Java");
			System.out.println("after adding elements:"+al +" " +al.size());
			
			//retrieve specific element
			System.out.println(al.get(2));
			
			//change element or replace
			al.set(2, "Python");
			System.out.println("after replacing elements:"+al +" " +al.size());
			
			
			//for loop
			System.out.println("after looping elements:"+al);
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
			}
			
			//adding all into arraylist
			ArrayList al_dup=new ArrayList();
			al_dup.addAll(al);
			System.out.println("adding all"+al_dup);
			al_dup.removeAll(al);
			System.out.println("afterremoving"+al_dup);
			
			
			
		}

	}

