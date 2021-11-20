package junit2;

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
	}