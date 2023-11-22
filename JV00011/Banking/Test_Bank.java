package Banking;

import java.io.ObjectInputStream.GetField;

public class Test_Bank
{
	public static void main(String[] args) 
	{
		BankCustomer user1= new BankCustomer("abc",12574,1752.50);
		BankCustomer user2= new BankCustomer("xyz",159753 , 2581.00);
		user1.Deposite(user1,1000);
		user1.withDraw(user2,500);
     	user1.transfer(user2, user1,1000);
		System.out.println("amount of user1: "+ user1.getBalance());
		System.out.println("amount of user2: "+ user2.getBalance());
	}

}
