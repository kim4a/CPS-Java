/*
 ================================================================
 Author:     Alex Kim
 Date:       11/1/17
 Description:
 ================================================================
*/

// DOES NOT WORK AAHHH

import java.util.Scanner;

public class SeriesUp {

	public static void main(String[] args) {
		// Declare variables
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		// Prompt user for input
		System.out.println("Please enter an integer: ");
		n = sc.nextInt();
		
		// Declare array
		int[] serup = new int[n*(n+1)/2];
		
		// Populate array
		int count = 0;
		int counter = 1;
		for (int i = 0; i < serup.length; i++) {
			for (int j = 0; j < counter; j++) {
				count++;
				serup[i] = count;
			}
			count = 0;
			counter++;
		}
		
		// Print output
		System.out.println("The series-up array is:");
		for (int i = 0; i < serup.length; i++) {
			System.out.print(serup[i] + " ");
		}
	}

}
