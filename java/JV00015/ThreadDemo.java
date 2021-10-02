package thread;

public class ThreadDemo {

	public static void main(String[] args) {
		    MyTheread mt=new MyTheread();// Thread instantiation 
		    mt.start();//Starting of thread
		    for(int i=0;i<10;i++)// excuted by main thread
		    {
		    	System.out.println("Main Method");
		    }
		    
	}

}
