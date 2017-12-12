import java.util.Scanner;

public class StringParser {

	public static void main(String[] args) {
		// Declare variables
		Scanner sc = new Scanner(System.in);
		String input = "";
		int commaCount = 1;
		
		// Loop process
		while(!input.equals("q")) {
			// Get input
			System.out.println("Please enter a string:");
			input = sc.nextLine();
			if (!input.equals("q")) { // Don't analyze quit command
				// Print out substrings
				for (int i = 0; i < input.length(); i++) {
					if (input.charAt(i) == ',') { // Separate by comma
						System.out.println(""); // New line
						
						commaCount++;
						
						while (i < input.length() - 1 && input.charAt(i + 1) == ' ')
							i++; // Skip whitespace after comma
					}
					else { // Print character that isn't comma
						System.out.print(input.charAt(i));
					}
				}
				System.out.println("\nNumber of substrings: " + commaCount + "\n\n");
				commaCount = 1; // Reset comma count
			}
		}
		
		// Print exit statement
		System.out.println("Exit the program");
	}

}
