/**
 * 
 */
package com.bridgelabz.DataStructure;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class Prime2d {
	
		public static <T extends Comparable<T>> void main(String[] args) {
			LinkedList[][] array = new LinkedList[11][];
			for (int i = 0; i < 10; i++) {
				array[i] = new LinkedList[100];
				for (int j = 0; j < 100; j++) {
					array[i][j] = new LinkedList();
				}
			}
			for (int i = 0; i < 10; i++) {
				int k = 0;
				for (int j = 100 * i; j < 100 * (i + 1); j++) {
					if (Utility.findPrime(j)) {
						array[i][k].add(j);
						k++;
					}
				}
			}
			for (int i = 0; i < 10; i++) {
				System.out.println("");
				System.out.print(i + " " + "|");
				for (int j = 0; j < 100; j++) {
					array[i][j].display();
				}
			}
		}
	}
