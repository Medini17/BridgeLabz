/**
 * 
 */
package com.bridgelabz.DataStructure;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:To find the number of possible trees
 */
public class BinaryTree {
	
		public static void main(String[] args) {
			Utility u = new Utility();
			System.out.println("enter node");
			int node = u.inputInteger();
			System.out.println("no of binary trees possible are:");
			int trees = (int) Math.pow(2, node) - node;
			System.out.println(trees);
		}
	}
