/**
 * 
 */
package com.bridgelabz.oops;

import java.util.ArrayList;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * 
 */

public class Find 
{
	public ArrayList<Doctor> FindById ( ArrayList<Doctor> al,int did)  //search doctor by id
	{  
		ArrayList<Doctor> temp=new ArrayList<Doctor>();
		
		for(Doctor d:al)
		{
			if(d.getDid()==did)
			{
				temp.add(d);
			}
		}
		return temp;	
	}

	public ArrayList<Doctor> FindByName (ArrayList<Doctor> al, String dn)   //search doctor by name
	{ 
		ArrayList<Doctor> temp=new ArrayList<Doctor>();
		
		for(Doctor d:al)
		{
			if(d.getDname()==dn)
			{
				temp.add(d);
			}
		}
		return temp;
	}

	public ArrayList<Doctor> FindByava (ArrayList<Doctor> al, String as)  //search doctor by availability
	{
		ArrayList<Doctor> temp=new ArrayList<Doctor>();
		
		for(Doctor d:al)
		{
			if(d.getAvail()==as)
			{
				temp.add(d);
			}
		}
			return temp;	
	}

	public ArrayList<Patient> FindById1 (ArrayList<Patient> al1, int fdid1)  //search patients by id
	{
		ArrayList<Patient> temp=new ArrayList<Patient>();

		for(Patient p1:al1)
		{
			if(p1.getPid()==fdid1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}

	public ArrayList<Patient> FindByName1 (ArrayList<Patient> al1, String dn1)  //search patients by name
	{
		ArrayList<Patient> temp=new ArrayList<Patient>();
		
		for(Patient p1:al1)
		{
			if(p1.getPname()==dn1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}

	public ArrayList<Patient> FindByava1 (ArrayList<Patient> al1, String as1)   //search patients by availability
	{	
		ArrayList<Patient> temp=new ArrayList<Patient>();
		
		for(Patient p1:al1)
		{
			if(p1.getMobile()==as1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}
}