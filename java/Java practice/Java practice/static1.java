class Emp1
{
	int eid;
	int salary;
	static String ceo;
	public Emp1()
	{
	eid=1;
	salary=9799;
	
	}
	static 
	{
		ceo="hdgaufjg";
		System.out.println("in static");
	}
	public void show() 
	{
		System.out.println(eid+":"+salary+":"+ceo);
		System.out.println("in constructor");
	}
}
public class static1 {
	public static void main (String[] args)
	{
		Emp1 Swapna=new Emp1();
		Emp1 Naresh=new Emp1();
		Swapna.show();
		Naresh.show();
	}

}
