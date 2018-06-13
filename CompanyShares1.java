/**
 * 
 */
package com.bridgelabz.oops;

import java.util.Date;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * Purpose:
 */
public class CompanyShares1 {

	 	private String symbol;
	 	private int numberOfShares;
	 	private Date dateTime;
	 	private double price;
	 	/**
	 	 * @return the dateTime
	 	 */
	 	public Date getDateTime() {
	 		return dateTime;
	 	}

	 	

	 	/**
	 	 * @param dateTime the dateTime to set
	 	 */
	 	public void setDateTime(Date dateTime) {
	 		this.dateTime = dateTime;
	 	}

	 	

	 	public String getSymbol() {
	 		return symbol;
	 	}

	 	public void setSymbol(String symbol) {
	 		this.symbol = symbol;
	 	}

	 	public int getNumberOfShares() {
	 		return numberOfShares;
	 	}

	 	public void setNumberOfShares(int numberOfShares) {
	 		this.numberOfShares = numberOfShares;
	 	}

	 	public double getPrice() {
	 		return price;
	 	}

	 	public void setPrice(double price) {
	 		this.price = price;
	 	}

	 	public double getValue() {
	 		return numberOfShares * price;
	 	}
	 	public String toString() {
	 		return "\nShare Details: \n"+symbol+", "+numberOfShares+", "+price;
	 		
	 	}
	 	
	 	
	 }

