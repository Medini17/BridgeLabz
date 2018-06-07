/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * Purpose:
 */
public class PrimeAnagramPalindrome {


	public static void main(String[] args) {
		
		Utility utility = new Utility();	//	utility object
		//	prime numbers array between 0 and 1000
		String[] primeNumbers = utility.prime(1000);
		
		System.out.println("Anagram and prime numbers are:");
		//	prints prime numbers that are anagrams
		for(int i = 0; i < primeNumbers.length; i++) {
			for(int j = i + 1; j < primeNumbers.length; j++) {
				if(utility.anag(primeNumbers[i], primeNumbers[j])) {
					System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
				}
			}
		}

		System.out.println("\nPalindrome and prime numbers are:");
		//	prints prime numbers that are palindrome
		for(int i = 0; i < primeNumbers.length; i++) {
			if(utility.palindrome(primeNumbers[i])) {
				System.out.println(primeNumbers[i]);
			}
		}

	}
}

