package junit2.suite;

public class MessageUtill {

	private String message;
	public MessageUtill(String message)
	{
		this.message=message;
	}
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}
	public String extendedMessage()
	{
		 message="hi"+"message";
		return message;
	}

}