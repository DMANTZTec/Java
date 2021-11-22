package Ammu;

public class AbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaheshPhone obj = new SureshPhone();
		obj.call();
		obj.text();
		obj.sing();
		obj.move();
	}

}
abstract class MaheshPhone //Abstract class
{
	public void call()
	{
		System.out.println("calling");
	}
    public abstract void move(); //Abstract Methods
    public abstract void sing();
    public abstract void text();
}
abstract class RameshPhone extends MaheshPhone
{
	public void move()
	{
		System.out.println("moving");
	}
}
class SureshPhone extends RameshPhone //Concrete class
{
	public void sing()
	{
		System.out.println("singing");
	}
	public void text()
	{
		System.out.println("texting");
	}
}