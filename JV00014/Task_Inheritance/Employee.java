package Task_Inheritance;

public class Employee
{

	private int id;
	private String name;
	private double basic_sal;
	

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getBasic_sal() 
	{
		return basic_sal;
	}
	public void setBasic_sal(double basic_sal) 
	{
		this.basic_sal = basic_sal;
	}
	public void diplay() 
	{
		System.out.println("Employee id:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Basic salary :"+basic_sal);
	}
	public double calculateFullSalary() 
	{
		double ful_Sal=basic_sal*0.1+basic_sal;
		return ful_Sal;
	}
}

