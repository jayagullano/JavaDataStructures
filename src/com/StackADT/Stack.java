package com.StackADT;

/**
 * 
 * @author Jay Agullano
 * @since January 11, 2020
 * @version 1.0
 * 
 * This is a testing Stack ADT
 *
 */

public interface Stack<E> {

	/**
	 * Size Accessor
	 * @return number of elements in stack
	 */
	int size();
	
	/**
	 * Determines if stack is empty
	 * @return true is size <= 0, false otherwise
	 */
	boolean isEmpty();
	
	/**
	 * Adds values to the top of the stack
	 * @param e
	 */
	void push(E e);
	
	/**
	 * Views the current top of the stack
	 * @return Element for the value at the top of the stack
	 */
	E top();
	
	/**
	 * Removes the top of the stack
	 * @return Element for the top of the stack
	 */
	E pop();
	
	
}
