package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 18/05/2018
 * Purpose:check whether it is a Leap Year or not.
 */
public class LeapYear {

	public static void main(String[] args) {
		int year;
		Utility utility = new Utility();
		System.out.println("Enter the year: ");
		year = utility.inputInteger();
		boolean result = utility.isLeapYear(year);
		if(result == true)
			System.out.println("It is a leap year");
		else
			System.out.println("It is not a leap year");

	}

}
