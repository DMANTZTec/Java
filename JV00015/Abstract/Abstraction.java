package Abstract;
abstract class Animal
	{
		abstract public void noise();
	}
class Lion extends Animal
	{
	    @Override
		public void noise()
		{
			System.out.println("lion noise ");
		}
	}
class Help 
{
	public static Animal getobject() 
	{
		Animal rv= 	new Lion();
		return rv;	
	}
}
public class Abstraction 
{
  public static void main(String[] args)
  {
	  Animal rv= Help.getobject();
	    rv.noise();
  }
}
