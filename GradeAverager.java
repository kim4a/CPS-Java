import java.util.Scanner;

/*
 ================================================================
 Author:     Alex Kim
 Date:       9/13/17
 Description:Find average grade based on three exam scores
 ================================================================
*/

public class GradeAverager {

	public static void main(String[] args) {
		// Declare Variables
		double exam1;
		double exam2;
		double finalExam;
		double average;
		Scanner scr = new Scanner(System.in);
		
		// Ask grades for each exam
		System.out.println("What is your first exam score?");
		exam1 = scr.nextDouble();
		System.out.println("What is your second exam score?");
		exam2 = scr.nextDouble();
		System.out.println("What is your final exam score?");
		finalExam = scr.nextDouble();
		
		// Calculate average grade
		average = (exam1 + exam2 + finalExam) / 3;
		
		// Display the grades for each exam and the average grade
		System.out.println("Your first exam score is " + exam1 + ".");
		System.out.println("Your second exam score is " + exam2 + ".");
		System.out.println("Your final exam score is " + finalExam + ".");
		System.out.println("Your average score is " + average + ".");
	}

}
