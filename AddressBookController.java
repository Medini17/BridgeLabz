/**
 * 
 */
package com.bridgelabz.addressbook;


import java.io.File;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */
public class AddressBookController 
{
	static Utility u=new Utility();
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Welcome to Address Book");
		AddressBook addressbook = new AddressBook();
		while(true) 
		{
		System.out.println("Enter 1 TO VIEW ADDRESS BOOK");
		System.out.println("Enter 2 TO ADD A ADDRESS BOOK ");
		System.out.println("Enter TO EXIT");
		
		int choice = u.inputInteger();
		switch (choice) 
		{
		case 1: 
		
			File folder = new File("/home/bridgelabz/Documents/AddressBook/");
			File[] listOfFiles = folder.listFiles();
			for (File file : listOfFiles) 
			{
				if (file.isFile()) 
				{
					System.out.println(file.getName());
				}
			}
			System.out.println("Enter the file name you want View");
			String filename =u.getString();
			String file = "/home/bridgelabz/Documents/AddressBook/" + filename + ".json";
			UtilityAddressBook.print(file);
			break;

		case 2:

		{
			System.out.println("Enter 1 to Add Person ");
			System.out.println("Enter 2 to Edit Person");
			System.out.println("Enter 3 to Delete Person");
			System.out.println("Enter 4 to Sort AddressBook");
			
			int choice1 =u.inputInteger();

			switch (choice1) 
			{
			case 1: 
			{

				addressbook.addPerson();

				break;
			}
			case 2: 
			{

				addressbook.doEdit();

				break;
			}
			case 3: 
			{

				addressbook.remove();

				break;
			}
			case 4:
				addressbook.sort();
			}
		}
			
			case 5:
				break;
		 }
	   }
   }
}
