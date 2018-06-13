/**
 * 
 */
package com.bridgelabz.DesignPatterns;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose: Program to write abstract mdethods using abstract class 
 */


public abstract class Computer {
	
	public abstract String getKEYBOARD();
	public abstract String getDISPLAY();
	public abstract String getCPU();
	
	@Override
	public String toString(){
		return "KEYBOARD= "+this.getKEYBOARD()+", DISPLAY="+this.getDISPLAY()+", CPU="+this.getCPU();
	}
}
