package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortingExample {

	public static void main(String[] args) {
		int n = 9;
		int range = 50;
		List<Integer> intList = getRandomList(n, range);
		
		System.out.println(intList);
		
		Collections.sort(intList);
		System.out.println(intList);
	}

	public static List<Integer> getRandomList(int n, int range) {
		List<Integer> list = new ArrayList<Integer>();
		Random randnum = new Random();
		
		for (int i = 0; i < n; i++) {
			int num = randnum.nextInt(range);
			list.add(num);
		}
		
		return list;
	}
}
