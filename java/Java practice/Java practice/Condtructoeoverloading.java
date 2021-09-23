class Casi
{
	int num1;
	int num2;
	String operation;
	public Casi()
	{
		num1=0;
		num2=0;
		operation="Nothing";
	}
	public Casi(int i)
	{
		num1=i;
		num2=0;
		operation="Nothing";
	}
	public Casi(int i,int j)
	{
		num1=i;
		num2=j;
		operation="Nothing";
	}
	public Casi(int i,int j,String op)
	{
		num1=i;
		num2=j;
		operation=op;
	}
}
public class Condtructoeoverloading {
	public static void main(String[] args)
	{
		Casi obj=new Casi(4,0,"Add");
		System.out.println(obj.operation);
	}
}
