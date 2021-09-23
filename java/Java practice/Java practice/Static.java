class Emp
{
	int eid;
	 int salary=2000;
	 static String ceo;
	public void show()
	{
	System.out.println(eid+":"+salary+":"+ceo);
    }
}
public class Static
    {

	public static void main(String[] args)
	{
		Emp swapna =new Emp();
	    swapna.eid=687;
	    swapna.salary=4000;
	    Emp.ceo="Shathikumar";
	    Emp Naresh =new Emp();
	    Naresh.eid=787;
	    Naresh.salary=5000;
	    Emp.ceo="Shathikumar";
	    
	    
	    Emp.ceo="Kalpana";
	    //Emp.salary=7000;
	    swapna.show();
	    Naresh.show();
	    
	    }
}
