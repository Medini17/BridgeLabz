/**
 * 
 */
package com.bridgelabz.DataStructure;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import com.bridgelabz.task.Node;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose: Method implementation of stack using linkedlist
 */

	public class StackUsingLinkedlist<T> {
		LinkedList link=new LinkedList();
		protected Node top;
		protected int size;

		/* Constructor */
		public StackUsingLinkedlist() {
			top = null;
			size = 0;
		}

		public boolean isEmpty() {
			return top == null;
		}

		/* Function to get the size of the stack */
		public int getSize() {
			return size;
		}

		/* Function to push an element to the stack */
		public void push(T data) {
			Node nptr = new Node(data, null);
			if (top == null)
				top = nptr;
			else {
				nptr.setLink(top);
				top = nptr;
			}
			size++;
		}

		/* Function to pop an element from the stack */
		public T pop() {
			if (isEmpty())
				throw new NoSuchElementException("Underflow Exception");
			Node ptr = top;
			top = ptr.getLink();
			size--;
			return (T) ptr.getData();
		}

		/* Function to check the top element of the stack */
		public int peek() {
			if (isEmpty())
				throw new NoSuchElementException("Underflow Exception");
			return (int) top.getData();
		}

		/* Function to display the status of the stack */
		public void display() {
			System.out.println("Stack = ");
			if (size == 0) {
				System.out.print("Empty");
				return;
			}
			Node ptr = top;
			while (ptr != null) {
				System.out.print(ptr.getData() + " ");
				ptr = ptr.getLink();
			}
			System.out.println();
		}
	}