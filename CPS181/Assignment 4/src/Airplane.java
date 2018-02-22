/*
================================================================
Author:      Alex Kim
Date:        2/21/18
Description: 
================================================================
*/

public class Airplane implements Vehicle {
	private int speed, weight, seats;
	private String model;
	
	public Airplane (int s, int w, String m, int t) {
		speed = s;
		weight = w;
		model = m;
		seats = t;
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
	
	public int getSeats() {
		return seats;
	}
	
	public String toString() {
		return String.format("%d, %d, %s, %d", speed, weight, model, seats);
	}
}
