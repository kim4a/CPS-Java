/*
 ================================================================
 Author:     Alex Kim
 Date:       11/26/17
 Description:Read file and calculate average distance between all atoms within a limit.
 ================================================================
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Atoms {

	private static Scanner sc;

	public static void main(String[] args) throws FileNotFoundException {
		// Declare variables
		final double MIN_DIS = 2.0;
		final double MAX_DIS = 4.0;
		File atoms = new File("ATOMS.DAT");
		sc = new Scanner(atoms);
		int count = 0;
		double distTotal = 0.0;
		double distAvg = 0.0;
		
		// Read number of atoms in file
		int atomCount = Integer.parseInt(sc.nextLine().trim());
		
		// Create array of data points
		double[][] atomData = new double[4][atomCount]; // Create array [type][x][y][z]
		sc.nextLine(); // Skip comments
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < atomCount; j++) {
				atomData[i][j] = sc.nextDouble();
			}
		}
		
		// Calculate distance for all atom pairs
		for (int i = 0; i < atomCount; i++) {
			for (int j = 0; j < atomCount; j++) {
				if (j > i) { // Don't test atoms against themselves or repeat previous tests!
					double dist = getDistance(
							atomData[1][i],
							atomData[2][i],
							atomData[3][i],
							atomData[1][j],
							atomData[2][j],
							atomData[3][j]
									);
					
					// If distance is between max and min limits
					if (dist < MAX_DIS && dist > MIN_DIS) {
//						System.out.println(
//								"sqrt((" +
//								atomData[1][j] + "-" +
//								atomData[1][i] + ")^2 + (" +
//								atomData[2][j] + "-" +
//								atomData[2][i] + ")^2 + (" +
//								atomData[3][j] + "-" +
//								atomData[3][i] + ")^2)"
//										);
						count++;
						distTotal += dist;
					}
				}
			}
		}
		
		// Calculate average
		distAvg = distTotal / count;
		
		// Print output
		System.out.println("The average of distances in range is " + distAvg);
	}
	
	public static double getDistance(double x1, double y1, double z1, double x2, double y2, double z2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
	}
}
