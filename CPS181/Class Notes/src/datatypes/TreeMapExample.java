package datatypes;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<String, Double> map = new TreeMap<String, Double>();
		map.put("apple", 1.0);
		map.put("orange", 2.99);
		map.put("banana", 3.99);

		System.out.println(map.get("orange"));
		System.out.println(map.toString());
	}

}

/*

2.99
{apple=1.0, banana=3.99, orange=2.99}

Note that keys are in order, unlike HashMap.

*/
