class A
{
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("in A int");
	}
}	
class B extends A
{
	public B()
	{
		super(6);
		System.out.println("in B");
	}
	public B(int i)
	{
		super();
		System.out.println("in B int");
	}
}
	
public class SuperDemo {

	public static void main(String[] args)
	{
		
		B obj=new B(5);
		
		
	}

}
