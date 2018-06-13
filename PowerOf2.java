package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 18/05/2018
 * Purpose:This program takes a command-line argument N and prints a 
 * table of the powers of 2 that are less than or equal to 2^N
 */
public class PowerOf2 {

	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("Enter a number:");
		int n1 = u.inputInteger();
		int res = u.power(n1);
	}
}