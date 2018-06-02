/**
 * 
 */
package com.bridgelabz.oops;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * 
 */
public class Stock{

	private String stockName;
	private int stockPrice;
	private int stockNumber;
	Utility utility;
	public Stock(String stockName){
		this.stockName=stockName;
		this.stockPrice=stockPrice;
		this.stockNumber=stockNumber;
	}
	
	public Stock(){
	}

	public String getStockName(){
		return stockName;
	}

	public int getStockPrice(){
		return stockPrice;
	}

	public int getStockNumber(){
		return stockNumber;
	}

	public void setStockName(String stockName){
		this.stockName=stockName;
	}

	public void setStockPrice(int stockPrice){
		this.stockPrice=stockPrice;
	}

	public void setStockNumber(int stockNumber){
		this.stockNumber=stockNumber;
	}

	public String toString(){
		return stockName+" "+stockPrice+" "+stockNumber+"  "+(stockPrice*stockNumber)+" "+"\n";

	}
}