
package com.bridgelabz.DataStructure;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class Prime2D1 {
	
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
			int J=100;a=0;
			
			for (int k = a; k <=J; k++) {
				if (isPrime(k)) {
					System.out.print(k + " ");
				}
			 J+=100;a+=100;
			System.out.println();
	
			}
		}
	}


