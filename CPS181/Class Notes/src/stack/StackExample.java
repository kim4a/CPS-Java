package stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		// Initialize stack
		Stack<Integer> stack = new Stack<Integer>();
		
		// Push numbers into stack
		stack.push(25);
		stack.push(24);
		stack.push(23);
		stack.push(22);
		stack.push(21);
		stack.push(20);
		stack.push(19);
		stack.push(18);
		System.out.println(stack);
		
		// Remove top of stack (last number pushed into stack)
		stack.pop();
		System.out.println(stack);
		
		// Get top of stack without removing
		System.out.println("Stack top is " + stack.peek());
		
		// Remove all elements from stack
		while (!stack.empty()) {
			stack.pop();
		}
		System.out.println(stack);
		
	}

}
