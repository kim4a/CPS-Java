package linkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/linkedList/names.txt");
		sc = new Scanner(file);
		LinkedList namesList = new LinkedList();
		String aName = null;
		int anAge = 0;
		
		while (sc.hasNext()) {
			aName = sc.next();
			anAge = sc.nextInt();
			//System.out.println(aName + " " + anAge);
			namesList.addNode(aName, anAge);
		}
		
		namesList.printList();
	}

}
