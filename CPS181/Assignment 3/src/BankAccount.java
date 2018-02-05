/*
 ================================================================
 Author:      Alex Kim
 Date:        1/20/18
 Description: Bank account object has account number, owner, type and balance attributes.
 ================================================================
*/

public class BankAccount {
	private double number, balance;
	private String owner, type;
	
	// Declare values
	BankAccount(double num, String own, String typ, double bal) {
		number = num;
		owner = own;
		type = typ;
		balance = bal;
	}
	
	// Add money to account
	public void Deposit(double amount) {
		if (amount > 0 && amount <= balance) {
			balance += amount;
		}
	}

	// Remove money from account
	public void Withdraw(double amount, double accNum, String ownerID) {
		// Validate credentials
		if (accNum == number && ownerID.equals(owner)) {
			if (amount > 0) {
				balance -= amount;
			}
		}
	}
	// Remove money from account and add to another account
	public void WithdrawTo(double amount, double accNum, String ownerID, BankAccount account) {
		// Validate credentials
		if (accNum == number && ownerID.equals(owner)) {
			if (amount > 0) {
				balance -= amount;
				account.Deposit(amount);
			}
		}
	}
	
	public String GetAccountType() {
		return type;
	}
	
	public String GetAccountOwner() {
		return owner;
	}
	
	public double GetBalance() {
		return balance;
	}
}
