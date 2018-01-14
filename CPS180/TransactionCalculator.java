import java.util.Scanner;

/*
 ================================================================
 Author:     Alex Kim
 Date:       9/8/17
 Description:Calculates dollar amount of share transactions.
 ================================================================
*/



public class TransactionCalculator {

	public static void main(String[] args) {

		// Declare variables
		final double TRANSACTION_FEE = 15.0;
		int numberShares = 0;
		double buyPrice = 0;
		double sellPrice = 0;
		double netProfit = 0;

		// Declare Scanner
		Scanner scr = new Scanner(System.in);
		
		// Prompt user for input
		System.out.println("How many shares bought?");
		numberShares = scr.nextInt();
		System.out.println("Buy price? $");
		buyPrice = scr.nextDouble();
		System.out.println("Sell price? $");
		sellPrice = scr.nextDouble();
		
		// Calculate net profit
		netProfit = numberShares * sellPrice - numberShares * buyPrice - 2 * TRANSACTION_FEE;
		
		// Print values
		System.out.println("Here is the information of your stock transactions:");
		System.out.println("Number of shares: " + numberShares);
		System.out.println("Amount of purchase: $" + buyPrice * numberShares);
		System.out.println("Amount of sell: $" + sellPrice * numberShares);
		System.out.println("Transaction fee paid: $" + 2 * TRANSACTION_FEE);
		System.out.println("Net profit: $" + netProfit);
	}

}
