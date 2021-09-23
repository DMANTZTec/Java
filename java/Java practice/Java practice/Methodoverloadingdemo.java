class Casio
{
	public void add(int i)
	{
		System.out.println(i);
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	public void add(double i,double j)
	{
		System.out.println(i+j);
	}
}
public class Methodoverloadingdemo {
	
	public static void main(String[ ] args)
	{
		Casio obj= new Casio();
		obj.add(8,9);
		obj.add(5,8,2);
		obj.add(5.6,7.8);
	}

}
