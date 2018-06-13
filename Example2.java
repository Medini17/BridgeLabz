/**
 * 
 */
package com.bridgelabz.DataStructure;

/**
 * Created By:Medini P.D
 * Date:- 30/05/2018
 * Purpose: Object creation example
 */

interface Drawable {
	void draw();
}


class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("drawing circle");
	}
}


class Example extends Circle {
public static void main(String args[]){  
Drawable d=new Circle();
d.draw();

Circle a=new Circle();
Circle b=new Example();
//Example c=new Circle();//compile time error
Example e=new Example();

Circle f=(Circle)b;
//Example g=(Example)a;run time excepion
}}

	
		