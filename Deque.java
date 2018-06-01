/**
 * 
 */
package com.bridgelabz.task;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class Deque<E> {
	public E data;
	public Deque<E> next;
	public Deque<E> pre;

	public Deque() {
		this.next = null;
		this.pre = null;
	}

	public Deque(E val) {
		this.data = val;
		this.next = null;
		this.pre = null;
	}
}
