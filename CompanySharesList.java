/**
 * 
 */
package com.bridgelabz.oops;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * 
 */

public class CompanySharesList {

	Scanner scanner = new Scanner(System.in);
	//	list of company shares object
	MyLinkedList<CompanyShares> list = new MyLinkedList<CompanyShares>();
	
	public static void main(String[] args) {
		//object
		CompanySharesList shareListObject = new CompanySharesList();
		shareListObject.start();
	}

	/**	asks user if wants to add or remove stocks **/
	void start() { 
		System.out.print("Type 'add' to add the stock and 'remove' to remove the stock: ");
		String move = scanner.next();
		
		if(move.equals("add")) {
			add();
			start();
		}
		else if(move.equals("remove")) {
			remove();
			start();
		}
		else {
			print();
			scanner.close();
			return;
		}
	}
	/** Adds stock to the list **/
	void add() {
		String dateTime = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		System.out.print("Enter stock symbol, number of shares and share price: ");
		String symbol = scanner.next();
		int numberOfShares = scanner.nextInt();
		int price = scanner.nextInt();
		CompanyShares stock = new CompanyShares(symbol, numberOfShares, price, dateTime);
		list.add(stock);
	}
	
	/** removes stock from the list**/
	void remove() {
		scanner = new Scanner(System.in);
		System.out.print("Enter stock symbol: ");
		String symbol = scanner.next();
		for(int i = 0; i < list.size(); i++) {
			CompanyShares shareObject;
			if(symbol.equals((shareObject = list.get(i)).getSymbol())) {
				list.remove(shareObject);
				System.out.println("\nRemoved Succesfully...");
				print();
				break;
			}
		}
	}
	
	/** prints stocks list **/
	void print() {
		System.out.println("\nSymbol\tShares\tPrice");
		for(int i = 0; i < list.size(); i++) {
			CompanyShares shareObject = list.get(i);			
			System.out.println(shareObject.getSymbol()+"\t"
				+shareObject.getNumberOfShares()+"\t"+shareObject.getPrice());
		}
		System.out.println();
	}
	
}