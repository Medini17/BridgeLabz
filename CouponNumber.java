package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

/**-----------------------------------------------------------------------------------------------
 * Created By:Medini P.D
 * Date:- 18/05/2018
 * Purpose: Given   N   distinct   Coupon   Numbers,   how   many   random   numbers   do   you
 * need   to   generate   distinct   coupon   number?   This   program   simulates   this   random
 * process.
 *--------------------------------------------------------------------------------------------*/
public class CouponNumber {
	public static void main(String[] args) {
		Utility u = new Utility();
		int a = 0;
		int n = u.inputInteger();

		int noOftimes = 0;
		while (a < n) {
			int max = 10000;
			char[] M = "abcdABCD12347".toCharArray();

			StringBuilder sb = new StringBuilder();

			int random = (int) (Math.random() * max);

			while (random > 0) {
				sb.append(M[random % M.length]);
				random = random / M.length;
				noOftimes++;
			}

			String couponCode = sb.toString();
			a++;

			System.out.println("Coupon Code: " + couponCode);

		}
		System.out.println("no of times taken to genarate required no of coupon codes: " + noOftimes);
	}
}