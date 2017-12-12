import java.util.Scanner;

/*
================================================================
Author:     Alex Kim
Date:       9/20/17
Description:Define abbreviated messages
================================================================
*/

public class MessageAbbrDecoder {
	
	private static Scanner scr;

	public static void main(String[] args) {
		// Declare variables
		scr = new Scanner(System.in);
		String msg = "";
		
		// Ask for abbreviation
		System.out.println("Input an abbreviation:");
		msg = scr.next();
		msg = msg.toLowerCase();
		
		// Convert abbreviation into message
		if (msg.equals("lol")) {
			msg = "laughing out loud";
		}
		else if (msg.equals("idk")) {
			msg = "I don't know";
		}
		else if (msg.equals("bff")) {
			msg = "best friends forever";
		}
		else if (msg.equals("imho")) {
			msg = "in my humble opinion";
		}
		else if (msg.equals("tmi")) {
			msg = "too much information";
		}
		else {
			msg = "Unknown";
		}
		
		// Print abbreviation
		System.out.println(msg);
	}
}
