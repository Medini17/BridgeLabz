/**
 * 
 */
package com.bridgelabz.oops;

import java.util.ArrayList;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * 
 */
public class StockPortfolio {
ArrayList<Stock> stockList=new ArrayList<Stock>();
 public ArrayList<Stock> getStockList(){
	return stockList;
 }
 public void setStock(ArrayList<Stock> stockList) {
	 this.stockList=stockList;
 }
}
