import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/*
 ================================================================
 Author:      Alex Kim
 Date:        1/13/18
 Description: Writes 100 random numbers to a file
 ================================================================
*/

public class Problem4 {

	public static void main(String[] args) throws FileNotFoundException {
		// Initialize variables
		File file = new File("100 Random Numbers.txt");
		PrintWriter pw = new PrintWriter(file);
		Random rand = new Random();
		
		// Write a random number to a line in the file 100 times
		for (int i = 0; i < 100; i++) {
			pw.print(rand.nextInt() + "\r\n");
		}
		
		// Close file
		pw.flush();
		pw.close();
	}

}
