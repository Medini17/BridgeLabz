package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 18/05/2018
 * Purpose:Simulates a gambler who start with $stake and place fair $1 bets until
 * he/she goes broke (i.e. has no money) or reach $goal.
 *  Keeps track of the number of times he/she wins and the number of 
 * bets he/she makes. Run the experiment N times, averages the results,
 * and prints them out.
 */
public class Gambling {

	public static void main(String[] args) {

		Utility u = new Utility();

		System.out.println("enter the stake value");
		int Stake = u.inputInteger();

		System.out.println("enter the goal value");
		int Goal = u.inputInteger();

		System.out.println("enter the noOfTimes");
		int noOfTimes = u.inputInteger();

		int bets = 0;
		int wins = 0;

		// repeat number of times
		for (int i = 0; i < noOfTimes; i++) {
			int cash = Stake;

			while (cash > 0 && cash < Goal) {
				bets++;

				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == Goal)
				wins++; // to find no. of wins
		}

		// print results
		System.out.println();
		System.out.println(wins + " wins of " + noOfTimes);
		System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);
		System.out.println("Avg bets           = " + 1.0 * bets / noOfTimes);
	}
}
