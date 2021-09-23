 //Encapsulation example

//create class for Account
class Account{
	 private double balance=18000;
	 public double getbalance()//getter method is used to get the balance
	 {
		 return balance;
		
	 }
	 public void setbalance(double amt)//setter method is used to the deposit and withdraw bal
	 {
		 this.balance=this.balance+amt;
		 System.out.println(this.balance);// to display the balance
	 }
	
}
//create  class
public class Encapsulation1 {

	public static void main(String[] args) {
		Account bal=new Account();//create an object for the Account 
		bal.setbalance(10000);
		bal.getbalance();
		 System.out.println(bal.getbalance());

	}

}
