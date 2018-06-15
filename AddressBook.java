/**
 * 
 */
package com.bridgelabz.addressbook;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */
public class AddressBook 
{

	boolean changedSinceLastSave;
    Utility u=new Utility();
	public void addPerson() throws Exception 
	{	
		System.out.println("enter 1. to add person to new Address book");
		System.out.println("enter 2. to add person to existing Address book");
		System.out.println("enter your chioice");
	     switch(u.inputInteger()) 
	     {
			
	     case 1:
	    	 UtilityAddressBook.addPerson();
	     break;
		
	     case 2:	
	    	  
	    	 UtilityAddressBook.addPersonToexistingfile();
	     break;
		}
	}

	public void doEdit() throws Exception 
	{
		System.out.println("enter the index value ");
		int index =u.inputInteger();
		UtilityAddressBook.editinformation(index);

	}

	public void remove() throws Exception 
	{
		System.out.println("enter the file name from whrere it has to be  be deleted");
		String filename = u.getString();
		System.out.println("enter the index value ");
		int index =u.inputInteger();
		String file1 = "/home/bridgelabz/Documents/AddressBook/"+filename+".json";
		UtilityAddressBook.remove(index,file1);

	}

	public void sort() throws Exception
	{
		UtilityAddressBook.sort();
	}
}