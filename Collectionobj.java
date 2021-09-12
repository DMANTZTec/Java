/*
 * How to store group of objects( Employee ) using Listinterface(ArrayList)
 */



package com.collections;
import java.util.*;
class Employee
{
	int id;
	String name,address;
	
	Employee(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
}
public class Collectionobj {

	public static void main(String[] args) {

         Employee e1=new Employee(1,"Swapna","Nalgonda");
         Employee e2=new Employee(2,"Mamatha","Munugodu");
         Employee e3=new Employee(3,"Amulya","Nalgonda");
         Employee e4=new Employee(4,"Harish","Nalgonda");
         Employee e5=new Employee(5,"Vamshi","Kattangur");
         Employee e6=new Employee(6,"Giridhar","Nalgonda");
         Employee e7=new Employee(7,"Naresh","Nalgonda");
         Employee e8=new Employee(8,"Suresh","Tipparthi");
         List<Employee> list=new ArrayList<>();
          list.add(e1);
          list.add(e2);
          list.add(e3);
          list.add(e4);
          list.add(e5);
          list.add(e6);
          list.add(e7);
          list.add(e8);
          
          for(Employee E:list)
          {
        	  System.out.println(E.id+" "+E.name+" "+E.address);
          }
          
         
	}

}

/*output:

1 Swapna Nalgonda
2 Mamatha Munugodu
3 Amulya Nalgonda
4 Harish Nalgonda
5 Vamshi Kattangur
6 Giridhar Nalgonda
7 Naresh Nalgonda
8 Suresh Tipparthi
*/

















