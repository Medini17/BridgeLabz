/**
 * 
 */
package com.bridgelabz.DesignPatterns;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */


public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}