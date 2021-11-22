package com.JUnitTest;

public class IgnoreClass {
	 private String DirectMessage;

	   //Constructor
	   public IgnoreClass(String message){
	      DirectMessage = message; 
	   }

	   // prints the message
	   public String printMessage(){
	      System.out.println(DirectMessage);
	      return DirectMessage;
	   }   

	   // adding to the message
	   public String salutationMessage(){
	      DirectMessage = "This is"+" " + DirectMessage;
	      System.out.println(DirectMessage);
	      return DirectMessage;
	   }   
	}

