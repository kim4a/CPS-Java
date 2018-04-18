import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/*
 ================================================================
 Author:      Alex Kim
 Date:        4/16/18
 Description: Reverses list of states using stack datatype
 ================================================================
*/

public class ReverseStateList {

	private static Scanner sc;

	public static void main(String[] args) throws FileNotFoundException {
		
		// Declare variables
		File f = new File("statePopulation.txt");
		sc = new Scanner(f);
		ArrayList<State> stateList = new ArrayList<State>();
		Stack<State> stateStack = new Stack<State>();
		
		// Write data to stateList
		while (sc.hasNextLine()) {
			String temp = sc.next();
			while (!sc.hasNextInt())
				temp += " " + sc.next();
			State newState = new State(temp, sc.nextInt());
			stateList.add(newState);
		}
		
		// Sort stateList
		Collections.sort(stateList);
		for (State x : stateList)
			System.out.println(x.toString());
		
		// Stack states
		for (State x : stateList)
			stateStack.push(x);
		
		// Print reversed stateList
		System.out.println("Reversed list:");
		while(!stateStack.isEmpty())
			System.out.println(stateStack.pop().toString());
		
	}

}
