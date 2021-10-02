package thread;

public class MyThread extends Thread{
public void run()
{
	System.out.println("no-arg run method");
}
public void run(int i)
{
	System.out.println("int arg method");
}
}
//overloading run method is always possible but thread class start method can invoke no-arg run() method