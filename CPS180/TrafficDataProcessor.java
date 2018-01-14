import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 ================================================================
 Author:     Alex Kim
 Date:       11/5/17
 Description:Traffic stats
 ================================================================
*/

public class TrafficDataProcessor {

	public static void main(String[] args) throws FileNotFoundException {
		// Declare variables
		final int NUM_INTERSECTIONS = 12;
		File traffic = new File("traffic.txt");
		Scanner sc = new Scanner(traffic);
		int[][] arrTraffic = new int[NUM_INTERSECTIONS][2];
		//vehicleCount
		//accidentCount
		int maxAccidents = 0;
		double maxAccidentRate = 0;
		
		// Read data and write to array
		while (sc.hasNext()) {
			int intersectionNum = sc.nextInt();
			int crossTime = sc.nextInt();
			if (crossTime > 500) {
				arrTraffic[intersectionNum][1] += 1;
			}
			arrTraffic[intersectionNum][0] += 1;
		}
		
		// Get 
		
		
		// Get max accidents and max accident rate
		for (int i = 0; i < arrTraffic.length; i++) {
			if (arrTraffic[i][1] > maxAccidents)
				maxAccidents = arrTraffic[i][1];
			if ((double)arrTraffic[i][1] / arrTraffic[i][0] > maxAccidentRate)
				maxAccidentRate = (double)arrTraffic[i][1] / arrTraffic[i][0];
		}
		
		// Print output
		System.out.println("ID		    Num.Vehicles	   Num. Accidents	   Accident Rate");
		System.out.println("-------------------------------------------------------------------------------------");
		for (int i = 0; i < arrTraffic.length; i++) {
			// Print intersection ID
			if (i < 10) {
				System.out.print(" ");
			}
			System.out.print(i + "			");
			// Num Vehicles
			System.out.print(arrTraffic[i][0] + "			");
			// Num Accidents
			if (arrTraffic[i][1] < 10) {
				System.out.print(" ");
			}
			System.out.print(arrTraffic[i][1] + "			");
			// Accident Rate
			System.out.println((double)(Math.round(((double)arrTraffic[i][1] / arrTraffic[i][0]) * 1000.0) / 1000.0));
		}
		System.out.println("Most accidents at any intersection: " + maxAccidents);
		System.out.println("Highest accident rate at any intersection: " + maxAccidentRate);
	}

}
