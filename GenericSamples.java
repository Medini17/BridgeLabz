
package com.bridgelabz.AlgorithmPrograms;



import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 22/05/2018
 * Purpose:To find the maximum of given number using genarics.
 */
public class GenericSamples {

	public static int max(int a, int b, int c) {
		int d;
		return d = (a > b) ? ((a > c) && (a > b)) ? a : c : (b > c) ? b : c;
	}

	// ---------------------------------------------------------------------------------------------------
	public static String max1(String a, String b, String c) {

		return (a.compareTo(b) > 0) ? ((a.compareTo(c) > 0) && (a.compareTo(b) > 0)) ? a : c
				: (b.compareTo(c) > 0) ? b : c;
	}

	// ---------------------------------------------------------------------------------------------------

	public static <T extends Comparable> T max2(T a, T b, T c) {
		return ((a.compareTo(b) > 0) ? ((a.compareTo(c) > 0) && (a.compareTo(b) > 0)) ? a : c
				: (b.compareTo(c) > 0) ? b : c);

	}

	public static void main(String[] args) {

		Utility u = new Utility();

		System.out.println("enter the values for a, b, c");
		String a = u.getString();
		String b = u.getString();
		String c = u.getString();
		String res = max2(a, b, c);
		System.out.println(res);

	}

}
// -------------------------------------------------------------------------------------------------------