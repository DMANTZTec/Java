package Bank_Program2;

public class Bank
{
	    private String accountNumber;
	    private String accountHolder;
	    private double balance;

	    public Bank(String accountNumber, String accountHolder, double initialBalance) 
	    {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount)
	    {
	        if (amount > 0) 
	        {
	            balance += amount;
	            System.out.println(amount + " deposited and current balance: " + balance);
	        } 
	        else
	        {
	            System.out.println("Invalid amount or Deposit failed.");
	        }
	    }

	    public void withdraw(double amount)
	    {
	        if (amount > 0 && balance >= amount)
	        {
	            balance -= amount;
	            System.out.println(amount + " withdrawn and Current balance: " + balance);
	        } 
	        else 
	        {
	            System.out.println("Insufficient funds or invalid amount. Withdrawal failed.");
	        }
	    }

	    public void displayBankInfo()
	    {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Balance: " + balance);
	    }
	}

