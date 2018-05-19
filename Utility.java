package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility 
{   Scanner sc=new Scanner(System.in);


    // To get a String as an input
    public String getString()
    {
    	
    	System.out.println("enter the input");
    	return sc.nextLine();
    	
    }
    
    
    //To get a integer as an input
 public int inputInteger() {
 	System.out.println("enter the input");
	return sc.nextInt();
	
}
 
 
 //To get a double as an input
 public Double inputDouble() {
 	System.out.println("enter the input");
      return sc.nextDouble();
		
	}
 
 //To get a array as an input
 public int[] inputArray() {
	 int n=sc.nextInt();
     int arr[]=new int[n];
	return arr;

 }
  
 //To find the leap year
public boolean isLeapYear(int year) {
	if((year%4 == 0)&&((year%100 == 0) && (year%400 == 0)))
		return true;
	else
		return false;
}

//Take number of random number to generate as input and return array of random number
	public int[] getRandomArray(int number){
		Random randomGenerator = new Random();
		int array[]=new int[number];
		for(int i=0;i<number;i++){
			array[i]=randomGenerator.nextInt();
		}
		return array;
	}
	
	// To swap the given strings
	 public static String swap(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
	 //To find the power of a given number
	 public int power(int n)
	 {
		 System.out.println("Power of 2^"+n+" is: "+(Math.pow(2, n)));
	      System.out.println();
	       return n;  
	 }
	 
	 
}