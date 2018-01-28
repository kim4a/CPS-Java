package objectorientedprogramming;

public class UseRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec = new Rectangle(25.4, 6.2);
		
		rec.display();
		System.out.printf("Area = %6.2f, perimeter = %5.1f\n", rec.area(), rec.perimeter());
	}

}
