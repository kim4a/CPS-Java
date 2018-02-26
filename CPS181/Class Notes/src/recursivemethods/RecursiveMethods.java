package recursivemethods;

import java.util.ArrayList;
import java.util.List;

public class RecursiveMethods {
	public static int min(List<Integer> A) { // return min in list
		int n = A.size();
		if (n == 0) {
			return -99999;
		}
		if (n == 1) {
			return A.get(0);
		}
		int x = A.get(0);
		
		// Recursive step
		int y = min(A.subList(1, n));
		return x < y ? x : y;
	}
	
	public static int indexOfMin(List<Integer> A) {
		int n = A.size();
		if (n == 0) {
			return -1;
		}
		if (n == 1) {
			return 0;
		}
		int x = A.get(n-1);
		int index = indexOfMin(A.subList(0,n-1));
		int y = A.get(index);
		return x < y ? n-1 : index;
	}
	
	public static List<Integer> reverse(List<Integer> A) {
		List<Integer> B = new ArrayList<Integer>();
		int n = A.size();
		if (n == 0) {
			return B;
		}
		B.add(A.get(n-1));
		B.addAll(reverse(A.subList(0, n-1)));
		
		return B;
	}
	
	public static List<Integer> oddElements(List<Integer> A) {
		List<Integer> B = new ArrayList<Integer>();
		int n = A.size();
		if (n == 0) {
			return B;
		}
		int val = A.get(n-1);
		if (val % 2 != 0) {
			B.add(val);
		}
		B.addAll(oddElements(A.subList(0, n-1)));
		
		return B;
	}
	
	public static boolean hasNegativeElement(List<Integer> A) {
		int n = A.size();
		if (n == 0) {
			return false;
		}
		return A.get(0) < 0 || hasNegativeElement(A.subList(1, n));
	}
}
