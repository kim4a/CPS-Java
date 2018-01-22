package objectorientedprogramming;

public class Main {

	public static void main(String args[]) {
		
		Person p1, p2;
		
		p1 = new Person("Jane", "Sandy", 20);
		p2 = new Person("John", "Kyle", 43);
		
		p1.display();
		p2.display();
		
		p1.birthDay();
		p1.display();
		p1.setHeight(68);
		p1.setWeight(160);
		
		Rectangle rec = new Rectangle(10, 4);
		rec.display();
		
		double area = rec.area();
		System.out.printf("Area = %.2f\n", area);
		
		double[] w = {25, 30, 41};
		double[] h = {6, 8, 9};
		int n = w.length;
		
		Rectangle[] multiRec = new Rectangle[n];
		
		for (int i = 0; i < n; i++) {
			multiRec[i] = new Rectangle(w[i], h[i]);
		}
		
		for (Rectangle r : multiRec) {
			System.out.printf("Area = %.2f\n", r.area());
		}
	}
	
}
