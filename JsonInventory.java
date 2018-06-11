/**
 * 
 */
package com.bridgelabz.oops;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import com.bridgelabz.oops.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * Purpose:
 */
public class JsonInventory {

	InventoryManager invent=new InventoryManager();
	
	void writeData() {
		Scanner scanner = new Scanner(System.in);	//	scanner to get user input
		String[] names = new String[] {"Rice" , "Wheat" , "Pulses"};	//	inventory array
		
		JSONObject finalObject = new JSONObject();	//	json object to write data
		for (String name : names) {	//	getting data for every inventory
			System.out.print("Enter number number of types of " + name + " : ");
			int count = scanner.nextInt();	//	types of every inventory
			JSONArray array = new JSONArray();	//	array to store types
			
			for(int i = 0; i < count; i++) {	//	 object for every type
				JSONObject jsonObject  = new JSONObject();
				System.out.print("Enter name, weight and price: ");
				jsonObject.put("name", scanner.next());
				jsonObject.put("weight", scanner.nextInt());
				jsonObject.put("price", scanner.nextInt());
				array.add(jsonObject);
			}			
			finalObject.put(name , array);
		}
		scanner.close();
		PrintWriter printWriter = null;	//	to write data to the file
		try {
			printWriter = new PrintWriter("/home/bridgelabz/Documents/datamanagement.json");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printWriter.write(finalObject.toJSONString());
		printWriter.close();
	}

	/**
	 * reads data from json file and 
	 * prints inventory value of Rice, Pulses and Wheat
	 */
	void readData() {
		InventoryManager invent=new InventoryManager();

		JSONArray array = new JSONArray();	//	array to get json data from file
		JSONParser parser = new JSONParser();	//	parser to parse data from file
		JSONObject object;	// json object to store every type of inventory
		
		try {
			object = (JSONObject) parser.parse(new FileReader("/home/bridgelabz/Documents/datamanagement.json"));
			array = (JSONArray) object.get("Rice");
			System.out.println("Rice inventory value: " + getValue(array));
			array = (JSONArray) object.get("Pulses");
			System.out.println("Pulses inventory value: " + getValue(array));
			array = (JSONArray) object.get("Wheat");
			System.out.println("Wheat inventory value: " + getValue(array));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param array
	 * @return
	 */
		long getValue(JSONArray array){
			Iterator<?> iterator = array.iterator();	//	iterator to iterate
			long value = 0;	//	inventory value
			while(iterator.hasNext()) {
				JSONObject obj = (JSONObject)iterator.next();
				long weight = (long)obj.get("weight");
				long price = (long)obj.get("price");
				value = value + weight * price;	//	adding value
			}
			return value;
		}
	}

	

