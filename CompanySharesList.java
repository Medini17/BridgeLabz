
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
	MyLinkedList<CompanyShares> list = new MyLinkedList<CompanyShares>();
	
	public static void main(String[] args) {
		CompanySharesList shareListObject = new CompanySharesList();
		shareListObject.start();
	}

	void start() { 
		System.out.println("enter your input");
		System.out.print("1. Adding shares to the company ");
		System.out.println();
		System.out.print("2. removing shares to the company ");
		String move = scanner.next();
		
		if(move.equals("1")) {
			add();
		
		}
		else if(move.equals("2")) {
			remove();
			start();
		}
		else {
			print();
			scanner.close();
			return;
		}
	}
	void add() {
		String dateTime = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		System.out.print("Enter stock symbol, number of shares and share price: ");
		String symbol = scanner.next();
		int numberOfShares = scanner.nextInt();
		int price = scanner.nextInt();
		CompanyShares stock = new CompanyShares(symbol, price, price, symbol);
		list.add(stock);
		System.out.println("\nadded Succesfully...");
		print();
		start();
	}
	
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
				start();
			}
		}
	}
	
	void print() {
		System.out.println("\nsymbol\tShares\tprice");
		for(int i = 0; i < list.size(); i++) {
			CompanyShares shareObject = list.get(i);			
			System.out.println(shareObject.getSymbol()+"\t"
				+shareObject.getNumberOfShares()+"\t"+shareObject.getPrice());
		}
		System.out.println();
	}
	
}