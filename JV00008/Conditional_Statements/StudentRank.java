//using elseif program
//A program to print the status of student marls
package Conditional_Statements;
import java.util.Scanner;
public class StudentRank 
{
  public static void main(String[] args) 
  {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the marks of Student");
	int marks= scanner.nextInt();
	if (marks>=90&&marks<=100) 
	{
		System.out.println("You got 1st Rank");
	}
	else if (marks>=80&&marks<=89)
	{
		System.out.println("you got 2nd Rank");
	}
	else if (marks>=70&& marks<=79)
	{
		System.out.println("You got 3rd Rank");
	}
	else if (marks>=60&& marks<=69)
	{
		System.out.println("You got 4th Rank");
	}
	else if (marks>=50&& marks<=59)
	{
		System.out.println("you got 5th Rank");
	}
	else if (marks>35&& marks<=49)
	{
	  System.out.println("you are jst passed");	
	}
	else if (marks>0&& marks<=35) 
	{
		System.out.println("you are failed");
	}
  }
}
