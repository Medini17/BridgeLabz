/**
 * 
 */
package com.bridgelabz.DesignPatterns;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose: to   create   a   Computer   Factory   that   can   Produce   PC,   Laptop   and  Server   Class 
 * Computers.   As   Shown   in   the   Figure   Below   Create   an   Abstract   Computer  Class   and   PC,   
 * Laptop   and   Server   inherit   from   Computer   and   ComputerFactory   is   able  to create the 
 * corresponding Computer Object on request 
 */
public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc","yamaha","1280*800","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","casio","1900*1000","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}

}

