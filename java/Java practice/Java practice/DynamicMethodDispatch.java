class ABC
{
	public void show()
	{
		System.out.println("In ABC");
	}
}
class BCA extends ABC
{
	public void show()
	{
		System.out.println("In BCA");
	}
	
}
class DAC extends ABC
{
	public void show()
	{
		System.out.println("In DAC");
	}
	
	
}

public class DynamicMethodDispatch {
	
	public static void main(String[] args)
	{
		ABC obj1=new BCA();
		 obj1.show();
		 obj1=new DAC();
		 obj1.show();
	}

}
