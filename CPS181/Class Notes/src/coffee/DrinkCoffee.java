package coffee;

public class DrinkCoffee {

	public static void main(String[] args) {
		CoffeeCup cup = new CoffeeCup();
		cup.pourCoffee(5);
		drink(cup);
	}
	
	public static void drink(CoffeeCup cup) {
		if (!cup.isEmpty()) {
			cup.takeSip();
			System.out.println("Nice coffee ...");
			drink(cup);
		}
		else {
			System.out.println("All gone!");
		}
	}

}
