package com.DequeADT;

/**
 * @author Jay Agullano
 * @since January 13, 2020
 * @version 1.0
 * 
 * This is a testing interface for a Deque ADT.
 */

public interface Deque<E> {
	
	/**
	 * Returns the number of elements in the deque.
	 * @return number of elements
	 */
	int size(); 
	
	/**
	 * Returns true is deque contains elements, false 
	 * otherwise
	 * @return true or false
	 */
	boolean isEmpty();
	
	/**
	 * Accesses the first value of the deque
	 * @return E value
	 */
	E first();
	
	/**
	 * Accesses the last value of the deque
	 * @return E value
	 */
	E last();
	
	/**
	 * Adds a new value to the front of the deque
	 * @param e represents the data value
	 */
	void addFirst(E e);
	
	/**
	 * Adds a new value to the last of the deque
	 * @param e represents the data value
	 */
	void addLast(E e);
	
	/**
	 * Removes the first element of the deque
	 * @return value represents the front of deque
	 */
	E removeFirst();
	
	/**
	 * Removes the last element in the deque
	 * @return value represents the end of deque
	 */
	E removeLast();
}
