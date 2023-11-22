package Banking;

public class BankCustomer {
	private int customerId;
	private String customerName;
	private double Balance;

	public BankCustomer(String customerName, int customerId, double intialAmount) 
	{
		this.customerName = customerName;
		this.customerId = customerId;
		this.Balance = intialAmount;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public double Deposite(BankCustomer bankCustomer , double amount) 
	{
      double a= bankCustomer.getBalance();
       a+=amount;
      bankCustomer.setBalance(a);
       return a;
	}

	public double withDraw( BankCustomer bankCustomer,double amount) 
	{
		double b= bankCustomer.getBalance();
		b-=amount;
		bankCustomer.setBalance(b);
		return b;
	}

	public double transfer(BankCustomer fromAccount, BankCustomer toAccount, double balance) 
	{
		fromAccount.withDraw(fromAccount ,balance);
		toAccount.Deposite(toAccount ,balance);
		return fromAccount.getBalance();
	}
}
