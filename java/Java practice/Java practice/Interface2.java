interface Drawable
{
	void draw();

}
class Square implements Drawable
{
	public void draw()
	{
		System.out.println("drawing Square");
	}
}
class Cone implements Drawable
{
	public void draw()
	{
		System.out.println("drawing Cone");
	}
}
public class Interface2 {

	public static void main(String[] args)
	{
		Drawable obj=new Cone();
		obj.draw();
	}
}
