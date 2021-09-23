class Calculator
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
	
class CalAdv extends Calculator
{
	
	public int sub(int i,int j)
	{
		return i-j;
    }	

	
}
class CalcveryAdva extends CalAdv
{
	public int mul(int i,int j)
	{
		return i*j;
	}
}

public class multiinheritance {

	public static void main(String[] args) {
         CalcveryAdva c1=new CalcveryAdva();
         int result1=c1.add(2, 30);
         int result2=c1.sub(42, 30);
         int result3=c1.mul(4, 30);
         System.out.println(result1);
         System.out.println(result2);
         System.out.println(result3);

	}
}
