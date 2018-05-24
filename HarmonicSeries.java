package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 18/05/2018
 * Purpose:
 */
public class HarmonicSeries {

	public static double harmonic(int n)
	{
	  double sum=0.0;
	    if(n!=0)
	  {
	     for(double i=1; i<=n; i++)
	   {
	     sum=sum+(1/i);
	   }
	}
	  return sum;
	  
	}
	public static void main(String[] args)
	{
		Utility u=new Utility();
		System.out.println("enter the input");
	 int n = u.inputInteger();
      double res=harmonic(n);
	  System.out.println("Nth value is=" +res);
	}
	}