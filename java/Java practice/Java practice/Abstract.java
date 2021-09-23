
 abstract class Shape
{
	abstract void draw();
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing Rectangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("drawing Circle");
	}
}
public class Abstract
{
	public static void main(String[] args)
	{
		Shape obj=new Circle();
		Shape obj1=new Rectangle();
		obj.draw();
		obj1.draw();
}
}