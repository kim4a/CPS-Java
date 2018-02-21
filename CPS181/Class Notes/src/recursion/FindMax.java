package recursion;

public class FindMax {

	public static void main(String[] args) {
		int[] values = {47, 14, 51, 83, 24, 8, 67};
		int largest = max(values, 0, values.length);
		System.out.printf("Largest = &d", largest);
	}
	
	public static int max(int[] A, int first, int last) {
		if (first == last)
			return A[first];
		int y = max(A, first + 1, last);
		int x = A[first];
		return (x > y) ? x : y;
	}

}
