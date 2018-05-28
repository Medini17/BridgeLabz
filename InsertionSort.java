/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 21/05/2018
 * Purpose:
 */
public class InsertionSort {

	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println("enter the value for n");
		int n = u.inputInteger();
		System.out.println("enter the strings");
		String array[] = new String[n];
		System.out.println();
		System.out.println("enter the words to be printed: ");
		Comparable[] array1 = u.insertionSort(array);
		for (int i = 0; i < array1.length; i++) {
			array1[i] = u.getString();
		}
		System.out.print(array1[n]);
	}
}
