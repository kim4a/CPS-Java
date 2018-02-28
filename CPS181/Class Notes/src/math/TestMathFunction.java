package math;

import java.io.PrintStream;
import java.util.Scanner;

public class TestMathFunction {
	
	static PrintStream p = System.out;
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		p.print("Enter an integer: ");
		int n = sc.nextInt();
		p.print("Enter another integer: ");
		int m = sc.nextInt();
		
		//printFibSequence(n);
		
		int result = RecursiveMathFunctions.gcd(m, n);
		p.printf("gcd(%d,%d) = %d\n", m, n, result);
	}
	
	public static void printFibSequence(int n) {
		for (int i = 1; i <= n; i++) {
			long fib = RecursiveMathFunctions.fibonacci(i);
			p.printf("Fib(%2d) = %5d\n", i, fib);
		}
	}

}
