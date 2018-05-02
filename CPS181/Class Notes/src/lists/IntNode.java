package lists;

public class IntNode {
	int value;
	IntNode next;
	
	public IntNode() {
		this(0, null);
	}
	
	public IntNode(int initValue) {
		this(initValue, null);
	}
	
	public IntNode(int initValue, IntNode node) {
		value = initValue;
		next = node;
	}
	
	public IntNode getNext() {
		return next;
	}
	
	public void setValue(int v) {
		value = v;
	}
	
	public void setNext(IntNode node) {
		next = node;
	}

	public Object getValue() {
		return value;
	}
	
}
