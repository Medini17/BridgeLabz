
package com.bridgelabz.DataStructure;

import java.util.NoSuchElementException;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * 
 */
class Node {
	protected int data;
	protected Node link;
	public Node() {
		link = null;
		data = 0;
	}

	public Node(int d, Node n) {
		data = d;
		link = n;
	}

	public void setData(int d) {
		data = d;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node n) {
		link = n;
	}

	public int getData() {
		return data;
	}
}

public class CashCounterLogic {
	public Node front, rear;
	public int size;
    public int i;
	public CashCounterLogic() {
		front = null;
		rear = null;
		size = 0;
		i=0;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public int getSize() {
		return size;
	}

	public void insert(int data) {
		int data1=0;
		data1=data1+data;
		Node node = new Node(data, null);
		if (rear == null) {
			front = node;
			rear = node;
		} else {
			rear.setLink(node);
			rear = rear.getLink();
		}
		size++;
	}

	public int remove(int i) {
		if (isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}
		Node ptr = front;
		front = ptr.getLink();
		if (front == null) {
			rear = null;
	
		}
		return  i;
	}

	public int peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Underflow Exception");
		}
		return front.getData();
	}

	public void display() {
		int ptr1 = 0;
		if (size == 0) {
			System.out.print("Empty");
			return;
		}
		Node ptr = front;
		while (ptr != rear.getLink()) {
		
			ptr1 = ptr1+ptr.getData()-i;
			System.out.print("Available Balance = ");
			System.out.println(ptr1);
			ptr = ptr.getLink();
		}
		System.out.println();
	}
}