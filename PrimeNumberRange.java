package com.bridgelabz.DataStructure;

import java.io.IOException;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 28/05/2018
 * 
 */
public class PrimeNumberRange {
	boolean isPrime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				c++;
		}
		if (c == 2)
			return true;
		else
			return false;
	}

	public static void main(String args[]) throws IOException {
		PrimeNumberRange ob = new PrimeNumberRange();
		Utility u = new Utility();
		System.out.print("Enter the starting range: ");
		int d = u.inputInteger();
		System.out.print("Enter the ending range: ");
		int g = u.inputInteger();
		System.out.print("Enter the number of rows: ");
		int m = u.inputInteger();
		System.out.print("Enter the number of columns: ");
		int n = u.inputInteger();
		
		int A[][] = new int[m][n];
		int B[] = new int[m * n];

		int i = 0, j;
		int k = d;

		while (i < m*n) {
			if (ob.isPrime(k) == true) 
			{if(k<g)
				B[i] = k;
				i++;
			}
			k++;
		}

		int x = 0;
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				A[i][j] = B[x];
				x++;
			}
		}

		System.out.println("The prime number filled 2d Array is :");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}
}