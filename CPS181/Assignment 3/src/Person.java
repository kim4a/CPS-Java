/*
 ================================================================
 Author:      Alex Kim
 Date:        1/20/18
 Description: Person object has id, name, address, and phone number attributes.
 ================================================================
*/

public class Person {
	private int id;
	private double phoneNumber;
	private String name, address;

	// Declare values
	public Person(int newid, String newname, String newaddress, double newpn) {
		id = newid;
		name = newname;
		address = newaddress;
		phoneNumber = newpn;
	}
}
