/*
 ================================================================
 Author:     Alex Kim
 Date:       10/18/17
 Description:Display percentage of each nucleotide in DNA sequence and total from given file containing sequence.
 ================================================================
*/

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		// Declare variables
		int size = 0;
		Scanner sc = new Scanner(System.in);
		
		// Request user input for triangle size
		System.out.print("Please enter an integer: ");
		size = sc.nextInt();
		
		// Print asterisk triangle
		for (int i = size; i > 0; i -= 2) {
			// Print whitespaces
			for (int j = 0; j < ((size - i) / 2); j++) {
				System.out.print(" ");
			}
			// Print asterisks
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			// Newline
			System.out.println("");
		}
		
		// Print carets
		for (int i = 0; i < size; i++) {
			System.out.print("^");
		}
	}

}
