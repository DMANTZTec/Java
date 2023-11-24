package Example_oops;

public class Test_Employee 
{
	public static void main(String[] args) 
	{
		Employee1 emp1= new Employee1();
         emp1.setName("bhavani");
         emp1.setHours(6);
         emp1.setId(159);
         emp1.setSal(745.25);
         System.out.println(emp1.AddSal().toString());

	}

}
