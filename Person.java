/**
 * 
 */
package com.bridgelabz.addressbook;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */

public class Person  
{
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	
	Person()
	{
		
	}

	public Person(String firstName2, String lastName2, String address2, String city2, String state2, String zip2,
			String phone2) 
	{
		this.firstName=firstName2;
		this.lastName=lastName2;
		this.address=address2;
		this.city=city2;
		this.state=state2;
		this.zip=zip2;
		this.phone=phone2;
		
	}
 
	public Person(String address1, String city1, String state1, String zip1, String phone1) 
	{
		this.address = address1;
		this.city = city1;
		this.state = state1;
		this.zip = zip1;
		this.phone = phone1;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getZip() 
	{
		return zip;
	}

	public void setZip(String zip)
	{
		this.zip = zip;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
}
