/*
 ================================================================
 Author:     Alex Kim
 Date:       10/25/17
 Description:Find centered average of an array
 ================================================================
*/

public class CenteredAverage {

	public static void main(String[] args) {
		// Declare variables
//		int[] testArr = {1, 2, 3, 4, 100};
//		int[] testArr = {1, 1, 5, 5, 10, 8, 7};
		int[] testArr = {-10, -4, -2, -4, -2, 0};
//		int[] testArr = {0, -5, -7, 0};
		
		// Print output
		System.out.print("Centered average of {");
		for (int i = 0; i < testArr.length; i++ ) {
			System.out.print(testArr[i]);
			if (i != testArr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("} is ");
		
		// Declare variables
		int max = 0, min = 0, maxIndex = 0, minIndex = 0, avg = 0;
		
		// find average
		for (int i = 0; i < testArr.length; i++) {
			if (testArr[i] > max || i == 0) {
				max = testArr[i];
				maxIndex = i;
			}
			if (testArr[i] < min || i == 0) {
				min = testArr[i];
				minIndex = i;
			}
		}
		for (int i = 0; i < testArr.length; i++) {
			if (i != minIndex && i != maxIndex) {
				avg += testArr[i];
			}
		}
		avg = avg / (testArr.length - 2);
		System.out.println(avg);
	}

}
