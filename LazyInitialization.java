/**
 * 
 */
package com.bridgelabz.SingletonDesignPattern;

import java.time.Instant;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */
public class LazyInitialization {

    private static LazyInitialization instance;
    
    private LazyInitialization(){}
    
    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
    public static void main(String[] args)
    {
    	System.out.println(instance);
    }
}

