
package com.bridgelabz.task;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * 
 */
public class Node<T> {
	public T data;
	public Node prev;
	public Node next;
	protected Node link;
    public Node top;
	public Node nextNode;
	public Node(T data) {
		this.data = (T) data;
	}

	public Node(T data, Node prev, Node next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public Node(T data, Node link) {
		this.data = data;
		this.link = link;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	public void setLink(Node n) {
		link = n;
	}

	public Node getLink() {
		return link;
	}
}