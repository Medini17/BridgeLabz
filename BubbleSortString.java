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
public class BubbleSortString 
{
	public static void main(String[] args) 
	{
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
		

			Comparable[] a1=u.bubbleSortString(a);
			
				for(i=0; i<a1.length; i++)
	                   {
		              System.out.print(a1[i]+" "); 
	                   }		

	          }
	}

