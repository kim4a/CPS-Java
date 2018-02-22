/*
================================================================
Author:      Alex Kim
Date:        2/21/18
Description: 
================================================================
*/


public class Automobile implements Vehicle {
	private int speed, weight, mpg;
	private String model;
	
	public Automobile (int s, int w, String m, int g) {
		speed = s;
		weight = w;
		model = m;
		mpg = g;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getModel() {
		return model;
	}
}
