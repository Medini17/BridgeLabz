/**
 * 
 */
package com.bridgelabz.DesignPatterns;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * 
 */
public class ComputerFactory {
	  static Utility u=new Utility();

	public static Computer getComputer(String type, String keyboard, String display, String cpu) {
		
		if("PC".equalsIgnoreCase(type)) 
			return new PC(keyboard, display, cpu);
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(keyboard, display, cpu);
		
		return null;
	}
}
