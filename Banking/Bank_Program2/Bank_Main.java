package Bank_Program2;


public class Bank_Main
{
	    public static void main(String[] args) 
	    {
	        Bank account = new Bank("159753", "Padma", 1000.0);
	        account.deposit(500.0);
	        account.withdraw(200.0);

	        account.displayBankInfo();
	    }
	}