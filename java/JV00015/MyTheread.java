package thread;
//creating class which inherits the Thread class
class MyTheread extends Thread{
	public void run()//overrides the run method in Thread class
	{
		for(int i=0;i<10;i++)//executed by child thread
		{
			System.out.println("Child Method");
		}
	}
	
}	
		
	
	


