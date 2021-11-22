package Ammu;

public class AbstractDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Iphone obj= new Iphone();
		Samsung obj1= new Samsung();
		show(obj1);
	}
	public static void show (Phone obj)
	{
		obj.showConfig();
	}

}
abstract class Phone
{
	public abstract void showConfig();
	
}
class Iphone extends Phone
{
	public void showConfig()
	{
		System.out.println("128gb,IOS 14");
	}
}
class Samsung extends Phone
{
	public void showConfig()
	{
		System.out.println("256gb,Android 10");
		
	}
}