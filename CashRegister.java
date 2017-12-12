import java.util.Scanner;

/*
 ================================================================
 Author:     Alex Kim
 Date:       9/24/17
 Description:Calculate price of sale
 ================================================================
*/

public class CashRegister {

	private static Scanner scr;

	public static void main(String[] args) {

		// Declare variables
		String student = "n";
		int age = 0, chips = 0, sodas = 0, hotDogs = 0, coffee = 0;
		double subtotal = 0, discount = 0, tax = 0, total = 0;
		scr = new Scanner(System.in);
		
		// Prompt user for input
		System.out.println("Are you a student [y/n]?");
		student = scr.next().toLowerCase();
		System.out.println("What is your age?");
		age = scr.nextInt();
		System.out.println("How many bags of chips would you like?");
		chips = scr.nextInt();
		System.out.println("How many sodas would you like?");
		sodas = scr.nextInt();
		System.out.println("How many hot dogs would you like?");
		hotDogs = scr.nextInt();
		System.out.println("How many cups of coffee would you like?");
		coffee = scr.nextInt();
		
		// Display order summary
		System.out.println("Order summary ...");
		System.out.println(chips + " bags of chips");
		System.out.println(sodas + " sodas");
		System.out.println(hotDogs + " hot dogs");
		System.out.println(coffee + " cups of coffee");
		System.out.println("");
		System.out.println("-----");
		
		// Calculate costs
		// subtotal
		subtotal = chips + sodas * 1.25 + hotDogs * 2;
		if (age < 62) {
			subtotal += coffee * .75;
		}
		// discount
		if (student.equals("y") || age >= 62) {
			discount = subtotal * .1;
		}
		// tax
		tax = (subtotal - discount) * .06;
		// total
		total = subtotal - discount + tax;
		
		// Display costs
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Discount: $" + discount);
		System.out.println("Tax: $" + tax);
		System.out.println("Total: $" + total);
		System.out.println("Thank you for your order!");
	}
}
