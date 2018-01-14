/*
 ================================================================
 Author:     Alex Kim
 Date:       10/18/17
 Description:Display percentage of each nucleotide in DNA sequence and total from given file containing sequence.
 ================================================================
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Read file
		File palindromes = new File("isPalindrome.txt");
		Scanner sc = new Scanner(palindromes);
		
		// Detect if file has another line
		while (sc.hasNextLine()) {
			
			// Declare variables
			String line = sc.nextLine();
			String lineAlt = line.replaceAll(" ", "").toLowerCase();
			String firstHalf = lineAlt.substring(0, (lineAlt.length() / 2));
			int odd = 0;
			
			// Detect if line is odd
			if (lineAlt.length() % 2 != 0) {
				odd++;
			}
			
			// Declare variables
			String secondHalf = lineAlt.substring(lineAlt.length() / 2 + odd, lineAlt.length());
			String secondHalfReversed = "";
			String palindrome = "NOT ";
			
			// Reverse secondHalf
			for (int i = 0; i < secondHalf.length(); i++) {
				secondHalfReversed += secondHalf.charAt(secondHalf.length() - 1 - i);
			}
			
			// Determine if line is palindrome
			if (firstHalf.equals(secondHalfReversed)) {
				palindrome = "";
			}
			
			// Print result
			System.out.println("\"" + line + "\" is " + palindrome + "a palindrome.");
		}
	}

}
