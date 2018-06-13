
package com.bridgelabz.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * Purpose:StockAccount.java   implements   a   data   type   that  might   be   used   by   a   
 * financial   institution   to   keep   track   of   customer   information.
 */

	public class StockA {
		static String symbol;
		static int numberOfShares, price;
		static long shares;
		static UserDetails userInfo = new UserDetails();
		static List<CompanyShares1> list = new ArrayList<CompanyShares1>();
		static Scanner scanner = new Scanner(System.in);
		static ObjectMapper map = new ObjectMapper();
		static File FILEPATH = new File(
				"/home/bridgelabz/Documents/StockAccount.json");
		static CompanyShares1 companyShares;

		public static void getUserInfo() throws JsonGenerationException, JsonMappingException, IOException {
			List<UserDetails> list = new ArrayList<UserDetails>();
			System.out.println("enter your name");
			String name = scanner.next();
			userInfo.setName(name);
			System.out.println("give your phone number");
			long number = scanner.nextLong();
			userInfo.setNumber(number);
			list.add(userInfo);

		}

		public StockA(String filename) throws IOException {
			if (FILEPATH.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}

			
		}

		public static void getCompanyShares() throws JsonGenerationException, JsonMappingException, IOException {
			getUserInfo();
			System.out.println("Enter how many shares you want?");
			int value = scanner.nextInt();

			for (int i = 0; i < value; i++) {
				companyShares = new CompanyShares1();
				System.out.println("Enter company symbol");
				symbol = scanner.next();
				companyShares.setSymbol(symbol);
				System.out.println("enter number of shares");
				numberOfShares = scanner.nextInt();
				companyShares.setNumberOfShares(numberOfShares);
				System.out.println("enter price of shares");
				price = scanner.nextInt();
				companyShares.setPrice(price);
				list.add(companyShares);

			}

		}

		/**
		 * @return
		 */
		private static JSONObject toJsonObject() {
			JSONObject obj = new JSONObject();

			obj.put("symbol", symbol);
			obj.put("numberOfShares", numberOfShares);
			obj.put("price", price);
			return obj;
		}

		public static JSONArray toJavaObject() throws FileNotFoundException,
		IOException, ParseException, org.json.simple.parser.ParseException {
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader(FILEPATH));
			JSONArray jarray = (JSONArray) obj;
			for (int i = 0; i < jarray.size(); i++) {
				JSONObject object = (JSONObject) jarray.get(i);
			}
			return jarray;

		}

		public static int search() {
			System.out.println(list);
			System.out.println("Enter symbol to be searched");
			String symbol = scanner.next();
			for (int i = 0; i != list.size(); i++) {
				if (list.get(i).getSymbol().equals(symbol)) {

					return i;
				}
			}
			System.out.println("not found");
			return -1;
		}

		public static void main(String[] args)
				throws JsonGenerationException, JsonMappingException, IOException, ParseException, org.json.simple.parser.ParseException {
			System.out.println("enter the file path where u need to create account");
			String filename = "/home/administrator/Desktop/stock";
			StockA a = new StockA(filename);
			// System.out.println("get user info");
			// getUserInfo();
			// JSONObject object = toJsonObject();
			// map.writeValue(FILEPATH, list);
			System.out.println("get company info");
			getCompanyShares();
			JSONObject object1 = toJsonObject();
			map.writeValue(FILEPATH, list);
			System.out.println("Enter amount ");
			int amount = scanner.nextInt();
			System.out.println("enter symbol");
			String symbol = scanner.next();
			System.out.println("---Enter option---");
			System.out.println("1] Buy share \n2] sell share");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				buy(amount, symbol);
				break;
			case 2:
				sell(amount, symbol);
				break;
			}
		}

		/**
		 * @param amount
		 * @param symbol
		 * @throws ParseException
		 * @throws IOException
		 * @throws FileNotFoundException
		 * @throws org.json.simple.parser.ParseException 
		 */
		private static void sell(int amount, String symbol) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
			int index = search();
			shares = amount / price;
			if (list.get(index).getNumberOfShares() > shares) {
				JSONArray array = toJavaObject();
				JSONObject obj = (JSONObject) array.get(index);
				amount -= shares * (double) obj.get("price");
				shares = (long) obj.get("numberOfShares") - shares;
				System.out.println("total amount after buying shares->" + amount);
				System.out.println("total number of shares are ->" + shares);
			}
		}

		/**
		 * @param amount
		 * @param symbol
		 * @throws ParseException
		 * @throws IOException
		 * @throws FileNotFoundException
		 *             e
		 * @throws org.json.simple.parser.ParseException 
		 */
		private static void buy(int amount, String symbol) throws FileNotFoundException, IOException,
		ParseException, org.json.simple.parser.ParseException {
			int index = search();
			shares = amount / price;
			JSONArray array = toJavaObject();
			JSONObject obj = (JSONObject) array.get(index);
			amount += (double) obj.get("price");
			shares += (long) obj.get("numberOfShares");
			System.out.println("total amount after buying shares->" + amount);
			System.out.println("total number of shares are ->" + shares);
		}

	}
