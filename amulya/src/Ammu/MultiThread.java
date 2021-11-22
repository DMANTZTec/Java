package Ammu;

public class MultiThread extends Thread {
	public void run() {
		for(int i=1; i<=10; i++) {
			try{Thread.sleep(1000);}catch(Exception e) {}
		    System.out.println("Thread Working :" +i+ " " +Thread.currentThread().getName()+ " " +
		    Thread.currentThread().getPriority());
		}
	}
	public static void main(String[] args) {
		Thread t1= new MultiThread();
		Thread t2= new A();
		//set name to thread to know which is the thread
		t1.setName("T1");
		t2.setName("T2");
		//SET PRIORITY
		t1.setPriority(NORM_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
		
	}

}
//create another thread
class A extends Thread{
	@Override
	public void run() {
	super.run();
	for(int i=1; i<=10; i++) {
		try{Thread.sleep(1000);}catch(Exception e) {}
	    System.out.println("Thread Working:"+i +" " +Thread.currentThread().getName()+ " " +
	    		Thread.currentThread().getPriority());
	
}
	}
}
