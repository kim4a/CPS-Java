package liststructure;

import java.io.PrintStream;
import java.util.ArrayList;

import television.TV;

public class TestArrayList {
	
	final static PrintStream p = System.out;

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		
		 for (int x : intArray) {
			 integerList.add(x);
		 }

		 p.println(integerList);
		 
		 integerList.add(6);
		 p.println(integerList);
		 
		 integerList.remove(3); // removes item at index 3
		 p.println(integerList);
		 
		 for (int i = 0; i < integerList.size(); i+= 2) {
			 p.printf("list[%d] = %d\n", i, integerList.get(i));
		 }
		 
		 ///////////////////////////////////////////////////////
		 
		 ArrayList<TV> TVList = new ArrayList<TV>();
		 
		 TVList.add(new TV(3));
		 TVList.add(new TV(5));
		 
		 for (TV t : TVList) {
			 t.powerOn();
			 p.println(t.getChannel());
		 }
	}

}
