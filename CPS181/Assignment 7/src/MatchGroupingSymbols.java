import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/*
================================================================
Author:      Alex Kim
Date:        4/16/18
Description: Determine if file has correctly grouped symbol pairs
================================================================
*/

public class MatchGroupingSymbols {

	private static Scanner sc;

	public static void main(String[] args) throws FileNotFoundException {
		
		// Declare variables
		File f = new File("src/ReverseStateList.java");
		sc = new Scanner(f);
		Stack<Character> charStack = new Stack<Character>();
		boolean error = false;
		
		// Fill stack with grouping symbols
		System.out.println("Filling stack...");
		while (sc.hasNext() && !error) {
			String temp = sc.next();
			for (int i = 0; i < temp.length(); i++) {
				if (temp.charAt(i) == '(' || temp.charAt(i) == '{' || temp.charAt(i) == '[' ) {
					charStack.push(temp.charAt(i));
					System.out.println(charStack.toString());
				}
				else if (temp.charAt(i) == ')') {
					if (charStack.isEmpty()) {
						System.out.println("Incorrect pair of grouping symbols! Missing '('.");
						error = !error;
					}
					else if (charStack.pop() == '(')
						System.out.println(charStack.toString());
					else {
						System.out.println("Incorrect pair of grouping symbols! Missing '('.");
						error = !error;
					}
				}
				else if (temp.charAt(i) == '}') {
					if (charStack.isEmpty()) {
						System.out.println("Incorrect pair of grouping symbols! Missing '{'.");
						error = !error;
					}
					else if (charStack.pop() == '{')
						System.out.println(charStack.toString());
					else {
						System.out.println("Incorrect pair of grouping symbols! Missing '{'.");
						error = !error;
					}
				}
				else if (temp.charAt(i) == ']') {
					if (charStack.isEmpty()) {
						System.out.println("Incorrect pair of grouping symbols! Missing '['.");
						error = !error;
					}
					else if (charStack.pop() == '[')
						System.out.println(charStack.toString());
					else {
						System.out.println("Incorrect pair of grouping symbols! Missing '['.");
						error = !error;
					}
				}
			}
		}
		if (!charStack.isEmpty() && !error) {
			if (charStack.peek() == '(')
				System.out.println("Incorrect pair of grouping symbols! Missing ')'.");
			if (charStack.peek() == '{')
				System.out.println("Incorrect pair of grouping symbols! Missing '}'.");
			if (charStack.peek() == '[')
				System.out.println("Incorrect pair of grouping symbols! Missing ']'.");
		}
			
	}

}
