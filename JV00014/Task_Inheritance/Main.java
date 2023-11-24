package Task_Inheritance;

public class Main 
{
	public static void main(String[] args)
	{
		Employee emp=new Employee();
		emp.setId(12);
		emp.setBasic_sal(10000.50);
		emp.setName("vamshi");
		emp.diplay();
		System.out.println("full salary of employee : " +emp.calculateFullSalary());
		
		Developer d= new Developer();
		d.setId(159);
		d.setBasic_sal(15940.25);
		d.setName("rakesh");
		d.diplay();
		System.out.println("full salary of Developer : " +d.calculateFullSalary());
		Team_Lead t= new Team_Lead();
		t.setId(258);
		t.setBasic_sal(12571.45);
		t.setName("ganesh");
		t.diplay();
		System.out.println("full salary of TL : " +t.calculateFullSalary());
		
	}

}
