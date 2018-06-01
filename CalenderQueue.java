/**
 * 
 */
package com.bridgelabz.DataStructure;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class CalenderQueue {
	
		static String[] MONTHS = { "", "january", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		static int[] DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		public static void main(String[] args) {
			QueueUsingLinkedlist queue1 = new QueueUsingLinkedlist();
			QueueUsingLinkedlist queue2 = new QueueUsingLinkedlist();
			WeekDays weekDay = new WeekDays();
			for (int i = 0; i < weekDay.day.length; i++) {
				queue1.insert(weekDay.day[i]);
			}
			for (int i = 0; i < weekDay.date.length; i++) {
				queue2.insert(weekDay.date[i]);
			}
			int month = Integer.parseInt(args[0]);
			int year = Integer.parseInt(args[1]);
			if (Utility.isLeapYear(year))
				DAYS[2] = 29;
			System.out.println("      "+ MONTHS[month] + " " + year);
			queue1.display();
			// System.out.println();

			// starting day

			int startingDay = Utility.week(month, (int) queue2.front.data, year);

			// print the calendar
			for (int i = 0; i < startingDay; i++) {
				System.out.print("    ");
			}
			System.out.println();
			for (int i = 1; i <= DAYS[month]; i++) {
				if (i < 10)
					System.out.print("  " + i);
				else
					System.out.print(" " + i);
				if (((i + startingDay) % 7 == 0) || (i == DAYS[month]))
					System.out.println();

			}
		}
	}
