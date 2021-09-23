//Example of Abstract class and abstract and non abstract methods,constructor and even main() method

//creating abstract class 
abstract class Bike
{
	Bike()// creating constructor
	{
		System.out.println("bike is created");
	}
		abstract void run();//creating abstract method
		
		void changeGear() {//creating non abstract method
			System.out.println("Gear changed");
		}
}
class Honda extends Bike//creating child class which inherits the Abstract class
{
	void run()
	{
		System.out.println("Running safely");
	}
}	

public class Abstraction1 {

	public static void main(String[] args) {
		Bike obj=new Honda();
		obj.run();
		obj.changeGear();
		

	}

}
