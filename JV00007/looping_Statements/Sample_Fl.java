//A PROGRAM TO PRINT USERNAME AND USERDEFINED TIMES 


package looping_Statements;
import java.util.Scanner;
public class Sample_Fl 
{
  public static void main(String[]args)
  {
	 Scanner scan= new Scanner(System.in);
	 System.out.println("Enter the user Name");
	 String name=scan.next();
	 System.out.println("how many times you wantto print your name  ");
	  int num=scan.nextInt();
	     for(int i=1;i<=num;i++)
	     {
		     System.out.println(name);  
	     }
   }
}
