class AB
{
	public void show()
	{
		System.out.println("In AB");
	}
}
class BC extends AB
{

	public void show()
	{
	
		//System.out.println("In BC");
	}
}
public class overriding {

	public static void main(String[] args) {
		
		BC obj=new BC();
		obj.show();
		

	}

}
