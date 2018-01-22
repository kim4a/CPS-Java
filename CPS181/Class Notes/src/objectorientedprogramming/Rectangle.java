package objectorientedprogramming;

public class Rectangle {
	
	private double width, height;

	Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	public double area() {
		return width * height;
	}
	
	public void display() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
