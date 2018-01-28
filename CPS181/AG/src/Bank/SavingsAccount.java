package Bank;

/*
 * Alex Garrett
 * Project #2 : Banking Machine Program
 * Due 1/24/18
 */
public class SavingsAccount extends Account{

	public double interest;

	public void intrest() {
		interest = balance + (balance * 0.02);
	}
}