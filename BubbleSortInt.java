package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 21/05/2018
 * Purpose: To sort the given array using bubble sorting techniques.
 */
public class BubbleSortInt {

	public static void main(String[] args) {
		int i,j,temp;
		Utility u=new Utility();
		int n=u.inputInteger();
		System.out.print("enter the array elements");
		System.out.println();
		int[] a=new int[n];
		 for( i=0; i<a.length; i++)
			{
				a[i]=u.inputInteger();
			}
		
		int[] a1=u.bubbleSort(a);
		
			for(i=0; i<a1.length; i++)
                   {
	              System.out.print(a1[i]+" "); 
                   }		

          }
}
