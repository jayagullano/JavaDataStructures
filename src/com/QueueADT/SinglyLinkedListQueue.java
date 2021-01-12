package com.QueueADT;

import com.LinkedLists.SinglyLinkedList;

/**
 * 
 * @author Jay Agullano
 * @since January 12, 2020
 * @version 1.0
 * 
 * This is a testing Queue ADT implementation, where the underlying
 * container is an Singly Linked List using the Adapter Pattern.
 *
 */

public class SinglyLinkedListQueue<E> implements Queue<E> {

	private SinglyLinkedList<E> list = new SinglyLinkedList<>();
	public SinglyLinkedListQueue() {}
	
	
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
		
}


