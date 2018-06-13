/**
 * 
 */
package com.bridgelabz.SingletonDesignPattern;

import java.io.Serializable;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:Handling singleton object using Serialization
 */

public class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    public static void main(String[] args)
    {
    	System.out.println(SingletonHelper.instance);
    }
    
}

