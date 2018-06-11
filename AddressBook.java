package com.bridgelabz.oops;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class AddressBook {
	Utility u=new Utility();
	int count=0;
	String n1=" ";
	private static String firstName;
	private static String lastName;
	private static String address;
	private static String city;
	private static String state;
	private static long zipCode;
	private static String phoneNumber;
	static Scanner scanner = new Scanner(System.in);
	static PersonList personList = new PersonList();
	static Person person;
	AddressBookManager manage = new AddressBookManager();
	static ObjectMapper map = new ObjectMapper();
	static File FILEPATH = new File(
			"/home/bridgelabz/Documents/accountbook.json");
   
	/**
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 * @throws ParseException
	 * @throws java.text.ParseException 
	 * 
	 */
	public void add() throws JsonGenerationException, JsonMappingException, IOException, ParseException, java.text.ParseException {
		System.out.println("Enter how many details you need");
		int value = scanner.nextInt();

		for (int i = 0; i < value; i++) {
			person=new Person();
			System.out.println("Enter your first name");
			String name = scanner.next();
			person.setFirstName(name);
			System.out.println("Enter your last name");
			String nameLast = scanner.next();
			person.setLastName(nameLast);
			System.out.println("Enter your address");
			String add = scanner.next();
			person.setAddress(add);
			System.out.println("Enter your city");
			String city = scanner.next();
			person.setCity(city);
			System.out.println("Enter your state");
			String state = scanner.next();
			person.setState(state);
			System.out.println("Enter your zipcode");
			long zip = scanner.nextLong();
			person.setZipCode(zip);
			System.out.println("Enter your phone number");
			String phoneNumber = scanner.next();
			person.setPhoneNumber(phoneNumber);
			System.out.println();

			//person = new Person(name, nameLast, add, city, state, zip, phoneNumber);
			personList.getPlist().add(person);
			
		}
		
		JSONObject jsonOb = person.toJsonObject();
		map.writeValue((FILEPATH), personList);
		System.out.println(personList.getPlist().toString());
		showBook();
		manage.option();

		}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 * @throws ParseException
	 * @throws java.text.ParseException 
	 * 
	 */
	

	

	
	public void edit(int index) throws JsonGenerationException, JsonMappingException, IOException, ParseException, java.text.ParseException {
		showBook();

		System.out.println("Enter the option to be edited");
		System.out.println("1: To change Address");
		System.out.println("2: To change City");
		System.out.println("3: To change State");
		System.out.println("4: To change zipCode");
		System.out.println("5: To change Phonenumber");
		int option = scanner.nextInt();

		switch (option) {
		case 1:
			System.out.println("Enter new Address");
			String newAddress = scanner.next();

			person.setAddress(newAddress);
			map.writeValue((FILEPATH), person);
			
			break;
		case 2:
			System.out.println("Enter new city");
			String newCity = scanner.next();
			personList.getPlist().get(index).setCity(newCity);
			map.writeValue((FILEPATH), personList);
			
			
			break;
		case 3:
			System.out.println("Enter new state");
			String newState = scanner.next();
			personList.getPlist().get(index).setAddress(newState);
			map.writeValue((FILEPATH), personList);
			
			break;
		case 4:
			System.out.println("Enter new zipcode");
			String newZipcode = scanner.next();
			personList.getPlist().get(index).setAddress(newZipcode);
			map.writeValue((FILEPATH), personList);
			
			break;
		case 5:
			System.out.println("Enter new phone number");
			String newnumber = scanner.next();
			personList.getPlist().get(index).setAddress(newnumber);
			map.writeValue((FILEPATH), personList);
			
			break;
		}
		manage.option();
	}

	/**
	 * @throws ParseException
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 * @throws java.text.ParseException 
	 * 
	 */
	public void delete(int index) throws JsonGenerationException, JsonMappingException, IOException, ParseException, java.text.ParseException {
		personList.getPlist().remove(index);
		map.writeValue((FILEPATH), personList);
		showBook();
		manage.option();

	}

	/**
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 * @throws ParseException 
	 * @throws java.text.ParseException 
	 * 
	 */
	public void sortByLastName() throws JsonGenerationException, JsonMappingException, IOException, ParseException, java.text.ParseException {
for(int i=0;i<personList.getPlist().size()-1;i++) {
	for(int j=i+1;j<personList.getPlist().size();j++) {
		String temp=personList.getPlist().get(i).getLastName();System.out.println(temp);
		String temp2=personList.getPlist().get(j).getLastName();System.out.println(temp2);
		if(temp.compareTo(temp2)<0) {
			String temp3=temp;
			temp=temp2;
			temp2=temp3;
			map.writeValue((FILEPATH), personList);
		}
	}
}
map.writeValue((FILEPATH), personList);
showBook();
	manage.option();
	}

	/**
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 * @throws ParseException 
	 * @throws java.text.ParseException 
	 * 
	 */
	public void sortByZipCode() throws JsonGenerationException, JsonMappingException, IOException, ParseException, java.text.ParseException {
 
		for(int i=0;i<personList.getPlist().size()-1;i++) {
    	 for(int j=i+1;j<personList.getPlist().size();j++) {
    		long temp = personList.getPlist().get(i).getZipCode();
    	 System.out.println(temp);
    		long temp2 = personList.getPlist().get(j).getZipCode();
    		System.out.println(temp2);
    		 if (temp<temp2){
    			 long temp3=temp;
    			 temp=temp2;
    			 temp2=temp3;
    		 }
    			 
    	 }
     }
    
     
     map.writeValue((FILEPATH), personList);
     showBook();
		manage.option();
	}

	public void createNewAddressBook() throws JsonGenerationException, JsonMappingException, IOException, ParseException, java.text.ParseException {
		System.out.println("enter the name of address book");
		String n=u.getString();
		n1=n1+" "+n;
		count+=1;
  System.out.println(n1);
  System.out.println(count);
	manage.option();

  
  }

	/**
	 * 
	 */
	public void openExistAddressBook() {

	}

	/**
	 * 
	 */
	public void saveAddressBook() {

	}

	/**
	 * @throws ParseException
	 * 
	 */
	public void quit() throws ParseException {
			System.exit(0);
	}

	public void showBook() throws JsonGenerationException, JsonMappingException, IOException {
		JSONParser parser = new JSONParser();

		try {
			Object object = parser.parse(new FileReader(FILEPATH));
			JSONObject jsonObject = (JSONObject) object;
			JSONArray personArray = (JSONArray) jsonObject.get("plist");
			for (int i = 0; i < personArray.size(); i++) {
				JSONObject details = (JSONObject) personArray.get(i);
				System.out.println("index : " + i + " " + details);
			}

		} catch (ParseException | IOException e) {
			e.printStackTrace();
		}
	}

}