package com.bridgelabz;

import java.io.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AddressBook {
	/** Displays person's record **/
	void search(JSONObject jsonObject) {
		System.out.println("Name:\n" + jsonObject.get("First Name") + " " + jsonObject.get("Last Name"));
		System.out.println("Address:\n" + jsonObject.get("Address"));
		System.out.print(jsonObject.get("City") + ", ");
		System.out.print(jsonObject.get("State") + " - ");
		System.out.println(jsonObject.get("Zip"));
		System.out.println("Phone Number:\n" + jsonObject.get("Phone Number"));
	}
}