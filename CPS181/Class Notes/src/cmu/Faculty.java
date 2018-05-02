package cmu;

public class Faculty extends Employee {
	private String rank, degree;
	
	public Faculty(String name, int age, double salary, String rank, String degree) {
		super(name, age, salary);
		this.rank = rank;
		this.degree = degree;
	}
	
	public String toString() {
		return String.format("%s, %-15s, %s", super.toString(), degree, rank);
	}
}