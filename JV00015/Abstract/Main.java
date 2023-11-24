package Abstract;

public class Main
{
  public static void main(String[] args) 
  {
	Circle c= new Circle();
	c.setRadius(8.5);
	System.out.println("circle area "+c.caculateArea());
	Square s= new Square();
	s.setSide(2.8);
	System.out.println("Square area "+s.caculateArea());
	Triangle t= new Triangle();
	t.setBase(4.5);
	t.setHeight(3.6);
	System.out.println("Triangle  area "+t.caculateArea());
  }
}