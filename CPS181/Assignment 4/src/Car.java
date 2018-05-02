/*
================================================================
Author:      Alex Kim
Date:        2/21/18
Description: 
================================================================
*/

public class Car extends Automobile {
	String type, category;

	public Car (int s, int w, String m, int g, String t, String c) {
		super ( s, w, m, g);
		type = t;
		category = c;
	}
	
	public String toString() {
		return String.format("%s, %s, %s", super.toString(), type, category);
	}
}
