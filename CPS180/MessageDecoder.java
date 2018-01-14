import java.util.Scanner;

/*
 ================================================================
 Author:     Alex Kim
 Date:       9/20/17
 Description:Decode messages containing abbreviations
 ================================================================
*/

public class MessageDecoder {
	
	private static Scanner scr;

	public static void main(String[] args) {
		
		// Declare variables
		scr = new Scanner(System.in);
		String msg = "";
		
		// Ask for message
		System.out.println("Please enter a coded message:");
		msg = scr.nextLine();
		msg = msg.toLowerCase();
		
		// Decode message
		msg = msg.replace("bff", "best friends forever");
		msg = msg.replace("idk", "I don't know");
		msg = msg.replace("jk", "just kidding");
		msg = msg.replace("tmi", "too much information");
		msg = msg.replace("ttyl", "talk to you later");
		
		System.out.println("The original message should be: " + msg);

	}

}
