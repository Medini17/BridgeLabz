/**
 * 
 */
package com.bridgelabz.SingletonDesignPattern;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:Singleton object creation using ThreadSafeInitialization.
 */
public class ThreadSafeInitialization {

    private static ThreadSafeInitialization instance;
    
    private ThreadSafeInitialization(){}
    
    public static synchronized ThreadSafeInitialization getInstance(){
        if(instance == null){
            instance = new ThreadSafeInitialization();
        }
        return instance;
    }
    public static void main(String[] args)
    {
    	System.out.println(instance);
    }
}

