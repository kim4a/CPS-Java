package math;

public class RecursiveMathFunctions {
	
	public static int fibonacci(long n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static int gcd(int m, int n) {
		if (n == 0) {
			return m;
		}
		return gcd(n, m%n);
	}
}
