/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class PrimePalindrome {
	public static boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Utility u = new Utility();
		System.out.println("enter the prime number ranges:");
		int a = u.inputInteger();
		int b = u.inputInteger();
		for (int k = a; k <= b; k++) {
			if (isPrime(k)) {
				String s = String.valueOf(k);
				char[] z = s.toCharArray();
				int m=s.length()-1;
				int i=0;
					{ 
					if (z[i] == z[m]) {
						
						System.out.println(z);
					}
				}
			}
		}
	}
}
