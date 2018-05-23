/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;

import java.util.BitSet;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 23/05/2018
 * Purpose:To convert the given decimal value to binary number
 */
public class DecimalTobinary 
{
	
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.println("enter the value in decimal");
		int n=u.inputInteger();
		int res=u.binary(n);
        
     }
}