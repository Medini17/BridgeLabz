/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 21/05/2018
 * Purpose: To sort the given string array using bubble sort.
 */
public class BubbleSortString {
	public static void main(String[] args) {
		int i,j;
		String temp;
		Utility u=new Utility();
		int n=u.inputInteger();
		System.out.print("enter the array elements");
		String[] a=new String[n+1];
		 for( i=0; i<a.length; i++)
			{
				a[i]=u.getString();
			}
		 System.out.println("enter the ket string to find");
		String k=u.getString();
		String[] a1=u.bubbleSortString(a);
		int m=u.binarySearchString(a1, k);
		
		if(m==-1)
		{
			System.out.println("String is not found");
		}
		else
		System.out.println("String found");
    }
}
