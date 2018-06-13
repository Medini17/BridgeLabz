/**
 * 
 */
package com.bridgelabz.oops;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * Purpose:To Create   a   JSON   file   having   Inventory   Details   for   Rice,   Pulses   and   Wheats 
 * with   properties   name,   weight,   price   per   kg.
 */

public class DataManagement {

	static int rice_sum = 0;
	static int rice_total = 0;
	static int wheat_sum = 0;
	static int wheat_total = 0;
	static int pulses_sum = 0;
	static int pulses_total = 0;

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("/home/bridgelabz/Documents/datamanagement.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray rice = (JSONArray) jsonObject.get("Rice");
			for (int i = 0; i < rice.size(); i++) {
				JSONObject objrice = (JSONObject) (rice.get(i));
				rice_sum += (Integer.parseInt(objrice.get("weight").toString()))
						* (Integer.parseInt(objrice.get("price").toString()));
				rice_total += (Integer.parseInt(objrice.get("weight").toString()));
			}
			System.out.println(rice);
			System.out.println("total price of the rice = " +rice_sum);
			System.out.println("total weight of the rice = "+rice_total);
			System.out.println();
			
			JSONArray wheat = (JSONArray) jsonObject.get("Wheat");
			for (int i = 0; i < wheat.size(); i++) {
				JSONObject objwheat = (JSONObject) (wheat.get(i));
				wheat_sum += (Integer.parseInt(objwheat.get("weight").toString()))
						* (Integer.parseInt(objwheat.get("price").toString()));
				wheat_total += (Integer.parseInt(objwheat.get("weight").toString()));
				
			}
			System.out.println(wheat);
			System.out.println("total price of the wheat = " +wheat_sum);
			System.out.println("total weight of the rice = " +wheat_total);
			System.out.println();
			JSONArray Pulses = (JSONArray) jsonObject.get("Pulses");
			for (int i = 0; i < Pulses.size(); i++) {
				JSONObject objpulse = (JSONObject) (Pulses.get(i));
				pulses_sum += (Integer.parseInt(objpulse.get("weight").toString()))
						* (Integer.parseInt(objpulse.get("price").toString()));
				pulses_total += (Integer.parseInt(objpulse.get("weight").toString()));
			}
			System.out.println(Pulses);
			System.out.println("total price of the pulses =" +pulses_sum);
			System.out.println("total weight of the pulses =" +pulses_total);
			System.out.println();

		} catch (IOException | org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
	}long getValue(JSONArray array){
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
