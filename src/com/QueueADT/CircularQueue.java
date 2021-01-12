package com.QueueADT;

/**
 * 
 * @author Jay Agullano
 * @since January 12, 2020
 * @version 1.0
 * 
 * This an abstraction for a Circular Linked List queue implementation,
 * that extends from the Queue generic type.
 *
 */

public interface CircularQueue<E> extends Queue<E> {
	
	/**
	 * Rotates the front element of the queue to the back of the queue.
	 * This does nothing if the queue is empty.
	 */
	void rotate();
}


