/**
 * 
 */
package com.bridgelabz.DesignPatterns;

import java.io.IOException;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */


public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws IOException {
                //some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}

}