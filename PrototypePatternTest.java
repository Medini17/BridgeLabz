/**
 * 
 */
package com.bridgelabz.DesignPatterns;

import java.util.List;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D 
 * Date:- 12/06/2018 
 * Purpose:Prototype pattern is used   when   the   Object   creation   is   a   costly   affair   and
 * requires   a   lot   of   time   and   resources   and   you   have   a   similar   object   already   
 * existing.  Use Prototype Pattern as shown in the Link above to create multiple Employee Object
 */


public class PrototypePatternTest {
     static Utility u=new Utility();
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		System.out.println("enter the names to add to a group");
		list.add(u.getString());
		list.add(u.getString());
		list.add(u.getString());
		list.add(u.getString());

		System.out.println();
		List<String> list1 = empsNew1.getEmpList();
		System.out.println("enter the names to remove from a group");
		
		list1.remove(u.getString());
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("removed List: "+list1);
		System.out.println("empsNew List: "+list);
	}

}