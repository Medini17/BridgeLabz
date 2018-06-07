/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:To check given prime number is a palindrome or not.
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
				int res=rev(k);
			    if(k==res) {
			    	System.out.println(res);
			    }
						
			}
		}
	}

	public static int rev(int k) {
		int out=0;
	
		while(k!=0)
		{  int rem=k%10;
		    out=out*10+rem;
			k=k/10;
		}
		return out;
	}
}
		
	

