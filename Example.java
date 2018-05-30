/**
 * 
 */
package com.bridgelabz.DataStructure;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class Example {

	public static void main(String[] args) {
		int m=10;
		
	}

}
class Example2 extends Example
{
	public static void main(String[] args)
	{
		Example a=new Example();
		System.out.println(a);
		
		Example2 b=new Example2();
		System.out.println(b);
		
		Example c=new Example2();//we can store object of sub class to super class ref
		System.out.println(c);
		

    //	Example2 d=new Example();//we cant store the object of super class to sub class ref
	//	System.out.println(d);
		
		Example e=(Example)b;
		
		Example2 f=(Example2)a;
	}
}