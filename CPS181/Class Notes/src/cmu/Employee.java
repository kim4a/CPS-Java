package cmu;

public class Employee implements Person {
	
	private String name;
	private int age;
	private double salary;
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return String.format("%-20s, %3d, %10.2f", name, age, salary);
	}

}
