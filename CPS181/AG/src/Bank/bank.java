package Bank;

/*
 * Alex Garrett
 * Project #2 : Banking Machine Program
 * Due 1/24/18
 */
public class bank {

	public static void main(String[] args) {
		
		Account[] acctArray = new Account[2];
		
		acctArray[0] = new SavingsAccount();
		acctArray[1] = new CheckingAccount();

		for (int i = 0; i < acctArray.length; i++) {
			Account.print(acctArray[i]);
		}
		
		
		SavingsAccount s1 = new SavingsAccount();
		CheckingAccount c1 = new CheckingAccount();
		
		System.out.println("Savings Account Balance ");
		Account.print(s1);
		System.out.println("Checking Account Balance ");
		Account.print(c1);
  }
}