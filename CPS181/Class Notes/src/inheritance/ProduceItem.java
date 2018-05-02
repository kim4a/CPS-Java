package inheritance;

public class ProduceItem extends Item{

	double price;
	
	public ProduceItem(String name, double price) {
		super(name);
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return String.format("%s, %.2f\n", this.getName(), this.getPrice());
	}
}
