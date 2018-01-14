import java.util.Scanner;

/*
 ================================================================
 Author:     Alex Kim
 Date:       9/13/17
 Description:Converts dog age to human age
 ================================================================
*/

public class DogAge {

	public static void main(String[] args) {
		// Declare variables
		int dogAge;
		int humanAge;
		Scanner scr = new Scanner(System.in);
		
		// Ask user to input dog age
		System.out.println("What is your dogs age in dog years?");
		
		// Accept user input and store the dog age
		dogAge = scr.nextInt();
		
		// Convert dog age to human age by multiplying the factor by 7
		humanAge = dogAge / 7;
		
		// Display the dog age and corresponding human age
		System.out.println("Your dog is " + dogAge + " in dog years and " + humanAge + " in human years!");
	}

}
