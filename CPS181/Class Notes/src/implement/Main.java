package implement;

public class Main {
	public static void main(String[] args) {
		//Calculator cal = new MyCalculator();
		Calculator cal = new YourCalculator();
		double result = cal.doCalculation(5.5, 3.3);
		System.out.print(result);
	}
}

// How implements works: https://stackoverflow.com/a/4558147