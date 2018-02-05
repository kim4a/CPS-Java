/*
 ================================================================
 Author:      Alex Kim
 Date:        1/20/18
 Description: Test Person and BankAccount class.
 ================================================================
*/

public class BankAccountTest {

	public static void main(String[] args) {
		// Create people and their bank accounts
		Person James = new Person(123456789, "James", "123 Fake St.", 1111);
		BankAccount JamesAcc = new BankAccount(1234, "James", "Savings", 5000.00);
		Person Alyssa = new Person(987654321, "Alyssa", "321 Fake St.", 2222);
		BankAccount AlyssaAcc = new BankAccount(4321, "Alyssa", "Checking", 6000.00);

		// Deposit money
		JamesAcc.Deposit(100);
		System.out.println(JamesAcc.GetBalance());
		AlyssaAcc.Deposit(500);
		System.out.println(AlyssaAcc.GetBalance());
		
		// Withdraw money
		JamesAcc.Withdraw(4500, 1234, "James");
		System.out.println(JamesAcc.GetBalance());
		AlyssaAcc.Withdraw(4500, 4321, "Alyssa");
		System.out.println(AlyssaAcc.GetBalance());
		
		// Withdraw money and deposit to a different account
		JamesAcc.WithdrawTo(500, 1234, "James", AlyssaAcc);
		System.out.println(JamesAcc.GetBalance());
		System.out.println(AlyssaAcc.GetBalance());
	}

}
