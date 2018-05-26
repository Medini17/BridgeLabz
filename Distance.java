package com.bridgelabz.functionalprograms;


/**
 * Created By:Medini P.D
 * Date:- 18/05/2018
 * Purpose:takes   two   integer   command­line   arguments   x  
 * and   y   and   prints   the   Euclidean   distance   from   the  
 * point   (x,   y)   to   the   origin   (0,   0).   The  
 * formulae   to   calculate   distance   =   sqrt(x*x   +   y*y). 
 * by  Use   Math.power   function 
 */
public class Distance {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		// parse x- and y-coordinates from command-line arguments
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		// compute distance to (0, 0)
		double dist = Math.sqrt(x * x + y * y);

		// output distance
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	}
}


