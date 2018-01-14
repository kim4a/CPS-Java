/*
 ================================================================
 Author:     Alex Kim
 Date:       11/1/17
 Description:Generate random numbers in a row and calculate sum and average
 ================================================================
*/

import java.util.Random;

public class Array2D {

	public static void main(String[] args) {
		// Declare variables
		// boundary must be a 1 or 2 digit number
		int row = 7, col = 3, boundary = 17;
		int[][] arr2D = new int[row][col];
		Random rand = new Random();
		
		for (int i = 0; i < arr2D.length; i++) {
			// Declare temporary variables
			int sum = 0;
			double avg = 0;
			for (int j = 0; j < arr2D[i].length; j++) {
				arr2D[i][j] = rand.nextInt(boundary + 1); // Generate random number between 0 and boundary
				System.out.print(arr2D[i][j] + " "); // Print number
				if ((int)(arr2D[i][j] * 0.1) == 0) { // Fix spacing for 1 digit numbers
					System.out.print(" ");
				}
				// Count row sum
				sum += arr2D[i][j];
			}
			// Calculate row average
			avg = (double)sum / arr2D[i].length;
			System.out.println("| Row sum: " + sum + " Row Average: " + avg);
		}
	}

}
