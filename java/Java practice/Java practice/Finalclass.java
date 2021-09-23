class Var
{
	public void show()
	{
		System.out.println("I am in Var");
	}
}
class Var1 extends Var
{
	public void show()
	{
		System.out.println("I am in Var1");
	}
}
public class Finalclass {
	public static void main(String[] args)
	{
		Var obj=new Var1();
		obj.show();
	}

}
