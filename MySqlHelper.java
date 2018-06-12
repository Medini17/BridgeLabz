/**
 * 
 */
package com.bridgelabz.SingletonDesignPattern;

import java.sql.Connection;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */
public class MySqlHelper {
	
	public static Connection getMySqlDBConnection(){
		//get MySql DB connection using connection parameters
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
	}
}

