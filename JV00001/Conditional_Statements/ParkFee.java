//using switch
// A program to print the entry fee of the park based on the gender
package Conditional_Statements;
import java.util.Scanner;
public class ParkFee 
{
 public static void main(String[] args) 
 {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Gender");
	String gender=scanner.next();
	switch (gender)
	{
		case "m": case "M":System.out.println("entry fee is 100");
	    break;
		case "f":case "F":System.out.println("entry fee is 80");
		break;
		case "s":case "S":System.out.println("entry fee is 50");
		break;
		case "t":case "T":System.out.println("entry fee is 25");
		break;
		case "c":case "C":System.out.println("entry fee is free");
		break;
		default:System.out.println("please enter the valid data");
			break;
	}
 }
}
