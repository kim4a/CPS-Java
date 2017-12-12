import java.util.Scanner;

/*
 ================================================================
 Author:     Alex Kim
 Date:       9/13/17
 Description:Find student grade based on exam scores and weights
 ================================================================
*/

public class GradeCalculator {

	public static void main(String[] args) {
		// Declare variables
		double quiz;
		double midterm;
		double finalExam;
		double grade;
		final double quizMax = 25;
		final double midtermMax = 150;
		final double finalExamMax = 100;
		final double quizWeight = .1;
		final double midtermWeight = .4;
		final double finalExamWeight = .5;
		Scanner scr = new Scanner(System.in);
		
		//Ask for grades for each exam
		System.out.println("What is your quiz score?");
		quiz = scr.nextDouble();
		System.out.println("What is your midterm score?");
		midterm = scr.nextDouble();
		System.out.println("What is your final exam score?");
		finalExam = scr.nextDouble();
		
		// Calculate weighted grade
		grade = (quiz / quizMax * quizWeight) + 
				(midterm / midtermMax * midtermWeight) + 
				(finalExam / finalExamMax * finalExamWeight);
		
		// Display the grades for each exam and the weighted grade
		System.out.println("Your grade for your quiz is " + quiz/quizMax*100 + "%.");
		System.out.println("Your grade for your midtemr is " + midterm/midtermMax*100 + "%.");
		System.out.println("Your grade for your final exam is " + finalExam/finalExamMax*100 + "%.");
		System.out.println("Your average weighted grade is " + grade*100 + "%.");
	}

}
