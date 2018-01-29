package liststructure;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(52);
		list.add(61);
		list.add(14);
		list.add(23);
		
		System.out.printf("List has %d elements.\n", list.size());
		
		for (int i = 0; i < list.size(); i++ ) {
			System.out.printf("%4d\n", list.get(i));
		}
		
		System.out.println(list);
	}

}
