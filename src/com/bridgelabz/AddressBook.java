package com.bridgelabz;

import java.io.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AddressBook {
	Scanner scanner = new Scanner(System.in);

	/** Edits a person's information **/
	void edit(JSONObject jsonObject, JSONArray bookArray, int i) {
		System.out.println("What do you want to edit?");
		System.out.println("1. Address");
		System.out.println("2. Phone Number");
		
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Enter address: ");
			scanner.nextLine();
			
			String address = scanner.nextLine();
			System.out.print("Enter city, state and zip: ");
			String city = scanner.next();
			String state = scanner.next();
			String zip = scanner.next();
			
			jsonObject.put("Address", address);
			jsonObject.put("City", city);
			jsonObject.put("State", state);
			jsonObject.put("Zip", zip);
			break;

		case 2:
			System.out.println("Enter phone number: ");
			String phoneNumber = scanner.next();
			jsonObject.put("Phone Number", phoneNumber);
			break;
		}
		bookArray.remove(i);
		bookArray.add(i, jsonObject);
		
		printWriter(bookArray);
		System.out.println("Contact updated successfully");
	}
