/**
 * 
 */
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:static   functions   to   return   all   permutation   of  
 *  a   String   using iterative   method   and Recursion   method.   
 *  Check   if   the   arrays   returned   by   two   string   functions   are   equal.
 */
public class Permutations {

	public void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = 0; i <= r; i++) {
				str = Utility.swap(str, l, i);
				permute(str, l + 1, r);
				str = Utility.swap(str, l, i);
			}
		}
	}

	public static void main(String[] args) {
		Utility u = new Utility();
		String str = u.getString();
		int n = str.length();
		Permutations permutation = new Permutations();
		permutation.permute(str, 0, n - 1);
	}

}
