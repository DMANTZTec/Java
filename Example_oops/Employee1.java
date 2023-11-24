package Example_oops;

public class Employee1
{
	private String name;
	private int id;
	private double sal;
	private int hours;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public double getSal()
	{
		return sal;
	}
	public void setSal(double sal) 
	{
		this.sal = sal;
	}
	public int getHours()
	{
		return hours;
	}
	public void setHours(int hours) 
	{
		this.hours = hours;
	}

	public Employee1 AddSal()
	{
		if(this.sal>=500 )
		{
			this.sal=getSal()+83;
			
		}
		if(this.hours>6)
		{
			this.sal=getSal()+500;
		}
		
		return display();
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", id=" + id + ", sal=" + sal + ", hours=" + hours + "]";
	}
	public Employee1 display()
	{
		Employee1 emp=new Employee1();
		emp.setHours(this.hours);
		emp.setId(this.id);
		emp.setName(this.name);
		emp.setSal(this.sal);
		
		return emp;
		
	
	}
}
