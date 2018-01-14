
public class Geometry {

	public static void main(String[] args) {

		Circle c1 = new Circle(1);
		Circle c2 = new Circle(3);
		Rectangle r1 = new Rectangle(4, 6);
		
		// Calculate the areas
		System.out.println("C1: radius = " + c1.radius + ", area = " + c1.calculateArea());
		System.out.println("C2: radius = " + c2.radius + ", area = " + c2.calculateArea());
		System.out.println("Area of R1: " + r1.calculateArea());
		
		// Calculate the perimeter
		System.out.println("C1: radius = " + c1.radius + ", perimeter = " + c1.calculatePerimeter());
		System.out.println("C2: radius = " + c2.radius + ", perimeter = " + c2.calculatePerimeter());
		System.out.println("Perimeter of R1: " +r1.calculatePerimeter());
		
		
		// Draw rectangle
		r1.drawRectangle();
	}

}
