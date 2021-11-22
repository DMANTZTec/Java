package Ammu;

public class Student {
	String name;
	int rno;
	Student()
	{
		name = "AMULYA";
		rno = 123;
		
	}
	Student(String str,int n)
	{
		name = str;
		rno = n;
		
	}

	public static void main(String[] args) {
		Student S1 = new Student();
		Student S2 = new Student("Suresh",456);
		System.out.println(S1.name);
		System.out.println(S1.rno);
		System.out.println(S2.name);
		System.out.println(S2.rno);
		

	}

}
