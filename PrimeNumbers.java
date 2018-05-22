/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:To find the prime number in given range.
 */
public class PrimeNumbers 
{
	public static boolean isPrime(int i)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
	     		return false;
	    	}
	  	}
	 	return true;
	 }

	public static void main(String[] args) 
	{ 

		Utility u=new Utility();
		System.out.println("enter the prime number ranges:");
		int a=u.inputInteger();
		int b=u.inputInteger();
		for(int k=a;k<=b;k++)
		{  
			if(isPrime(k))
			{
				System.out.print(k+" ");
			}
		}
        System.out.println();
	  }
}
