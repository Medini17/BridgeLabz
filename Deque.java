/**
 * 
 */
package com.bridgelabz.DataStructure;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * 
 */
	public class Deque<T extends Comparable<T>> {
		private class Node {
			T data;
			Node next;

			Node(Comparable data2) {
				this.data = (T) data2;
			}
		}

		Node front, rear;
		int size;

		/**
		 * @param data
		 */
		public void addRear(T data) {
			Node node1 = new Node(data);
			if (front == null && rear == null) {
				front = node1;
				rear = node1;
				size++;
				return;
			}
			rear.next = node1;
			rear = node1;
			size++;
		}

		/**
		 * @return
		 */
		public Comparable removeRear() {
			Node temp = front;
			while (temp.next != rear) {
				temp = temp.next;
			}
			rear = temp;
			rear.next = null;
			size--;
			return (Comparable) rear.data;
		}

		/**
		 * @param data
		 */
		public void addFront(Comparable data) {
			Node node1 = new Node(data);
			node1.next = front;
			front = node1;
			size++;
		}

		/**
		 * @return
		 */
		public Comparable removeFront() {
			if (front == null) {
				return "Empty Queue";
			}
			T data = front.data;
			front = front.next;
			if (front == null) {
				rear = null;
			}
			size--;
			return (Comparable) data;
		}

		/**
		 * @return
		 */
		public int size() {
			return size;
		}

		/**
		 * @return
		 */
		public boolean isEmpty() {
			if (size == 0)
				return true;
			return false;
		}

		/**
		 * 
		 */
		public void display() {
			Node temp = front;
			while (temp != null) {
				System.out.println("--->" + temp.data);
				temp = temp.next;
			}
	}
}
	