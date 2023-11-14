// a program to print natural number according to user choice

package looping_Statements;
import java.util.Scanner;
public class NaturalNumbers_Fl
{
	public static void main(String[] args)
	{
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter the First number ");	
		 int n1=scanner.nextInt();
		 System.out.println("enter the second number");
		 int n2=scanner.nextInt();
		 System.out.println("the natural numbers from " +n1+ "to" +n2+ "is");
		 for (int i = n1; i <= n2; i++) 
		 {
			System.out.println(i);
		 }
		 
	}
}
