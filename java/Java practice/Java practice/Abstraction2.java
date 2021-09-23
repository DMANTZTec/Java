abstract class Bike
{
    Bike()
	{
		System.out.println("Bike is created");
	}
	abstract void run();
	void Gearchange()
	{
		System.out.println("Gear is changed");
	}
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("running safely");
	}
}
public class Abstraction2 {
    public static void main(String[] args)
    {
    	Bike obj=new Honda();
    	obj.run();
    	obj.Gearchange();}
}
