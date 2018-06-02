package com.bridgelabz.oops;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.task.UserDetails;
import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 2/06/2018
 * Purpose: To Read  the   following   message:   Hello   <<name>>,   We   have   your
 * full name   as   <<full   name>>   in   our   system.   your   contact   number   is  
 * 91­xxxxxxxxxx. Please,let   us   know   in   case   of   any   clarification   Thank   you
 * BridgeLabz   01/01/2016. Using   Regex   to   replace   name,   full   name,   Mobile#,   and
 * Date   with   proper   value. 
 */
public class RegularExpression {
	
		static String string = "Hello <<name>>, We have your full name as <<fullname>> in our"
				+ " system. your contact number is 91­xxxxxxxxxx."
				+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		static String name = "", fullname = "", number = "";

		public static void main(String[] args) {
			Utility u=new Utility();
		
			/* Enter user details */
			name = u.getString();
			System.out.println("Enter your fullname");
			fullname =u.getString();
			System.out.println("Enter your number");
			String number = u.getString();
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
			Date datenew = new Date();
			String date = (String) dateFormat.format(datenew);
			/* Regex patterns */
			String regex = "<<name>>";
			String regex_fullname = "<<fullname>>";
			String regex_number = "xxxxxxxxxx";
			String regex_date = "01/01/2016";
			System.out.println("Enter your name");

			RegularExpression pr = new RegularExpression();
			string = pr.replaceName(string, regex, name);
			string = pr.replaceName(string, regex_fullname, fullname);
			string = pr.replaceName(string, regex_number, number);
			string = pr.replaceName(string, regex_date, date);
			System.out.println(string);
		}

		public String replaceName(String value, String regex, String replace) {
			Pattern pat = Pattern.compile(regex);
			Matcher match = pat.matcher(value);
			return value = match.replaceAll(replace);
		}

	}