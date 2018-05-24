package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 18/05/2018
 * Purpose:
 */
public class Gambling {

		public static void main(String[] args) 
		{	

			Utility u=new Utility();
			System.out.println("enter the stake value");
		 int $Stake = u.inputInteger();
			System.out.println("enter the goal value");

		 int $Goal = u.inputInteger();
			System.out.println("enter the noOfTimes");

		 int noOfTimes = u.inputInteger();

			int bets = 0;        // total number of bets made
			int wins = 0;        // total number of games won

			// repeat number of times
			for (int i=0; i< noOfTimes; i++) 
			{
				int cash = $Stake;
		            
				while (cash > 0 && cash < $Goal)
				{
					bets++;
		        
					if (Math.random() < 0.5) 
						cash++;     // win $1
					else                     
						cash--;     // lose $1
				}
		            if (cash == $Goal) 
		            	wins++;                // to find no. of wins   
			}

			// print results
			System.out.println();
			System.out.println(wins + " wins of " + noOfTimes);
			System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);
			System.out.println("Avg # bets           = " + 1.0 * bets / noOfTimes);
		}
	}
