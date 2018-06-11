package com.bridgelabz.oops;

public class CompanyShares {

	private String symbol;	
	private int numberOfShares;	
	private String dateTime;
	private int price;	
	
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

