package cmu;

public class StudentEmployee extends Employee implements Student {
	private double gpa;
	
	public StudentEmployee(String name, int age, double salary, double gpa) {
		super(name, age, salary);
		this.gpa = gpa;
	}
	
	public double getGPA() {
		return gpa;
	}
}
