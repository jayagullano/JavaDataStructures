package com.QueueADT;

import com.LinkedLists.CircularLinkedList;

/**
 * 
 * @author Jay Agullano
 * @since January 12, 2020
 * @version 1.0
 * 
 * This is a implementation of the CircularQueue generic type,
 * where the underlying container is a CircularLinkedList object.
 * The implementation of the interface uses the CircularLinkedList class 
 * implemetations in an adapter pattern.
 *
 */

public class CircularLinkedListQueue<E> implements CircularQueue<E> {

	private CircularLinkedList<E> list = new CircularLinkedList<>();
	
	@Override
	public int size() { return list.size(); }

	@Override
	public boolean isEmpty() { return list.isEmpty(); }

	@Override
	public void enqueue(E e) { list.addLast(e); }

	@Override
	public E first() { return list.first(); }

	@Override
	public E dequeue() { return list.removeFirst(); }

	@Override
	public void rotate() { list.rotate(); }
}


