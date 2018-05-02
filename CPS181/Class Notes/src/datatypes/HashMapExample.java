package datatypes;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Double> hm = new HashMap<String, Double>();
		hm.put("apple", 1.0);
		hm.put("orange", 2.99);
		hm.put("banana", 3.99);
		
		System.out.println(hm.get("orange"));
		System.out.println(hm.toString());
	}

}

/*

2.99
{orange=2.99, banana=3.99, apple=1.0}

Note that keys are out of order. HashMap does not guarantee order, unlike TreeMap.

*/
