/*
================================================================
Author:      Alex Kim
Date:        2/21/18
Description: 
================================================================
*/

public class Truck extends Automobile {
	private double cargo;
	private int wheels;
	
	public Truck (int s, int w, String m, int g, double c, int h) {
		super(s, w, m, g);
		cargo = c;
		wheels = h;
	}
	
	public double getCargo() {
		return cargo;
	}
	
	public String toString() {
		return String.format("%s, %d, %d", super.toString(), cargo, wheels);
	}
}
