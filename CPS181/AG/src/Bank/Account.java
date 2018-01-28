package Bank;

/*
 * Alex Garrett
 * Project #2 : Banking Machine Program
 * Due 1/24/18
 */
public class Account {   //This class will allow deposits and withdrawals, but not overdraft limits or intrest rates
	private double balance; // The current balance variable
	private int acctNum;  //The number of the account
	
	public Account (int num) {
		balance = 0.0;
		acctNum = num;
	}
	
	public void deposit (double amt) {
		if (balance > 0)
		{	
			balance = balance + amt;
			System.out.println("Your balance after the deposit is "+balance);
		}
	}
	
	public void withdraw (double amt) {
		if ((balance - amt) > 0)
		{
			balance = balance - amt;
			System.out.println("Your balance after the withdrawl is "+balance);

		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAccountNumber() {
		return acctNum;
	}
	
	public String toString() {
		return "Your final balance is "+balance+ "and your account number is "+acctNum;
	}
	
	public final void print() {
		System.out.println( toString());
	}
	
}