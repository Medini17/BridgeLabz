package com.bridgelabz.functionalprograms;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class WindChill {
	public static double windchill(int t, int v) 
	{
		if(t<=50&&v<=120&&v>3)
		{
	        double w = 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
	        System.out.println(w);
		}
		else 
			System.out.println("invalid");
		return 1.0;
	}
	public static void main(String[] args)
	{
	    
		for(int i=0;i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	
			windchill(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
		}
	}

  
