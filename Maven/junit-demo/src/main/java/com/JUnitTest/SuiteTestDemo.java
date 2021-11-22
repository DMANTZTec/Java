package com.JUnitTest;

public class SuiteTestDemo {

		   private String DirectMessage;

		   //Constructor
		   public SuiteTestDemo(String message){
		      DirectMessage = message; 
		   }

		   // prints the message
		   public String printMessage(){
		      System.out.println(DirectMessage);
		      return DirectMessage;
		   }   

		   // adding to the message
		   public String salutationMessage(){
		      DirectMessage = "This is an" + DirectMessage;
		      System.out.println(DirectMessage);
		      return DirectMessage;
		   }   
		}

