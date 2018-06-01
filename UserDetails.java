/**
 * 
 */
package com.bridgelabz.task;

/**
 * Created By:Medini P.D
 * Date:- 23/05/2018
 * 
 */

public class UserDetails {
	String firstName;
	String lastName;
	String mobileNo;
	String date;
	
	public void setfname(String firstName)
	{
		this.firstName=firstName;
	}
	public void setlname(String lastName)
	{
		this.lastName=lastName;
	}
	public void setmobileNo(String mobileNo)
	{
		this.mobileNo=mobileNo;
	}
	public void setdate(String date)
	{
		this.date=date;
	}
	public String getfname()
	{
		return firstName;
	}
	public String getlname()
	{
		return lastName;
	}
	public String getmobileNo()
	{
		return mobileNo;
	}
	public String date()
	{
		return date;
	}
}