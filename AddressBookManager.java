/**
 * 
 */
package com.bridgelabz.oops;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * 
 */
public class AddressBookManager {
	
		static Scanner scanner = new Scanner(System.in);
		static AddressBook addressBook = new AddressBook();

		public static void option() throws JsonGenerationException, JsonMappingException, IOException, ParseException, java.text.ParseException {
			System.out.println("Enter the operation to be done to AddressBook According to the options");
			System.out
					.println("\n 1] AddPerson \n 2] EditPerson \n 3] DeletePerson \n 4] sort by last name \n 5] sort by zipcode"
							+ "\n 6] createNewAddressBook \n 7] openExistAddressBook \n 8] saveAddressBook \n 9] quit addressbook");
			int choice = scanner.nextInt();
			performOperation(choice);
		}

		public static void performOperation(int choice)
				throws JsonGenerationException, JsonMappingException, IOException, ParseException, java.text.ParseException {
			switch (choice) {
			case 1:
				addressBook.add();
				break;
			case 2:
				System.out.println("enter the index");
				int index = scanner.nextInt();
				addressBook.edit(index);
				break;
			case 3:
				System.out.println("enter the index");
				int index1 = scanner.nextInt();
				addressBook.delete(index1);
				break;
			case 4:
				addressBook.sortByLastName();
				break;
			case 5:
				addressBook.sortByZipCode();
				break;

			case 6:
				addressBook.createNewAddressBook();
				break;
			case 7:
				addressBook.openExistAddressBook();
				break;
			case 8:
				addressBook.saveAddressBook();
				break;
			case 9:
				addressBook.quit();
				break;
			}
		}

		public static void main(String[] args)
				throws JsonGenerationException, JsonMappingException, IOException, ParseException, java.text.ParseException {
			System.out.println("adding first person to address book");
			addressBook.add();

		}

	}

