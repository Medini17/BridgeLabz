/**
 * 
 */
package com.bridgelabz.oops;

/**
 * Created By:Medini P.D
 * Date:- 02/06/2018
 * Purpose:Method implementation in linked list
 */

public class MyLinkedList<T>{

	MyNode<T> head;	//starting node
	MyNode<T> current;	//last node
	int position;	//position of last node

	/**
	 * initializes linked list and sets head and current to null
	 * sets position to -1 to shoe an empty list 
	 */
	public MyLinkedList(){
		head = null;
		current = null;
		position = -1;
	}

	/**
	 * @param data - data to be added]
	 * adds element to the list at end of the list
	 */
	public void add(T data){
		MyNode<T> node = new MyNode<T>(data);
		if(head == null){
			head = node;
			current = head;
		}
		else{
			current.next = node;
			current = current.next;
		}
		position++;
	}
	
	/**
	 * @param data - data to be removed
	 * removes given element from the list
	 */
	public void remove(T data){
		MyNode<T> tempCurrent = head;
		MyNode<T> tempPrev = null;
		while(!tempCurrent.data.equals(data)){
			tempPrev = tempCurrent;
			tempCurrent = tempCurrent.next;
		}
		if(tempCurrent == head){
			head = head.next;
		}
		else{
			tempPrev.next = tempCurrent.next;
		}
		if(tempCurrent == current){
			current = tempPrev;
		}
		position--;
	}
	
	/**
	 * @param data - elements to be searched in the list
	 * @returns true if the element is in the list else returns false
	 */
	public boolean search(T data){
		return index(data) == -1 ? false : true; 
	}
	
	/**
	 * @returns true if the list is empty else returns false
	 */
	public boolean isEmpty(){
		return position == -1 ? true : false;
	}
	
	
	/**
	 * @returns size(number of elements) of the list
	 */
	public int size(){
		return position + 1;
	}
	
	
	/**
	 * @param data - data to be added
	 * adds data to the end of the list
	 */
	public void append(T data){
		add(data);
	}
	
	
	/**
	 * @param data - element whose position is to be found out
	 * @returns position of the element in the list if it is in the list 
	 * else returns -1
	 */
	public int index(T data){
		if(position == -1){
			return -1;
		}
		MyNode<T> tempCurrent = head;
		int tempPosition = 0;
		
		while(!tempCurrent.data.equals(data)){
			if(tempCurrent == current) {
				return -1;
			}
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		return tempPosition;
	}

	
	/**
	 * @param pos , data- inserts element 'data' at 'pos' position
	 */
	public void insert(int pos , T data){

		if((pos == position+1) || (position == -1)){
			add(data);
		}
		else if(pos == 0){
			MyNode<T> tempNode = head;
			head = new MyNode<T>(data);
			head.next = tempNode;
		}
		else{
			MyNode<T> tempCurrent = head;
			MyNode<T> tempPrev = null;
			int tempPosition = 0;
			while(tempPosition <= pos + 1){
				tempPrev = tempCurrent;
				tempCurrent = tempCurrent.next;
				tempPosition++;
			}
			MyNode<T> newNode = new MyNode<T>(data);
			newNode.next = tempCurrent;
			tempPrev.next = newNode;
		}
		position++;
	}
	
	/**
	 * @param location - pops elements at given location
	 * @returns element popped 
	 */
	public T pop(int location){
		MyNode<T> tempCurrent = head;
		MyNode<T> tempPrev = null;
		int tempPosition = 0;
		position--;
		while(tempPosition != location){
			tempPrev = tempCurrent;
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		if(tempCurrent == head){
			head = head.next;
			return tempCurrent.data;
		}
		else if(tempCurrent == current){
			current = tempPrev;
			tempPrev.next = tempCurrent.next;
			return tempCurrent.data;
		}
		else{
			tempPrev.next = tempCurrent.next;
			return tempCurrent.data;
		}
	}
	
	/**
	 * @return pops and returns last element in the list
	 */
	public T pop(){
		return pop(position);
	}
	
	
	/**
	 * @param location
	 * @returns object of given location
	 */
	public T get(int location) {
		MyNode<T> tempCurrent = head;
		int tempPosition = 0;
		
		while(tempPosition != location){
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		
		return tempCurrent.data;
		
	}
	/**
	 * prints all the elements in the list
	 */
	public void list(){
		MyNode<T> tempCurrent = head;
		while(tempCurrent != null){
			System.out.println(tempCurrent.data);
			tempCurrent = tempCurrent.next;
		}
	}	
}


class MyNode<T>{
	T data;	//data to be stored
	MyNode<T> next;	//reference to the next node
	
	MyNode(T data){
		this.data = data;
		next = null;
	}
}