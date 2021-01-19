package com.ListADT;

/**
 * 
 * @author Jay Agullano
 * @since January 18, 2020
 * @version 1.0
 * 
 * This is a testing interface for a generic List ADT. 
 *
 */

public interface List<E> {
	
	/**
	 * Accesses the size of the list.
	 * @return number of elements
	 */
	int size();
	
	/**
	 * Determines if list is empty.
	 * @return true is size = 0, false otherwise
	 */
	boolean isEmpty();
	
	/**
	 * Accessor to value at index
	 * @param i
	 * @return value of that index
	 * @throws IndexOutOfBoundsException
	 */
	E get(int i) throws IndexOutOfBoundsException;
	
	/**
	 * Mutator to a value at an index
	 * @param i
	 * @param e
	 * @return Returns the replaced element
	 * @throws IndexOutOfBoundsException
	 */
	E set(int i, E e) throws IndexOutOfBoundsException;
	
	/**
	 * Inserts new element at index, using new value
	 * @param i
	 * @param e
	 * @throws IndexOutOfBoundsException
	 */
	void add(int i, E e) throws IndexOutOfBoundsException;
	
	/**
	 * Removes value at index
	 * @param i
	 * @return Value at removed index
	 * @throws IndexOutOfBoundsException
	 */
	E remove(int i) throws IndexOutOfBoundsException;
}
