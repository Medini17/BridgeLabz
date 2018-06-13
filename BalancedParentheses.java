/**
 * 
 */
package com.bridgelabz.DataStructure;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:To find the given expression has balanced parenthesis or not.
 */
public class BalancedParentheses {
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.println("Enter expression: ");
		String exp = u.getString();    
		StackLogic stack = new StackLogic(exp.length());
		System.out.println();
		int len = exp.length();
		for (int i =0; i < len; i++)
		{    
		char ch = exp.charAt(i);

			if (ch =='(' )
			{
			stack.push(i);
			}
				else if (ch ==')')
				{
					try
					{
					long p = (stack.pop() + 1);
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
					}
					catch(Exception e)
					{
					System.out.println("')' at index "+(i+1)+" is unmatched");
					}
				}            
			}
		while (!stack.isEmpty() )
		{
		System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		}                          
    }
 }

