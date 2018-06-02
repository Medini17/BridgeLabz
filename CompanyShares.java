/**
 * 
 */
package com.bridgelabz.oops;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * Purpose:
 */

public class CompanyShares {

	private String symbol;	//symbol of the stock
	private int numberOfShares;	//share count
	private String dateTime;	//date
	private int price;	//price
	
	/** Constructor **/
	public CompanyShares(String symbol , int numberOfShares, int price, String dateTime) {
		this.symbol = symbol;
		this.numberOfShares = numberOfShares;
		this.dateTime = dateTime;
		this.price = price;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public int getNumberOfShares() {
		return numberOfShares;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getDateTime() {
		return dateTime;
	}
	
	public int getValue() {
		return numberOfShares * price;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
}