
public class Exception {
	
	private String message;
	
	public Exception(String message) {
		
	this.message = message;
	}
	public void printMessage() {
		System.out.println(message);
		int a=0;
		int b=1/a;
		
	}
	public String salutationMessage(){
	      message = "Hello!" + message;
	      System.out.println(message);
	      return message;
	   }   

}
