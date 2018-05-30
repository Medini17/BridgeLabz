/**
 * 
 */
package com.bridgelabz.DataStructure;

import java.util.LinkedList;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class PrimeAnagram {
	public static class isprime {
		static boolean isPrime(int n) {
			int c = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0)
					c++;
			}
			if (c == 2)
				return true;
			else
				return false;
		}

		public static void main(String[] args) {
			LinkedList[][] array = new LinkedList[10][];
			for (int i = 0; i < 10; i++) {
				array[i] = new LinkedList[100];
				for (int j = 0; j < 100; j++) {
					array[i][j] = new LinkedList();
				}
			}
			for (int i = 0; i < 10; i++) {
				int k = 0;
				for (int j = 100 * i; j < 100 * (i + 1); j++) {
					if (isPrime(j)) {
						for (int m = j + 1; m < 100 * (i + 1); m++) {
							if (Utility.anag(("" + j), ("" + m)) == true) {
								if(isPrime(m))
								{
								array[i][k++].push(j);//add for stack implimentation
								System.out.println("[" + j + "," + m + "]");

							}
						}
						}					}
				}

				System.out.println();
			}
		}
	}
}