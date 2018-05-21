/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 21/05/2018
 * Purpose: To search the given key input in the given array elements.
 */
public class BinarySearchInt {

	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.println("n value:");
		int n=u.inputInteger();
		System.out.println("enter the array elements");
		System.out.println();
		int[] a=new int[n];
		 for(int i=0; i<a.length; i++)
			{
				a[i]=u.inputInteger();
			}
		
		int[] a1=u.bubbleSort(a);
		
		System.out.println("enter the key element");
		int k=u.inputInteger();
		int[] ar=u.insertionSort(a);
		
		int ar1=u.binarySearch(ar,k );
		if(ar1!=-1)
		{
			   System.out.println("element is found");
		}
			else
				System.out.println("element is not found" );
		}
}

