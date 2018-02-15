package cmu;

public class Staff extends Faculty {
	
	private String title;
	
	public Staff(String name, int age, double salary, String rank, String degree, String title) {
		super(name, age, salary, rank, degree);
		this.title = title;
	}
	
	public String toString() {
		return String.format("%s, %-15s", super.toString(), title);
	}
}
