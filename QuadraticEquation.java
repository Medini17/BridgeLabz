package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 18/05/2018
 * Purpose:to   find   the   roots   of   the   equation 
 * a*x*x   +   b*x   +   c.  
 * Since   the   equation   is   x*x,   hence   there   are 
 *   2   roots.   The   2   roots   of   the   equation  
 */
public class QuadraticEquation {
	public static double del(double a, double b, double c) {
		double delta1 = b * b - 4 * a * c;
		System.out.println(delta1);
		double x1 = (-b + Math.sqrt(delta1)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta1)) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);
		return delta1;
	}

	public static void main(String args[]) {
		Utility u = new Utility();
		System.out.println("enter the value for a:");
		int a = u.inputInteger();
		System.out.println("enter the value for b:");
		int b = u.inputInteger();
		System.out.println("enter the value for c:");
		int c = u.inputInteger();

		double res = del(a, b, c);

	}

}
