package linkedList;

import java.io.File;
import java.util.Scanner;

public class LinkedList {
	
	Node head, tail, temp;
	
	public LinkedList() {
		head = null;
		tail = null;
		temp = null;
	}
	
	public void addNode(String aName, int anAge) {
		temp = new Node(aName, anAge);
		//System.out.println(temp.toString());
		linkItIn(temp);
	}
	
	private void linkItIn(Node temp2) {
		temp = head;
		if (head == null) { // List is empty
			head = temp2;
		}
		else {
			while(temp.next != null) { // Go to the end of the list
				temp = temp.next;
			}
			temp.next = temp2; // Add in the new node
		}
	}
	
	public void printList() {
		System.out.println("\nThe list is:");
		temp = head;
		if (temp == null) {
			System.out.println("List is empty");
		}
		else {
			while (temp != null) {
				System.out.println(temp.toString());
				temp = temp.next;
			}
		}
	}
}
