package com.DequeADT;

import com.LinkedLists.DoublyLinkedList;

/**
 * 
 * @author Jay Agullano
 * @since January 13, 2020
 * @version 1.0
 * 
 * This is a testing Queue ADT implementation, where the underlying
 * container is a DoublyLinkedList object used to implement the Deque generic interface.
 *
 */

public class DoublyLinkedListDeque<E> implements Deque<E> {

	private DoublyLinkedList<E> list = new DoublyLinkedList<>();
	
	@Override
	public int size() { return list.size(); }

	@Override
	public boolean isEmpty() { return list.isEmpty(); }

	@Override
	public E first() { return list.first(); }

	@Override
	public E last() { return list.last(); }

	@Override
	public void addFirst(E e) { list.addFirst(e); }

	@Override
	public void addLast(E e) { list.addLast(e); }

	@Override
	public E removeFirst() { return list.removeFirst(); }

	@Override
	public E removeLast() { return list.removeLast(); }

}
