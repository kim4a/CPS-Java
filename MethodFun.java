import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class MethodFun {
	//Global variables. Can be used in any method
	public static final int size = 200;
	public static int[] arrScores = new int[size];
	
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "score.txt";
		scoreGenerator(size, fileName);
		//Your codes here to call the methods
		
		
		
	}
	// You methods here:
	
	
	
	
	
	
	
	
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
		//Declare variables
		PrintWriter pw = new PrintWriter(fileName);
		Random rand = new Random();
		int i = 1;	//iterator
		//generate n number of scores, one by one
		int num;
		while(i <= n) {
			num = (int)(Math.abs(rand.nextDouble()) * 100);
			pw.print(num);
			pw.print(' ');	//add a whitespace
			i ++; //change the iterator
		}
		pw.flush();
		pw.close();
		System.out.println("Finish generating!\n");		
	}

}