interface Printable1
{
	void print();
}
interface Showable
{
	void print();
}
class A7 implements Printable1,Showable
{
	public void print()
	{
		System.out.println("Hello");
	    	
	}
}
public class Multipleinheritance {
        
	public static void main(String[] args)
	{
		A7 obj=new A7();
		obj.print();
	}
}
