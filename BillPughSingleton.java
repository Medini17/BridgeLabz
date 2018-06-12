/**
 * 
 */
package com.bridgelabz.SingletonDesignPattern;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */
public class BillPughSingleton {
    
    private BillPughSingleton(){}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    public static void main(String[] args)
    {
    	System.out.println(SingletonHelper.INSTANCE);
    }
}
