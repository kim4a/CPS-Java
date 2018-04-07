import java.util.ArrayList;

public class MyUtil {
	
	public static ArrayList<Country> bubbleSort(ArrayList<Country> argList, int sortBy) {
		int n = argList.size();
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < n - 1; i++) {
				if (argList.get(i).compareTo(argList.get(i + 1), sortBy) == 1) {
					// Swap items
					Country temp = argList.get(i);
					argList.set(i, argList.get(i + 1));
					argList.set(i + 1, temp);
					
					swapped = true;
				}
			}
		}
		return argList;
	}
	
}
