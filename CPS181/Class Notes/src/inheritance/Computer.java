package inheritance;

public class Computer extends Item {
	String brand;
	
	public Computer(String name, String b) {
		super(name);
		brand = b;
	}
	
	public String getBrand() {
		return brand;
	}
}
