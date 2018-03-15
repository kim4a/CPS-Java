import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRecursiveMethods {

	public static void main(String[] args) {
		
		// (1) Test lists for duplicate elements
		List<Integer> list11 = new ArrayList<>(Arrays.asList(25, 48, 27, 30, 5, 0, 31, 43, 31));
		System.out.println(RecursiveMethods.hasRepeats(list11));
		List<Integer> list12 = new ArrayList<>(Arrays.asList(23, 11, 35, 9, 43, 45, 22, 19, 15));
		System.out.println(RecursiveMethods.hasRepeats(list12));
		List<Integer> list13 = new ArrayList<>(Arrays.asList(2, 6, 42, 47, 12, 17, 26, 32, 42));
		System.out.println(RecursiveMethods.hasRepeats(list13));
		List<Integer> list14 = new ArrayList<>(Arrays.asList(11, 7, 8, 1, 26, 31, 44, 30, 3));
		System.out.println(RecursiveMethods.hasRepeats(list14));
		
		// (2) Merge and alphabetize two alphabetical strings
		System.out.println(RecursiveMethods.mergeAlphabetizedStrings("bbcdfg", "aabceeg"));
		System.out.println(RecursiveMethods.mergeAlphabetizedStrings("flossy", "floor"));
		System.out.println(RecursiveMethods.mergeAlphabetizedStrings("below", "almost"));
		System.out.println(RecursiveMethods.mergeAlphabetizedStrings("effort", "accent"));
		
		// (3) Ferrying soldiers simulation
		RecursiveMethods.crossRiver(3);
		RecursiveMethods.crossRiver(4);
		RecursiveMethods.crossRiver(5);
	}

}
