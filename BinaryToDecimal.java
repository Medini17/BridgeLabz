/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 23/05/2018
 * Purpose: To convert the given binary number to the decimal
 */
public class BinaryToDecimal {

	public static void main(String[] args) {
		Utility u = new Utility();
		int n = u.inputInteger();
		int k = u.BinaryToDecimal(n);
		System.out.println(k);

	}

}
