/**
 * 
 */
package com.bridgelabz.oops;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created By:Medini P.D 
 * Date:- 02/06/2018 
 * Purpose: Create   a   JSON   file   having   Inventory   Details   for   Rice,   Pulses   and  
 * Wheats with   properties   name,   weight,   price   per   kg.  And calculating the value of 
 * each inventory.
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
			Object obj = parser.parse(new FileReader("/home/bridgelabz/Documents/datamanagement.jason"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray rice = (JSONArray) jsonObject.get("Rice");
			for (int i = 0; i < rice.size(); i++) {
				JSONObject objrice = (JSONObject) (rice.get(i));
				rice_sum += (Integer.parseInt(objrice.get("Weight in KG").toString()))
						* (Integer.parseInt(objrice.get("Price per KG").toString()));
				rice_total += (Integer.parseInt(objrice.get("Weight in KG").toString()));
			}
			System.out.println(rice);
			System.out.println(rice_sum);
			System.out.println(rice_total);
			
			JSONArray wheat = (JSONArray) jsonObject.get("Wheat");
			for (int i = 0; i < wheat.size(); i++) {
				JSONObject objwheat = (JSONObject) (wheat.get(i));
				wheat_sum += (Integer.parseInt(objwheat.get("Weight in KG").toString()))
						* (Integer.parseInt(objwheat.get("Price per KG").toString()));
				wheat_total += (Integer.parseInt(objwheat.get("Weight in KG").toString()));
			}
			System.out.println(wheat);
			System.out.println(wheat_sum);
			System.out.println(wheat_total);
			JSONArray Pulses = (JSONArray) jsonObject.get("Pulses");
			for (int i = 0; i < Pulses.size(); i++) {
				JSONObject objpulse = (JSONObject) (Pulses.get(i));
				pulses_sum += (Integer.parseInt(objpulse.get("Weight in KG").toString()))
						* (Integer.parseInt(objpulse.get("Price per KG").toString()));
				pulses_total += (Integer.parseInt(objpulse.get("Weight in KG").toString()));
			}
			System.out.println(Pulses);
			System.out.println(pulses_sum);
			System.out.println(pulses_total);

		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

}
