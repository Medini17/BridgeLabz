/**
 * 
 */
package com.bridgelabz.oops;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * 
 */
public class UserDetails1 {
		private String name;
		private long number;
		private ShareHolding hold;

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name
		 *            the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the number
		 */
		public long getNumber() {
			return number;
		}

		/**
		 * @param number
		 *            the number to set
		 */
		public void setNumber(long number) {
			this.number = number;
		}

		/**
		 * @param hold
		 */
		public void setShareDetails(ShareHolding hold) {
			this.hold=hold;
			
		}

	}

