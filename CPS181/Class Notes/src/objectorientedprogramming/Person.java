package objectorientedprogramming;

public class Person {
	
	// Instance variables
	private String fname, lname;
	private int age;
	double weight, height;
	
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
}
