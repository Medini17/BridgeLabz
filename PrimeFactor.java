package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;
/**
 * Created By:Medini P.D
 * Date:- 18/05/2018
 * Purpose: To find the prime factors for a given number
 */
public class PrimeFactor
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
			System.out.println("Enter the no. to find PrimeFactors:");
			int n=u.inputInteger();
			System.out.println();
			System.out.println("The prime factors for the "+n+" is:");
			System.out.println();
			   
			for(int i=2;i<=n;i++)
			{  
				if(isPrime(i)&& (n%i==0))
				{
					System.out.print(i+" ");
				}
			}
	        System.out.println();
		}	
}