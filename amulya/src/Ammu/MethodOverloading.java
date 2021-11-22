package Ammu;
class mul {
public void m() {
	System.out.println("null");
}
public void m(int a,int b)
{
	System.out.println(a*b);
}
public void m(int a,int b,int c)
{
	System.out.println(a*b*c);
}
}
public class MethodOverloading {
	

	public static void main(String[] args) {
		
        mul obj=new mul();
        obj.m(56,777);
	}

}
