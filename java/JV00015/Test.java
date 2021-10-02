package thread;
// Overriding of start() method
class Test extends Thread  {
    public void start()
    {
    	System.out.println("Start method");
    }
    public void run()
    {
    	System.out.println("run method");
    }
}
//I got an error 