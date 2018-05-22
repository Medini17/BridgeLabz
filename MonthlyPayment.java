/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class MonthlyPayment {
     
	public static void payment(double P, double Y, double R)
	{
		double n=12*Y;
		double r=R/(12*100);
		double rate=(Math.pow(1+r, -n));
		double payment = ((P*r)/(1-(rate)));
		System.out.println(payment);
		
	}
	public static void main(String[] args)
	 {
	    
		for(int i=0;i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	
			payment(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		
		}
	}
