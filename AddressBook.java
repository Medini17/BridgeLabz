package com.bridgelabz.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddressBook {

	
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
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
		
		AdressDetails person = new AdressDetails(firstName, lastName, address, city, state, zip, phoneNumber);
		JSONObject jsonObject = person.toJsonObject();
		
		writeBook(jsonObject);
	}

	
	/** Edits a person;s information **/
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

	/** Deletes a person's information **/
	void delete(JSONArray bookArray, int i) {
		bookArray.remove(i);
		
		printWriter(bookArray);
		System.out.println("Contact deleted successfully");
	}

	/** Displays person's record **/
	void search(JSONObject jsonObject) {
		System.out.println("Name:\n" + jsonObject.get("First Name") + " " + jsonObject.get("Last Name"));
		System.out.println("Address:\n" + jsonObject.get("Address"));
		System.out.print(jsonObject.get("City") + ", ");
		System.out.print(jsonObject.get("State") + " - ");
		System.out.println(jsonObject.get("Zip"));
		System.out.println("Phone Number:\n" + jsonObject.get("Phone Number"));
	}

	/** Updates Address book **/
	void writeBook(JSONObject jsonObject) {
		JSONParser parser = new JSONParser();
		JSONArray bookArray = null;

		File file = new File("/home/bridgeit/Documents/addressbook.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			bookArray = new JSONArray();
		} else {
			try {
				bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Documents/addressbook.txt"));
			} catch (IOException | ParseException e) {
				e.printStackTrace();
			}
		}
		bookArray.add(jsonObject);
		printWriter(bookArray);
		System.out.println("Contact added successfully");
	}

	/** Reads json file and adds information to json array **/
	void commonPart(int choice) {
		JSONParser parser = new JSONParser();
		String firstName = scanner.next();
		String lastName = scanner.next();
		JSONArray bookArray = null;

		try {
			bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/Documents/addressbook.txt"));
		} catch (IOException | ParseException e) {
			((Throwable) e).printStackTrace();
		}

		Iterator iterator = bookArray.iterator();
		int i = 0;
		boolean b = false;
		outer:
		while (iterator.hasNext()) {
			JSONObject jsonObject = (JSONObject) iterator.next();
			if (jsonObject.get("First Name").equals(firstName) && jsonObject.get("Last Name").equals(lastName)) {
				b = true;
				switch (choice) {
				case 2:
					edit(jsonObject, bookArray, i);
					break outer;
				case 3:
					delete(bookArray, i);
					break outer;
				case 4:
					search(jsonObject);
					break outer;
				}
			}
			i++;
		}
		if(!b) {
			System.out.println("\nSorry!!! Person not found...");
		}
	}

	/** Writes all the data to a file **/
	void printWriter(JSONArray bookArray) {
		try {
			PrintWriter printWriter = new PrintWriter("/home/bridgelabz/Documents/addressbook.txt");
			printWriter.write(bookArray.toJSONString());
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}