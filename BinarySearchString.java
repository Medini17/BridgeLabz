package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 21/05/2018
 * Purpose: To search the given string in the given string array.
 */
public class BinarySearchString 
{
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
	
	String[] a1=u.bubbleSortString(a);
	
	System.out.println("enter the key element");
	String k=u.getString();
	String[] ar=u.insertionSort(a);
	
	int ar1=u.binarySearchString(ar,k );
	if(ar1==-1)
	{
		   System.out.println("element is not found");
	}
		else
			System.out.println("element is found" );
	}
}


