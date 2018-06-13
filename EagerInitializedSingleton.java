/**
 * 
 */
package com.bridgelabz.SingletonDesignPattern;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:Singleton object creation using eagerInitialization
 */
public class EagerInitializedSingleton {
   
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
    public static void main(String[] args)
    { 
    	System.out.println(instance);
    }
}
