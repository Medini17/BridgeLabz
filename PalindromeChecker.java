/**
 * 
 */
package com.bridgelabz.DataStructure;

import com.bridgelabz.AlgorithmPrograms.DequeUtility;
import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 28/05/2018
 * Purpose: Program to find the given string is palindrome or not.
 */
public class PalindromeChecker {
	public static void main(String[] args) {
		Utility u = new Utility();
		DequeUtility<Character> utility = new DequeUtility<Character>();
		System.out.println("Enter a String: ");
		String s = u.getString();

		// adding each character to the rear of the deque
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			utility.addRear(c);
		}
		int flag = 0;

		while (utility.size() > 1) {
			if (utility.removeFront() != utility.removeRear()) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
