package com.bridgelabz.oops;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * 
 */

public class Doctor 
{
	int did;
	String dname;
	String avail;
	String spec;
	Utility u1;

	//getter and setter methods
	public int getDid() 
	{
		return did;
	}
	public void setDid(int did) 
	{
		this.did = did;
	}
	public String getDname() 
	{
		return dname;
	}
	public void setDname(String dname) 
	{
		this.dname = dname;
	}
	public String getAvail() 
	{
		return avail;
	}
	public void setAvail(String avail) 
	{
		this.avail = avail;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) 
	{
		this.spec = spec;
	}
	//toString method
	public String toString() 
	{
		return "Doctor [did=" + did + ", dname=" + dname + ", avail=" + avail + ", spec=" + spec + "]";
	}
	//to add doctor details
	public void addDoctor()
	{
		u1=new Utility();
		System.out.println("Enter Your Details ...");

		System.out.println("Enter Name: ");
		this.dname=u1.getString();
		System.out.println();

		System.out.println("Enter Id: ");
		this.did=u1.inputInteger();
		System.out.println();
     
		System.out.println("**");
		this.spec=u1.getString();
		System.out.println("Enter Specialization: ");
		this.spec=u1.getString();
		System.out.println();

		System.out.println("Enter Availability (1:AM   2:PM  3:Both) :");
		this.avail=u1.getString();
		System.out.println();
	
	}
}