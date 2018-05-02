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
		
		System.out.println(p1.getHealthStatus());
	}
	
}
