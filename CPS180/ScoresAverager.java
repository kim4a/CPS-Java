/*
 ================================================================
 Author:     Alex Kim
 Date:       10/11/17
 Description:Create file with 200 random scores and display the average and number of scores of the file.
 ================================================================
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class ScoresAverager {

	private static Scanner sc;
	
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "score.txt";
		scoreGenerator(200, fileName);
		averageScore(fileName);
	}

	/****************************************************************
	 * Method: 	scoreGenerator
	 * Parameter:	n: number of scores to be generated
	 * 				fileName: the name of the file to write
	 * Return:	none
	 * Description: Randomly generate n number of scores 
	 * 				within 0 and 100 inclusively.  
	 * 				Save the scores in a file named scores.txt. 
	 */
	private static void scoreGenerator(int n, String fileName) throws FileNotFoundException {

		File file = new File(fileName);
		PrintWriter pw = new PrintWriter(file);
		Random rand = new Random();
		
		int i = 0;
		int num = 0;
		while (i < 200) {
			num = rand.nextInt(101);
			pw.print(num);
			pw.print(' ');
			i++;
		}
		pw.flush();
		pw.close();
		System.out.println("Finished generating!\n");
	}
	/****************************************************************
	 * Method: 	averageScore
	 * Parameter:	fileName: the name of the file to read from
	 * Return:	none
	 * Description: Randomly generate n number of scores 
	 * 				within 0 and 100 inclusively.  
	 * 				Save the scores in a file named scores.txt. 
	 */
	private static void averageScore(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		sc = new Scanner(file);
		int count = 0;
		int total = 0;
		double avg = 0;
		while(sc.hasNext()) {
			total += sc.nextInt();
			count++;
		}
		avg = (double)total / count;
		
		System.out.println("Number of scores: " + count);
		System.out.println("Average score: " + avg);
	}
}