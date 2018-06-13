/**
 * 
 */
package com.bridgelabz.DataStructure;

/**
 * Created By:Medini P.D
 * Date:- 28/05/2018
 * Purpose: Program to show the function of hashing
 */
public class HashingFunction {

	OrderedList[] order = new OrderedList[11];
	NodeUtility nu = new NodeUtility();

	public HashingFunction() {
		int[] retArray = nu.integerFileReader();

		for (int i = 0; i < retArray.length; i++) {
			int rem = retArray[i] % 11;
			if (order[rem] == null) {
				order[rem] = new OrderedList();
				order[rem].addItem(retArray[i]);
			} else {
				order[rem].addItem(retArray[i]);
			}
		}
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
			if (order[i] != null) {
				order[i].display();
			}
		}
	}

	public static void main(String[] args) {
		HashingFunction hs = new HashingFunction();
	}
}