package com.bridgelabz.DesignPatterns;

import com.bridgelabz.DesignPatterns.SocketAdapter;
import com.bridgelabz.DesignPatterns.SocketClassAdapterImpl;
import com.bridgelabz.DesignPatterns.SocketObjectAdapterImpl;
import com.bridgelabz.DesignPatterns.Volt;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:structural   design   pattern   and   its   used   so   that   two  unrelated   interfaces   
 * can   work   together.   The   object   that   joins   these   unrelated   interface  is   called   an  Adapter.   
 * Use   Adapter   design   pattern   to   solve   mobile   charger   which   adapts  to   a   Mobile   battery   needs   
 * 3   volts   to   charge   but   the   normal   socket   produces   either  120V   (US)   or   240V   (India).   So   
 * the   mobile   charger   works   as   an   adapter   between  mobile charging socket and the wall socket. 
 */


public class AdapterPatternTest {

	public static void main(String[] args) {
		
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Object Adapter="+v3.getVolts());
		System.out.println("v12 volts using Object Adapter="+v12.getVolts());
		System.out.println("v120 volts using Object Adapter="+v120.getVolts());
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Class Adapter="+v3.getVolts());
		System.out.println("v12 volts using Class Adapter="+v12.getVolts());
		System.out.println("v120 volts using Class Adapter="+v120.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		case 120: return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
		}
	}
}
