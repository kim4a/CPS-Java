
public class Rectangle {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calculateArea() {
		return width * height;
	}
	
	public int calculatePerimeter() {
		if (width > 0 && height > 0) { // Test if rectangle even exists!!
			return 2 * (width + height);
		}
		else { // IT DOESN'T!!!!!!
			return 0;
		}
	}
	
	public void drawRectangle() {
		if (width > 0 && height > 0) { // Check if rectangle exists AT ALL!!
			for(int i = 0; i < width; i++) { // Print first row
				System.out.print("*");
			}
			System.out.println("");
			if (height > 1) { // Check if rectangle has vertical area
				for(int i = 0; i < height - 2; i++) {
					System.out.print("*");
					if (width > 1) { // Check if rectangle has horizontal area
						for (int j = 0; j < width - 2; j++) {
							System.out.print(" ");
						}
						System.out.println("*");
					}
					else { // Else go to next line
						System.out.println("");
					}
				}
				for(int i = 0; i < width; i++) { // Print final row
					System.out.print("*");
				}
			}
		}
	}
}
