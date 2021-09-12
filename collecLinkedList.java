package com.collections;
import java.util.*;
class Student
{
	int rollno;
	String name;
	
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public String toString()
	{
		return " "+rollno+" "+name;
	}
}
public class collecLinkedList {

	public static void main(String[] args)
	{
		LinkedList<Student> ll=new LinkedList<>();
		Student s1=new Student(1,"Nihal");
		ll.add(s1);
		ll.add(new Student(2,"Sathwik"));
		Iterator<Student> itr=ll.iterator();
				{
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
				}
	}
}
