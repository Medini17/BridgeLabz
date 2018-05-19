package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose: To replace Username with the given String.
 */
public class ReplaceString {

	public static void main(String[] args) {
		Utility u=new Utility();
		String msg="Hi <<Username>>, How are you?";
		String name = u.getString(); 
		msg=msg.replaceAll("<<Username>>", name);
		System.out.println(msg);
	}

}
