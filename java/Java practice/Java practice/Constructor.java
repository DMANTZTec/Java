class Mac
{
	int num1;
	int num2;
	int result;
	
	public Mac(int num1,int num2)
	{
		this.num1=num1;
	}
	public Mac(int k)
	{
		num1=k;
	}
	public Mac(double n, int j)
	{
		num1=(int)n;
		num2=j;
		
	}
	
}
public class Constructor {

	public static void main(String[] args)
	{
	  Mac obj=new Mac(3.5,8);
	  System.out.println(obj.num1);
	  System.out.println(obj.num2);
	}	  
	
	
	
	
	
}
