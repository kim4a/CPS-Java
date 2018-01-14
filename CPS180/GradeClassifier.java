import java.util.Scanner;

/*
================================================================
Author:     Alex Kim
Date:       9/20/17
Description:Calculate grade based on score
================================================================
*/

public class GradeClassifier {
	
	private static Scanner scr;

	public static void main(String[] args) {
		// Declare variables
		scr = new Scanner(System.in);
		double score = 0;
		char grade = 'E';
		
		// Ask for score
		System.out.println("What is your score?");
		score = scr.nextDouble();
		
		// Calculate score
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >= 60) {
			grade = 'D';
		}
		
		// Print score
		System.out.println("You will receive " + grade);
	}

}
