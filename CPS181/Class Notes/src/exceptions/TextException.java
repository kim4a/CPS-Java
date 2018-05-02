package exceptions;

import java.io.PrintStream;
import java.util.Scanner;

public class TextException {
	static PrintStream p = System.out;
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		p.print("Enter a score: ");
		
		int score;
		try {
			score = getScore(stdin);
			char grade = letterGrade(score);
			p.printf("Grade is %c\n", grade);
		}
		catch (Exception e) {
			p.println(e);
			main(args);
		}
	}
	
	public static int getScore(Scanner scan) throws Exception {
		int score = scan.nextInt();
		if (score < 0 || score > 100)
			throw new Exception("out of range");
		else
			return score;
	}
	
	public static char letterGrade(int score) {
		int s = score / 10;
		
		char[] x = {'D', 'C', 'B', 'A', 'A'};
		if (s < 6) return 'E';
		else return x[s-6];
	}
}
