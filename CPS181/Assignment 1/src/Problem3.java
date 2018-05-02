import java.util.Scanner;

/*
 ================================================================
 Author:      Alex Kim
 Date:        1/13/18
 Description: Display a number of prime numbers
 ================================================================
*/

public class Problem3 {

	public static void main(String[] args) {
		
		// Initialize variables
		Scanner sc = new Scanner(System.in);
		int limit = 0;
		int num = 1;
		
		// Prompt number of prime numbers
		System.out.println("How many prime numbers do you want?");
		limit = sc.nextInt();
		
		// Print prime numbers
		while (limit > 0) {
			if (isPrime(num)) {
				System.out.print(num + " ");
				limit--;
			}
			num++;
		}
	}
	
	public static boolean isPrime(int num) {
		if (num == 0) return false;
		
		// Multiply all combinations of 2 to num
		for (int i = 2; i <= num; i++) {
			for (int j = 2; j <= num; j++) {
				if (i * j == num) {
					return false;
				}
			}
		}
		return true;
	}
}
