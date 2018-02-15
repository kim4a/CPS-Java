package staticvsnonstatic;

public class A {
	private int x; //  non-static means that all instances of this class have their own variable
	static private int y; // static means that all instances of this class share this variable
	
	public A(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return x + ", " + y;
	}
}
