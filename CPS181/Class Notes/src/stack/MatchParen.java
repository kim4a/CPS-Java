package stack;

import java.util.Stack;

public class MatchParen {
	public static void main(String[] args) {
		String s = "((()()))";
		if (valid(s))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
	
	public static boolean valid(String s) {
		Stack<Character> stk = new Stack<Character>();
		int n = s.length();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(')
				stk.push(c);
			else if (c == ')')
				stk.pop();
		}
		return stk.isEmpty();
	}
}
