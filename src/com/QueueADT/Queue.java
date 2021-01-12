package com.QueueADT;

/**
 * 
 * @author Jay Agullano
 * @since January 12, 2020
 * @version 1.0
 * 
 * This is a testing Queue ADT interface, to be implemented as 
 * either an Array or a Linked List.
 *
 */

public interface Queue<E> {
	
	/** Returns the number of elements in the queue */
	int size();
	
	/** Returns false is size is 0, otherwise true */
	boolean isEmpty();
	
	/** Inserts a new element into the rear of the queue */
	void enqueue(E e);
	
	/* Returns the value of the first element */
	E first();
	
	/* Returns the value of the last element */
	E dequeue();
}
