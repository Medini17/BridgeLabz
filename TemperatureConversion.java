/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 21/05/2018
 * Purpose:To   the   Util   Class   add     temperaturConversion   static   function,   given 
 * the   temperature  in   fahrenheit   as   input   outputs   the   temperature   in   Celsius
 * or   viceversa using   the  formula Celsius   to  
 * Fahrenheit:       (°C   ×   9/5)   +   32   =   °F Fahrenheit   to  
 *  Celsius:       (°F   −   32)   x   5/9   =   °C 
 */
class TemperatureConversion {
	public static void main(String[] args) {
		Utility u = new Utility();

		System.out.print("Enter the temperature in Fahrenheit: ");
		double fahrenheit = u.inputDouble();
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in Celsius: " + celsius);

		System.out.print("Enter the temperature in Celsius: ");
		double celsius1 = u.inputDouble();
		double fahrenheit1 = (celsius1 * 9 / 5) + 32;
		System.out.println("Temperature in Fahrenheit: " + fahrenheit1);

	}

}
