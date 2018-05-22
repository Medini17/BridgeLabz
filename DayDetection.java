/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;

import javax.lang.model.element.VariableElement;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 22/05/2018
 * Purpose:To   the   Util   Class   add     dayOfWeek   static   function   that   takes  
 *  a   date   as   input   and  prints   the   day   of   the   week   that   date   falls   on
 */
public class DayDetection{
	   public static void months(int d, int m, int y)
	   {
		String[] days= {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 +y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d+x + 31 * m0 / 12) % 7;  
		System.out.println(days[d0]);
	   }
	
	public static void main(String[] args)
	 {
	    
		for(int i=0;i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	
			months(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		
		}
	}
