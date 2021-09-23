//Implementation of abstract method and abstract class


abstract class Bank//create Abstract class for Bank
{
	abstract double getRateOfInterest();//create abstract method and it does'not have implementation
}
class SBI extends Bank//creating  child class and inherits parent class
{
	 double getRateOfInterest()//method to return the RateOfInterest of SBI
	{
		return 7.5;
	}
}
	class HDFC extends Bank//creating child class and inherits Abstract class

	{
		 double getRateOfInterest()//method to return the RateOfInterest of SBI		
		 {
			return 8;
		}
	}


	
//Creating Abstraction class which calls abstract and non abstract methods
public class Abstraction {

	public static void main(String[] args) {
		
Bank b;
b=new SBI();
System.out.println("RateOfInterest is :"+b.getRateOfInterest()+"%");       
b=new HDFC();
System.out.println("RateOfInterest is :"+b.getRateOfInterest()+"%");


	}

}
