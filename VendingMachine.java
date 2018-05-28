package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:There   is   1,   2,   5,   10,   50,   100,   500   and   1000   Rs 
 * Notes   which   can   be returned   by   Vending   Machine.   Write   a   
 * Program   to   calculate   the   minimum   number 
 * of   Notes   as   well   as   the   Notes   to   be   returned   by   the  
 * Vending   Machine   as   a Change 
 */
public class VendingMachine {

	static int i = 0;
	static int total = 0;

	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
	static int money;

	public static int calculate(int money, int[] notes) {

		int rem;
		if (money == 0) {
			return -1;
		} else {
			if (money >= notes[i]) {

				int calNotes = money / notes[i];
				rem = money % notes[i];
				money = rem;
				total += calNotes;
				System.out.println(notes[i] + " Notes are" + calNotes);
			}
			i++;
			return calculate(money, notes);
		}
	}

	public static void main(String[] args) {
		Utility u1 = new Utility();

		System.out.print("Enter the Amount:");
		money = u1.inputInteger();

		VendingMachine.calculate(money, notes);
		System.out.println("Total Number of Notes are :" + total);
	}
}
