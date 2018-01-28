package Bank;

/*
 * Alex Garrett
 * Project #2 : Banking Machine Program
 * Due 1/24/18
 */
public class CheckingAccount extends Account{
	public int overDraft = -50;
	
	public void overDraft() {
		if (balance < overDraft)
		{
			System.out.println("You have reached your overdraft limit");
		}
	}

}