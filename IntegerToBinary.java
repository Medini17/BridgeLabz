package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:   inary.java   to   read   an   integer   as   an   Input,   convert   to   Binary  
 *  using   toBinary  function   and   perform   the   following   functions. 
 *  i.   Swap   nibbles   and   find   the   new   number. 
 *  ii.   Find   the   resultant   number   is   the   number   is   a   power   of   2.
 */
public class IntegerToBinary {

	public static int swapNibbles(int x)

	{
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}

	public static void main(String arg[]) {
		Utility u = new Utility();
		int x = u.inputInteger();
		System.out.print(swapNibbles(x));
	}
}
