/*
 ================================================================
 Author:     Alex Kim
 Date:       9/27/17
 Description:Identify month by number or month number by month
 ================================================================
*/

import java.util.Scanner;

public class NameMonth {

	public static void main(String[] args) {
		
		// Declare variables
		Scanner sc = new Scanner(System.in);
		String monthInput;
		String[] monthArray = {
				"january", "february", "march",
				"april", "may", "june",
				"july", "august", "september",
				"october", "november", "december"
		};
		
		// Prompt for input
		System.out.println("Enter month number or name: ");
		monthInput = sc.next().trim().toLowerCase();
		
		// Identify month
		for (int x = 0; x < 13; x++) {
			// Test if input is month
			if (x < 12 && monthInput.equals(monthArray[x])) {
				// Print output
				System.out.println(monthArray[x].substring(0, 1).toUpperCase() + monthArray[x].substring(1) + " is month " + (x + 1));
				break;
			}
			// Test if input is number
			else if (Integer.toString(x).equals(monthInput)) {
				// Print output
				System.out.println("The month " + x + " is " + monthArray[x - 1].substring(0, 1).toUpperCase() + monthArray[x - 1].substring(1)); 
				break;
			}
		}
	}
}
