package com.bridgelabz;

import java.io.*;
import java.util.*;

public class AddressBook {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("***Welcome to the Address Book Program***");
		AddressBook addressBook = new AddressBook();
		addressBook.askUser();

}
	/** Menu **/
	void askUser() {
		System.out.println("Select an action..");
		System.out.println("1. Add a person");
		System.out.println("2. Edit");
		System.out.println("3. Delete a person");
		System.out.println("4. Search a person");
		System.out.println("5. Quit");
		
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			addAPerson();
			System.out.println("\n");
			askUser();
			break;
		case 2:
			System.out.print("Enter first and last name of the person to edit the contact: ");
			commonPart(choice);
			System.out.println("\n");
			askUser();
			break;
		case 3:
			System.out.print("Enter first and last name of the person to delete the contact: ");
			commonPart(choice);
			System.out.println("\n");
			askUser();
			break;
		case 4:
			System.out.print("Enter first and last name of the person to search: ");
			commonPart(choice);
			System.out.println("\n");
			askUser();
			break;
		default:
			break;
		}
	}
	private void commonPart(int choice) {
		// TODO Auto-generated method stub
		
	}
	private void addAPerson() {
		// TODO Auto-generated method stub
		
	}
}
	