/*
 ================================================================
 Author:      Alex Kim
 Date:        1/13/18
 Description: Test two time periods for overlap
 ================================================================
*/

public class Problem2 {

	public static void main(String[] args) {
		
		// Call tests
		overLapTest(9, 12, 11, 13);
		overLapTest(9, 12, 14, 15);
	}
	
	public static boolean overLap(int start1, int end1, int start2, int end2) { // Does not support periods crossing midnight
		if (end1 < start2 && start1 + 24 > end2) return false; // Period 1 is before period 2
		else if (end2 < start1 && start2 + 24 > end1) return false; // Period 2 is before period 1
		else return true;
	}
	
	public static void overLapTest( int start1, int end1, int start2, int end2) {
		System.out.println("Time periods (" + start1 + " - " + end1 + ") and (" + start2 + " - " + end2 + ") overlap: " + overLap(start1, end1, start2, end2));
	}
}
