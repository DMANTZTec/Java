package Task_Inheritance;

public class Developer  extends Employee
	{
		String programing;

		public String getPrograming() 
		{
			return programing;
		}
		
		public void setPrograming(String programing) 
		{
			this.programing = programing;
		}
		public void work() 
		{
			System.out.println("develops the java application");
		}
}
