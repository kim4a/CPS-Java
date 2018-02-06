package inheritance;

import java.util.ArrayList;

public class TestItem {
	
	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		
		ProduceItem b = new ProduceItem("banana", 0.69);
		Computer c = new Computer("Mac", "Apple");
		
		items.add(b);
		items.add(c);

		System.out.println(items.get(0));
	}
}
