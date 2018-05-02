package lists;

public class IntLinkedList {
	IntNode head, tail;
	
	public IntLinkedList() {
		head = null;
		tail = null;
	}
	
	public void add(int val) {
		IntNode node = new IntNode(val);
		add(node);
	}
	
	public void add(IntNode node) {
		if (head == null) {
			head = node;
			tail = node;
		}
		else {
			tail.setNext(node);
			tail = node;
		}
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		IntNode node = head;
		while (node != null) {
			buffer.append(node.getValue());
			node = node.getNext();
			if (node != null) {
				buffer.append(", ");
			}
		}
		return buffer.toString();
	}
}
