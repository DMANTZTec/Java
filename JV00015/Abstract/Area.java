package Abstract;

abstract public class Area 
{
 abstract public double caculateArea();
}
class Triangle extends Area
{
	private double base;
	private double height;
	public double getBase()
	{
		return base;
	}
	public void setBase(double base) 
	{
		this.base = base;
	}
	public double getHeight() 
	{
		return height;
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	public double caculateArea()
	{
		double result =0.5*base*height;
		return result;
	}
}
class Circle extends Area
{
	private double radius;

	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double caculateArea()
	{
	  	double result= 3.14*this.radius*this.radius;
	  	return result;
	}
	 
}
class Square extends Area
{
	double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side)
	{
		this.side = side;
	}

	@Override
	public double caculateArea() 
	{
		// TODO Auto-generated method stub
		double result=this.side*this.side;
		return result;
		
	}
	
}
