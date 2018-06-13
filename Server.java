/**
 * 
 */
package com.bridgelabz.DesignPatterns;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * 
 */

public class Server extends Computer {

	private String keyboard;
	private String display;
	private String cpu;
	
	public Server(String keyboard, String display, String cpu){
		this.keyboard=keyboard;
		this.display=display;
		this.cpu=cpu;
	}
	@Override
	public String getKEYBOARD() {
		return this.keyboard;
	}

	@Override
	public String getDISPLAY() {
		return this.display;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}