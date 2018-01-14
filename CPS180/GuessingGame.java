import java.util.Scanner;
import java.util.Random;

/*
 ================================================================
 Author:     Alex Kim
 Date:       9/20/17
 Description:Player guesses the number rolled on a virtual die
 ================================================================
*/

public class GuessingGame {
	
	private static Scanner scr;

	public static void main(String[] args) {
		
		// Declare variables
		scr = new Scanner(System.in);
		Random rand = new Random();
		int r = 1, g = 1, cor = 0;
		String[] increment =  {"first", "second", "third"};
		
		// Repeat 3 times
		for (int x = 0; x < 3; x++) {
			// Ask for guess
			System.out.println("What's your guess for the " + increment[x] + " roll?");
			g = scr.nextInt();
			
			// Generate random dice roll
			r = rand.nextInt(6) + 1;
			
			// Check if guess is correct
			if (g == r) { // If guess is correct
				cor++;
				System.out.println("Congratulations! You got it!");
			}
			else { // If guess is not correct
				System.out.println("Oops, the actual value is " + r + ", not the one you guessed!");
			}
			
		}
		
		// Print correct number of guesses
		System.out.println("You guessed " + cor + " roll(s) correctly!");
	}

}
