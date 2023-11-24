package Example_oops;
//Print the average of three numbers entered by user by creating a class named
//'Average'having a method to calculate and print the average.
import java.util.Scanner;
class Average
{
	public int calculate(int a, int b,int c) 
	{
		int sum=a+b+c;
		int result=sum%3;
		return result;
	}

  public static void main(String[] args)
  {
    Average av=  new Average();
    System.out.println("the average of 3 number :"+av.calculate(15, 5, 1));
  }
}
