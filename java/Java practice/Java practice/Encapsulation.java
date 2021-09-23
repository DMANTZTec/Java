class Student
{
	int rollno;
	String name;
	
	public int getRollno()
	{
		System.out.println("user is accessing the value");
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
		System.out.println("the value is changed");
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}	
}



public class Encapsulation {

	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.setRollno(23);
        s1.setName("Swapna");

        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
        
	}

}
