import java.util.Collections;
import java.util.List;

public class RecursiveMethods {
	
	// Check if list has duplicate integers
	public static boolean hasRepeats(List<Integer> list) {
		
		if (list.size() > 1) { // list still has elements to check
			Collections.sort(list); // sort list
			if (list.get(0) == list.get(1)) { // list has duplicates
				return true;
			}
			else { // remove first element in list and rerun method
				list.remove(0);
				return hasRepeats(list);
			}
		}
		return false;
	}
	
	// note: char a is less than char b
	
	public static String mergeAlphabetizedStrings(String s1, String s2) {
		if (s1.length() < 1) { // if s1 is empty, all of s2 comes after s1
//			System.out.println("flag 1" + s2);
			return s2;
		}
		else if (s2.charAt(0) < s1.charAt(0)) { // if the first character in s2 comes before s1
			
			// put the first character in s2 in front of s1
			s1 = s2.substring(0, 1) + s1;
			s2 = s2.substring(1);
//			System.out.println("flag 2" + s2);
			
			// if there are more characters to merge, rerun method, else return s1
			if (s2.length() > 0)
				return mergeAlphabetizedStrings(s1, s2);
			else
				return s1;
		}
		else { // if the first character in s2 does not come before s1
//			System.out.println("flag 3" + s2);
			
			// remove the first character in s1 and rerun the method
			return s1.substring(0, 1) + mergeAlphabetizedStrings(s1.substring(1), s2);
		}
	}
	
	public static void crossRiver(int n) {
		
		// Print header
		System.out.println("     side A        river    side B");
		System.out.println("--------------------------------------------");
		
		// Ferry first soldier
		FerryingOneSoldier(n, 0);
		if (n - 1 > 0)
			crossRiver(n - 1, 1);
	}
	
	public static void crossRiver(int n, int o) {
		
		// Ferry all soldiers after first soldier
		FerryingOneSoldier(n, o);
		if (n - 1 > 0)
			crossRiver(n - 1, o + 1);
	}
	
	public static void FerryingOneSoldier(int ls, int rs) { // hard coded diagram of how ferrying soldiers problem works
		// ls = left soldiers, rs = right soldiers
		System.out.printf("%d soldiers, 2 boys\n", ls);
		System.out.printf("%d soldiers,        ----> %d soldiers, 2 boys\n", ls, rs);
		System.out.printf("%d soldiers, 1 boy  <---- %d soldiers, 1 boy\n", ls, rs);
		System.out.printf("%d soldiers, 1 boy  ----> %d soldiers, 1 boy\n", ls - 1, rs + 1);
		System.out.printf("%d soldiers, 2 boys ----> %d soldiers\n", ls - 1, rs + 1);
		System.out.println("--------------------------------------------");
	}
}

