package com.ListADT;

/**
 * 
 * @author Jay Agullano
 * @since January 19, 2020
 * @version 1.0
 * 
 * This is a testing interface for a positional list ADT.
 *
 */

public interface PositionalList<E> {
	
	/**
	 * Returns number of elements in the list.
	 * @return
	 */
	int size();
	
	/**
	 * Tests whether the list is empty
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * Returns the first Position in the list (or null if empty)
	 * @return
	 */
	Position<E> first();
	
	/**
	 * Returns the last Position in the list (or null if empty)
	 * @return
	 */
	Position<E> last();
	
	/**
	 * Returns Position immediately before argument p
	 * @param p
	 * @return
	 * @throws IllegalArgumentException
	 */
	Position<E> before(Position<E> p) 
			throws IllegalArgumentException;
	
	/**
	 * Returns Position immediately after argumnet P
	 * @param p
	 * @return
	 * @throws IllegalArgumentException
	 */
	Position<E> after(Position<E> p) 
			throws IllegalArgumentException;
	
	/**
	 * Inserts element e at the front of the list and returns its new Position
	 * @param e
	 * @return
	 */
	Position<E> addFirst(E e);
	
	/**
	 * Inserts element e at the back of the list and returns its new position
	 * @param e
	 * @return
	 */
	Position<E> addLast(E e);	
	
	/**
	 * Inserts element e right before the position p
	 * @param p
	 * @param e
	 * @return
	 * @throws IllegalArgumentException
	 */
	Position<E> addBefore(Position<E> p, E e) 
			throws IllegalArgumentException;
	
	/**
	 * Inserts element e right after position p
	 * @param p
	 * @param e
	 * @return
	 * @throws IllegalArgumentException
	 */
	Position<E> addAfter(Position<E> p, E e) 
			throws IllegalArgumentException;
	
	/**
	 * Replaces the value at position p with argument,
	 * then returns original value at that position.
	 * @param p
	 * @param e
	 * @return
	 * @throws IllegalArgumentException
	 */
	E set(Position<E> p, E e) 
			throws IllegalArgumentException;
	
	/**
	 * Removes the value at the position p, then returns that 
	 * value.
	 * @param p
	 * @return
	 * @throws IllegalArgumentException
	 */
	E remove(Position<E> p) 
			throws IllegalArgumentException;

}
