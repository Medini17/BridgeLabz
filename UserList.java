/**
 * 
 */
package com.bridgelabz.oops;

import java.util.ArrayList;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * 
 */
public class UserList {
	ArrayList<UserDetails> userList = new ArrayList<UserDetails>();

	/**
	 * @return the userList
	 */
	public ArrayList<UserDetails> getUserList() {
		return userList;
	}

	/**
	 * @param userList
	 *            the userList to set
	 */
	public void setUserList(ArrayList<UserDetails> userList) {
	 this.userList=userList;
	}
}