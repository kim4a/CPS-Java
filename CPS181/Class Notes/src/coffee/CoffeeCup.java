package coffee;

public class CoffeeCup {
	int numSips;
	
	public CoffeeCup() {
		numSips = 0;
	}
	
	public void pourCoffee(int amount) {
		numSips = amount;
	}
	
	public void takeSip() {
		numSips--;
	}
	
	public boolean isEmpty() {
		return numSips == 0;
	}
}
