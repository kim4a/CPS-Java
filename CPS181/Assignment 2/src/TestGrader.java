import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 ================================================================
 Author:      Alex Kim
 Date:        1/20/18
 Description: Grade students and calculate question correctness from file data
 ================================================================
*/

public class TestGrader {
	
	public static void main(String[] args) throws FileNotFoundException {
		// Declare variables
		int testLength = getTestLength(); // How many questions exist in the test
		int studentLength = getStudentLength();
		char[] ansKey = new char[testLength];
		String[] students = new String[studentLength];
		char[][] studentAnswers = new char[studentLength][testLength];
		
		// Populate arrays
		populateAnswerKey(ansKey);
		populateStudentArray(students);
		populateStudentAnswers(studentAnswers);
		
		// Create array of student scores
		int[] studentScores = calculateStudentScores(ansKey, studentAnswers);
		
		// Create array of question correct percentage
		double[] questionCorrectPercentages = calculateQuesCorrPerc(ansKey, studentAnswers);
		
		// Display students names and scores
		displayNamesAndScores(students, studentScores, ansKey.length);
		
		// Display percentage that each question was correctly answered
		displayQuesCorrPerc(questionCorrectPercentages);
	}

	public static int getTestLength() throws FileNotFoundException {
		// Declare variables
		File file = new File("testAnswers.txt");
		Scanner sc = new Scanner(file);
		int length = 0;
		
		// Skip "Answer Key" in the file
		sc.next();
		sc.next();
		
		// Count number of answers in answer key
		String temp = sc.next();
		while (temp.length() == 1) {
			length++;
			temp = sc.next();
		}
		
		return length;
	}
	
	public static int getStudentLength() throws FileNotFoundException {
		// Declare variables
		File file = new File("testAnswers.txt");
		Scanner sc = new Scanner(file);
		int length = -1; //  set to -1 to offset for answer key line
		
		// Count number of students in file
		while (sc.hasNextLine()) {
			length++;
			sc.nextLine();
		}
		
		return length;
	}
	
	public static void populateAnswerKey(char[] ansArray) throws FileNotFoundException {
		// Declare variables
		File file = new File("testAnswers.txt");
		Scanner sc = new Scanner(file);
		
		// Skip "Answer Key" in the file
		sc.next();
		sc.next();
		
		// Record answers to array
		for (int i = 0; i < ansArray.length; i++) {
			ansArray[i] = sc.next().charAt(0);
		}
	}
	
	public static int populateStudentArray(String[] students) throws FileNotFoundException {
		// Declare variables
		File file = new File("testAnswers.txt");
		Scanner sc = new Scanner(file);
		
		// Skip answer key line
		sc.nextLine();
		
		// Record names to array
		for (int i = 0; i < students.length; i++) {
			students[i] = sc.next() + " " + sc.next();
			sc.nextLine();
		}
		
		return students.length;
	}
	
	public static void populateStudentAnswers(char[][] studentAnswers) throws FileNotFoundException {
		// Declare variables
		File file = new File("testAnswers.txt");
		Scanner sc = new Scanner(file);
		
		// Skip answer key line
		sc.nextLine();
		
		// Record answers to array
		for (int i = 0; i < studentAnswers.length; i++) {
			
			// Skip student name
			sc.next();
			sc.next();
			
			for (int j = 0; j < studentAnswers[i].length; j++) {
				studentAnswers[i][j] = sc.next().charAt(0);
			}
			if (sc.hasNextLine())
				sc.nextLine();
		}
	}
	
	public static int[] calculateStudentScores(char[] ansKey, char[][] studentAnswers) {
		// Declare variables
		int[] studentScores = new int[studentAnswers.length];
		
		// Cycle through each students answers
		for (int i = 0; i < studentScores.length; i++) {
			int score = 0;
			
			// Check each student answer against answer key
			for (int j = 0; j < ansKey.length; j++) {
				if (ansKey[j] == studentAnswers[i][j])
					score++;
			}
			
			// Save score
			studentScores[i] = score;
		}
		
		return studentScores;
	}
	
	public static double[] calculateQuesCorrPerc(char[] ansKey, char[][] studentAnswers) {
		// Declare variables
		double[] correctPercents = new double[ansKey.length];
		
		// Count student answers correct for every question
		for (int i = 0; i < correctPercents.length; i++) {
			double correct = 0.0;
			
			for (int j = 0; j < studentAnswers.length; j++) {
				if (ansKey[i] == studentAnswers[j][i])
					correct++;
			}
			
			// Percent is answers correct / total answers
			correctPercents[i] = correct / studentAnswers.length;
		}
		
		return correctPercents;
	}
	
	public static void displayNamesAndScores(String[] students, int[] scores, int total) {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i] + " has received a score of " + scores[i] + "/" + total + " or " + ((double)scores[i] / total * 100) + "%.");
		}
	}
	
	public static void displayQuesCorrPerc(double[] percentages) {
		for (int i = 0; i < percentages.length; i++) {
			double fixPercent = (double)Math.round(percentages[i] * 10000) / 100;
			System.out.println("Question " + (i + 1) + " was answered correctly " + fixPercent + "% of the time.");
		}
	}

}
