package recursivemethods;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestRecursiveMethods {

	static PrintStream p = System.out;
	public static void main(String[] args) {
		int n = 9;
		int range = 50;
		List<Integer> aList = getData(n, range);
		p.println(aList);
		int smallest = RecursiveMethods.min(aList);
		p.printf("mip = %d\n", smallest);
		int smallIndex = RecursiveMethods.indexOfMin(aList);
		p.printf("min is at = %d\n", smallIndex);
		
		List<Integer> revList = RecursiveMethods.reverse(aList);
		p.println(revList);
		
		List<Integer> oddList = RecursiveMethods.oddElements(aList);
		p.println(oddList);
		
		// Due to the way getData generates numbers, there is never negative numbers but this method still works!
		boolean hasNeg = RecursiveMethods.hasNegativeElement(aList);
		p.printf("Has negative = %b\n", hasNeg);
	}
	
	public static List<Integer> getData(int n, int range) {
		List<Integer> list = new ArrayList<Integer>();
		Random randnum = new Random();
		
		for (int i = 0; i < n; i++) {
			int num = randnum.nextInt(range);
			list.add(num);
		}
		
		return list;
	}
}
