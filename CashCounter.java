/**
 * 
 */
package com.bridgelabz.DataStructure;

import com.bridgelabz.utility.Utility;
/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class CashCounter {
	public static void main(String args[])
	{ 
		Utility u=new Utility();
		CashCounterLogic q=new CashCounterLogic();
		int ch = 0;
		do
		{ 
			System.out.println();
		   	System.out.println("Welcome to the Banking Cash Counter");
		   	System.out.println("Press 1 for Deposit");
		   	System.out.println("Press 2 for Withdraw");
		   	System.out.println("Press 3 for Number of people in the Queue ");
		   	System.out.println("Press 4 for Exit");
		   	System.out.println();
		   	System.out.println("Enter your choice:");
		   	int choice=u.inputInteger();
		   	switch (choice) 
		   	{
		   	case 1:
			   		System.out.println("Enter the amount you want to Deposit");
			   		q.insert(u.inputInteger()); 
			   		q.display();
			   		break;
		   	case 2:
			   		System.out.println("Enter the amount you want to Withdraw ");
					u.inputInteger();
			   		q.remove();
			   		System.out.println("Your Available Balance is: "); 
			   		q.display();
			   		break;
			case 3:
					int j=q.getSize();
					System.out.println("The Number of People in Queue is: "+j);			
		   	case 4:
			   		System.exit(0);
		   	default: 
			   		System.out.println("You have entered wrong choice");
			   		break;
		   	}
	   	}
		while(ch<5);
	
	}		
}	

