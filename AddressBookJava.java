/**
 * 
 */
package com.bridgelabz.oops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D 
 * Date:- 02/06/2018 
 * Purpose:
 */
public class AddressBookJava {
	static Utility u = new Utility();
	static String name = " ";		
	static Book[] library = new Book[0];


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		

		System.out.println("WELCOME");
		System.out.println("press 1 to create a new address book");
		System.out.println("press 2 to change the details in the already existing address book");
		int pressbutton = u.inputInteger();
		if (pressbutton == 1) {
			System.out.println("How many number of address books you want to create? ");
			int howManyBooks;
			int howManyEntries;
			while (true) {
				howManyBooks = s.nextInt();
				if (howManyBooks > 0) {
					library = new Book[howManyBooks]; // This code decides how many books are in the array of books/the
														// library
					break;
				} else
					System.out.print("You must create at least 1 address book.");
			}

			for (int i = 0; i < library.length; i++) {

				library[i] = new Book(); // Fixed reference to null because each book in the library had not been
											// initialized yet.

				while (true) {
					System.out.print("enter the number of entries in the address book " + i + "? ");
					howManyEntries = s.nextInt();
					if (howManyEntries > 0) {
						((com.bridgelabz.oops.Book) library[i]).initEntries(howManyEntries); // This code decides how
																								// many entries are in
																								// each book in the
																								// library
						break;
					} else
						System.out.println("You must create at least 1 Entry.");
				}

			}
			boolean done = false;
			int selectedBook = 0;
			int selection;
			while (done == false) {
				System.out.println("Book " + selectedBook + " is currently selected.");

				for (int i = 0; i < library[selectedBook].getEntries(); i++) {
					System.out.println("===========Entry " + i + " ===========");
					library[selectedBook].contents[i].readEntry(); // Accessing the array of entries INSIDE the array of
																	// books/the library
					System.out.println("================================");
				}

				System.out.println("Select an option!");
				System.out.println("1. Add an entry");
				System.out.println("2. Remove an entry");
				System.out.println("3. Edit an entry");
				System.out.println("4. Save the address book");
				System.out.println("5. Sort all entries in this book");
				System.out.println("6. Select another book");
				System.out.println("7. Move entry across books");
				System.out.println("8. Exit the menu");
				System.out.print("> ");
				selection = s.nextInt();
				String first, last, address, zipcode, state, city;
				switch (selection) {
				case 1:
					System.out.print("First name? ");
					first = s.next();
					System.out.print("Last name? ");
					last = s.next();
					System.out.print("Address? ");
					address = s.next();
					System.out.print("state? ");
					state = s.next();
					System.out.print("city");
					city = s.next();
					System.out.print("zip code");
					zipcode = s.next();
					library[selectedBook].add(first, last, address, zipcode, state, city);
					break;
				case 2:
					System.out.print("Remove which entry? ");
					int entry = s.nextInt();
					library[selectedBook].remove(entry);
					break;
				case 3:
					System.out.print("Edit which entry?");
					int whichEntry = s.nextInt();
					System.out.print("First name? ");
					first = s.next();
					System.out.print("Last name? ");
					last = s.next();
					System.out.print("Address? ");
					address = s.next();
					System.out.print("state");
					state = s.next();
					System.out.print("city? ");
					city = s.next();
					System.out.print("zip code ");
					zipcode = s.next();
					
					library[selectedBook].edit(first, last, address, zipcode, whichEntry);
					break;
				case 4:
					System.out.println("enter the name to save an address book");
					String Aname = u.getString();
					name += " " + Aname;
					System.out.println("address book name is " + name);
				case 5:
					System.out.println("Sort alphabetically by which field?");
					System.out.println("1. Sort by first name");
					System.out.println("2. Sort by last name");
					System.out.println("3. Sort by address");
					System.out.println("4. Sort by zipcode");
					library[selectedBook].sort(s.nextInt());
					break;
				case 6:
					System.out.print("Select which book?");
					selectedBook = s.nextInt();
					break;
				case 7:
					System.out.print("Move which entry? ");
					int entryNo = s.nextInt();
					Book.Entry entryToMove = library[selectedBook].contents[entryNo];
					library[selectedBook].remove(entryNo);
					System.out.print("To which book? ");
					int whichBook = s.nextInt();
					library[whichBook].addFromCopy(entryToMove);
					break;
				case 8:
					done = true;
					break;
				default:
					System.out.print("Please choose a valid menu number");

				}
			}
		
		
		}
		
		else {
		System.out.print("Move to which entry? ");
		int entryNo = s.nextInt();
		System.out.println("sorry!! You don't have any existing address book");
		System.out.println("you need to create a address book first");
	}
	}
}

