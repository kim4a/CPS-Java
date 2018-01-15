import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
================================================================
Author:      Alex Kim
Date:        1/13/18
Description: Reads a file with 100 integers and displays average, largest number, and smallest number
================================================================
*/

public class Problem5 {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Initialize variables
		File file = new File("100 Random Numbers.txt");
		Scanner sc = new Scanner(file);
		int nums[] = new int[100];
		int total = 0;
		int largest = 0;
		int smallest = 0;
		float average = 0;
		
		// Populate array, calculate total, and find largest and smallest number
		for (int i = 0; i < 100; i++) {
			nums[i] = sc.nextInt();
			total += nums[i];
			
			if (i == 0) {
				largest = nums[i];
				smallest = nums[i];
			}
			else {
				if (largest < nums[i]) largest = nums[i];
				if (smallest > nums[i]) smallest = nums[i];
			}
		}
		
		// Calculate average
		average = total / 100f;
		
		// Display stats
		System.out.println("Average: " + average);
		System.out.println("Largest number: " + largest);
		System.out.println("Smallest number: " + smallest);
	}

}
