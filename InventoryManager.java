package com.bridgelabz.oops;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryManager {

	public static void main(String[] args)
	{
	JsonInventory inventory = new JsonInventory();	//	class object
	//	get data from user and write to the file
	inventory.writeData();	
	//	read data from the file and calculate the inventory
	inventory.readData();	
	
}

	
}