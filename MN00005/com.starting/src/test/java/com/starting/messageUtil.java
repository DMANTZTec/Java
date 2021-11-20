package com.starting;

public class messageUtil {
private String message="Robert";
	
	public messageUtil(String message) {
		
		this.message = message;
	}
	public String printMessage() {
		
		System.out.println(message);
		while(true);
	}
	public String salutationMessage()
	{
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

}
