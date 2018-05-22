package com.bridgelabz.AlgorithmPrograms;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose: To find the given string is anagram or not.
 */
public class Anagram {
	public static void main(String[] args) {
		
		Utility u=new Utility();
		System.out.println("string1");
		String s1=u.getString();
		System.out.println("string2");
		String s2=u.getString();
		   boolean res=u.anag(s1, s2);
	    if(res==true)
            System.out.println("anagrams");
        else 
            System.out.println("not anagrams");
    }
}