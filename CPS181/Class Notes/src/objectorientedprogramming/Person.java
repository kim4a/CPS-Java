package objectorientedprogramming;

import bmi.BMI;

public class Person {
	
	// Instance variables
	private String fname, lname;
	private int age;
	double weight, height;
	BMI bmi;
	
	Person(String fn, String ln, int a) {
		fname = fn;
		lname = ln;
		age = a;
	}

	public void setWeight(int w) {
		weight = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public void display() {
		System.out.printf("%s %s %d\n", fname, lname, age);
	}
	
	public void birthDay() {
		age++;
	}
	
	public String getHealthStatus() {
		if (bmi == null)
			bmi = new BMI(weight, height);
		return bmi.getStatus();
	}
}
