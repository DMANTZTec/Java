class Calculator
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
	
class CalcAdva extends Calculator
{
	
	public int sub(int i,int j)
	{
		return i-j;
	}	

	
}
public class Inheritance {

	public static void main(String[] args) {
         CalcAdva c1=new CalcAdva();
         int result1=c1.add(2, 30);
         int result2=c1.sub(42, 30);
         System.out.println(result1);
         System.out.println(result2);

	}

}
