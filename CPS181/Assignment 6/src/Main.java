import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/*
 ================================================================
 Author:      Alex Kim
 Date:        4/5/18
 Description: Sort country data by name, population, and growth rate
 ================================================================
*/

public class Main {

	private static Scanner sc;
	private static Scanner in;

	public static void main(String[] args) throws FileNotFoundException {
		
		// Declare variables
		File file = new File("countryData.txt");
		sc = new Scanner(file);
		in = new Scanner(System.in);
		ArrayList<Country> cList = new ArrayList<Country>();
		ArrayList<Country> sList = new ArrayList<Country>();
		int sortBy = 0; // variable to keep track of user sort preference
		
		// Populate list
		while (sc.hasNextLine()) {
			
			// Some countries have spaces in their name
			String temp = sc.next();
			while (!sc.hasNextInt())
				temp += " " + sc.next();
			
			Country newCountry = new Country(temp, sc.nextInt(), sc.nextDouble());
			cList.add(newCountry);
		}
		
		// Print list
		
		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
		
		// Prompt user for sorting attribute
		System.out.println("How would you like to sort the countries?");
		System.out.println("1: By name");
		System.out.println("2: By population");
		System.out.println("3: By population growth rate");
		System.out.println("Make a selection by typing a number and pressing enter.");
		while (sortBy < 1 || sortBy > 3) {
			sortBy = in.nextInt();
		}
		
		// Sort list
		sList = MyUtil.bubbleSort(cList, sortBy);
		
		// Print sorted list
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i).toString());
		}
	}

}
