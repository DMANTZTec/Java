package Operators;
import java.util.Scanner;
public class Sample 
{ 
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);	
	//Arthematic oprator
		System.out.println("Enter the first number");
		int a=scanner.nextInt();
		System.out.println("Enter the second number");
		int b=scanner.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
		
	// Relational operator
		int c=5;
		int d=9;
		System.out.println(c<d);
		System.out.println(c>d);
		int e=12;
		int f=9;
		System.out.println(e<=f);
		System.out.println(e>=f);
		System.out.println(e!=f);
		System.out.println(e==f);
	//logical operator
		int g=8;
		int h=10;
		System.out.println(g<5&& h>15);
		System.out.println(g<h || g<9);
	//conditional opeartor
		//a program to find largest number from given 2 numbers
		int n1=10;
		int n2=6;
		int large=(n1>n2)? n1:n2;
		System.out.println(large);
	//increment and decrement
		int l1=6;
		int l2=l1++;
		System.out.println(l2);
	}

}
