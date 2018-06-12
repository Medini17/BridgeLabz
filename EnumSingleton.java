/**
 * 
 */
package com.bridgelabz.SingletonDesignPattern;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */
public enum EnumSingleton {


    INSTANCE;
    
    public static void doSomething(){
      int I=9;
    }
    public static void main(String[] args)
    {
    	System.out.println(INSTANCE);
    }
}
