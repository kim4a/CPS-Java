
public class PrintFNotes {

	public static void main(String[] args) {
		String[] stringArray = {"One", "Two", "Three", "Four", "Five"};
		float[] floatArray = {1.111f, 2.222f, 3.333f, 4.444f, 5.555f};
		for (int i = 0; i < 5; i++) System.out.printf("%f-5s\t%1.2f\n", stringArray, floatArray);
	}

}
