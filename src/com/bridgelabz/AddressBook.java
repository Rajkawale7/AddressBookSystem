package com.bridgelabz;

import java.io.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AddressBook {
	Scanner scanner = new Scanner(System.in);

	/** gets user's info **/
	void addAPerson() {
		System.out.print("Enter first and last name: ");
		String firstName = scanner.next();
		String lastName = scanner.next();
		
		System.out.print("Enter complete address: ");
		scanner.nextLine();
		String address = scanner.nextLine();
		
		System.out.print("Enter city, state and zip: ");
		String city = scanner.next();
		String state = scanner.next();
		String zip = scanner.next();
		
		System.out.println("Enter phone number: ");
		String phoneNumber = scanner.next();
		
		Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
		JSONObject jsonObject = person.toJsonObject();
		
		writeBook(jsonObject);
	}
}