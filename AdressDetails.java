/**
 * 
 */
package com.bridgelabz.oops;

import org.json.simple.JSONObject;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * Purpose:
 */
public class AdressDetails {

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phoneNumber;
	
   public AdressDetails(String firstName, String lastName, String address, String city, String state,
			String zip, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject toJsonObject() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("First Name", firstName);
		jsonObject.put("Last Name", lastName);
		jsonObject.put("Address", address);
		jsonObject.put("City", city);
		jsonObject.put("State", state);
		jsonObject.put("Zip", zip);
		jsonObject.put("Phone Number", phoneNumber);
		return jsonObject;
	}
}
