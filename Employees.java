/**
 * 
 */
package com.bridgelabz.DesignPatterns;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D 
 * Date:- 12/06/2018 
 * 
 */

public class Employees implements Cloneable{
   Utility u=new Utility();
	private List<String> empList;
	
	public Employees(){
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list1){
		this.empList=list1;
	}
	public void loadData(){
		//read all employees from database and put into the list
		System.out.println("enter the names");
		empList.add(u.getString());
		empList.add(u.getString());
		empList.add(u.getString());
		empList.add(u.getString());

		System.out.println();
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employees(temp);
	}
	
}