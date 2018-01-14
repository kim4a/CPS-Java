import java.util.Scanner;

/*
 ================================================================
 Author:     Alex Kim
 Date:       10/25/17
 Description:Prompt user for player information and print player stats
 ================================================================
*/

public class PlayerStat {

	public static void main(String[] args) {
		
		// Declare variables
		String[] arrNames = new String[3];
		double[] arrScores = new double[3];
		Scanner sc = new Scanner(System.in);
		double largest = 0, average = 0;
		
		// Prompt user for player names
		System.out.println("Enter names for players (One at a line):");
		for (int i = 0; i < arrNames.length; i++) {
			arrNames[i] = sc.nextLine();
		}
		
		// Prompt user for player scores
		System.out.println("Enter scores for players (One at a line):");
		for (int i = 0; i < arrScores.length; i++) {
			arrScores[i] = sc.nextDouble();
			if (arrScores[i] > largest) { // Determine largest score
				largest = arrScores[i];
			}
		}
		
		// Print player stats
		System.out.println("The player stats:");
		for (int i = 0; i < arrScores.length; i++) {
			System.out.println(i + ": " + arrNames[i] + ", " + arrScores[i]);
		}
		// Print largest score
		System.out.println("Largest score: " + largest);
		
		// Determine average score
		for (int i = 0; i < arrScores.length; i++) {
			average += arrScores[i];
		}
		average = average / arrScores.length;
		
		// Print largest score
		System.out.println("Average score: " + average);
	}

}
