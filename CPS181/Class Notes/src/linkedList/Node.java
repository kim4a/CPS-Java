package linkedList;

public class Node {
	String name;
	int age;
	Node next;
	
	public Node(String aname, int anAge) {
		this.name = aname;
		this.age = anAge;
		next = null;
	}
	
	public String toString() {
		String output = name + " " + age;
		return output;
	}
	
}
