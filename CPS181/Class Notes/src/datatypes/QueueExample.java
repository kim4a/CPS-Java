package datatypes;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		//LinkedList<Integer> q = new LinkedList<Integer>();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();

		q.add(23);
		q.add(24);
		q.add(25);
		q.add(26);
		q.add(27);
		q.add(28);
		System.out.println(q);
		
		q.remove();
		q.remove();
		System.out.println(q);
		
		q.add(0);
		System.out.println(q);
		
		System.out.println("Head of q is " + q.peek());
	}

}

/*

With LinkedList:

[23, 24, 25, 26, 27, 28]
[25, 26, 27, 28]
[25, 26, 27, 28, 0]
Head of q is 25

With PriorityQueue:

[23, 24, 25, 26, 27, 28]
[25, 26, 27, 28]
[0, 25, 27, 28, 26]
Head of q is 0

*/