//using if-else program
//A program to check user age is eligible for voting or not

package Conditional_Statements;
import java.util.Scanner;
public class VoteEligibility
{
	public static void main(String[] args)
	{
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter the age");
	  int age=scanner.nextInt();
	  if(age>=18)
	  {
		  System.out.println("The User is Eligible for voting");
	  }
	  else
	  {
		  System.out.println("The User is NOT Eligible for voting");
	  }
	}

}
