/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 23/05/2018
 * Purpose:static   function     sqrt     to   compute   the   square   root   of   a   nonnegative  
 *  number   c  given   in   the   input   using   Newton's   method: initialize   t   =   c replace   
 *  t   with   the   average   of   c/t   and   t repeat   until   desired   accuracy   reached   using 
 *    condition   Math.abs(t   ­   c/t)   >   epsilon*t where   epsilon   =  1-e­15 ;
 */
     public class Sqrt
          {
	   public static void square(double c)
	          {
		        double epsilon = 1e-15;    
		        double t = c;             

		        
		        while (Math.abs(t - c/t) > epsilon*t) 
		        {
		            t = (c/t + t) / 2.0;
		        }
		       
		        System.out.println(t);
		      }
       public static void main(String[] args)
           {
        	Utility u=new Utility(); 
        	Double c=u.inputDouble();
        	square(c);  
            }
        }