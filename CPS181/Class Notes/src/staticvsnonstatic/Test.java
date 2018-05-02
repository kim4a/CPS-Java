package staticvsnonstatic;

public class Test {
	
	public static void main(String[] args) {
		A a = new A(10);
		A b = new A(11);

		a.setY(5);
		System.out.println(a); // Prints 10, 5
		
		b.setY(6);
		System.out.println(b); // Prints 11, 6
		
		System.out.println(a); // Prints 10, 6
	}
}
