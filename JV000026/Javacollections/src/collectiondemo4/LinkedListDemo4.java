package collectiondemo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


class Student {
	int studentId;
	String studentName;
	int age;
	String Adress;

	public Student(int studentId, String studentName, int age, String adress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		Adress = adress;
	}

}


class LinkedListDemo4 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "vamshi", 22, "nalgonda");
		Student s2 = new Student(2, "kiran", 23, "nalgonda");
		Student s3 = new Student(3, "raji", 23, "nalgonda");
		LinkedList<Student> al = new LinkedList();
		al.add(s1);
		al.add(s3);
		al.add(s2);
		// using iterators
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.studentId + " " + st.studentName + " " + st.age + " " + st.Adress);
		}
		// using for each loop
		for (Student st : al) {
			System.out.println(st.studentId + " " + st.studentName + " " + st.age + " " + st.Adress);
		}
	
	}

		
	

}