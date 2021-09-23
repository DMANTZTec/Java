class Cal
{
	public int add(int ...n)
	{
		int sum=0;
		for(int i :n)
		{
			sum=sum+i;
		}
	    return sum;
	}
}
public class Varrags 
     {
      public static void main(String[] args)
      {
    	  Cal obj=new Cal();
    	  System.out.print(obj.add(3,5,6,78,8,7,90));
      }
}
