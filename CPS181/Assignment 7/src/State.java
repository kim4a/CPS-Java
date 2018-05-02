
/*
 ================================================================
 Author:      Alex Kim
 Date:        4/16/18
 Description: 
 ================================================================
*/

public class State implements Comparable<State> {
	
	String state;
	int population;
	
	public State(String s, int p) {
		state = s;
		population = p;
	}

	@Override
	public int compareTo(State otherState) {
		if (population < otherState.population)
			return 1;
		if (population > otherState.population)
			return -1;
		return 0;
	}

	public String toString() {
		return String.format("%20s %-10d", state, population);
	}
}
