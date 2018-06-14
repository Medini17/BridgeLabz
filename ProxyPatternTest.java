/**
 * 
 */
package com.bridgelabz.DesignPatterns;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */


public class ProxyPatternTest {

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}