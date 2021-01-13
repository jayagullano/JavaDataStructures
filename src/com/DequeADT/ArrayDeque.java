package com.DequeADT;

/**
 * 
 * @author Jay Agullano
 * @since January 13, 2020
 * @version 1.0
 * 
 * This is a testing Queue ADT implementation, where the underlying
 * container is a circular array implementing the Deque generic interface.
 * 
 * NOTE: THIS CLASS IS INCOMPLETE
 *
 */

public class ArrayDeque<E> implements Deque<E> {

	//Instance Variables
	private final static int CAPACITY = 100;
	private E [] data;
	private int frontIndex = 0;
	private int backIndex = 0;
	private int size = 0;
	
	//Constructors
	public ArrayDeque() { this(CAPACITY); }
	public ArrayDeque(int capacity) {
		data = (E []) new Object[capacity];
	}
	
	
	@Override
	public int size() { return size; } 

	@Override
	public boolean isEmpty() { return size == 0; }

	@Override
	public E first() { 
		if(size==0) return null;
		return data[frontIndex];
	}

	@Override
	public E last() {
		if(size==0) return null;
		return data[backIndex];
	}

	@Override
	public void addFirst(E e) throws IllegalStateException {
		if(size == data.length) 
			throw new IllegalStateException("Deque is full");
		int value = (frontIndex - 1 + data.length) % data.length; 
		data[value] = e;
		
		size++;
	}

	@Override
	public void addLast(E e) {
		if(size == data.length) throw new IllegalStateException("Deque is full");
		if(backIndex == size - 1)
			backIndex = 0;
		else 
			backIndex++;
		data[backIndex] = e;
		size++;
	}

	@Override
	public E removeFirst() {
		if(size==0) return null;
		E elem = data[frontIndex];
		data[frontIndex] = null;
		size--;
		
		if(size==0) backIndex = 0;
		else frontIndex = (frontIndex + 1) % data.length;
		
		return elem;
	}

	@Override
	public E removeLast() {
		if(size==0) return null;
		E elem = data[backIndex];
		data[backIndex] = null;
		size--;
		
		if(size==0) frontIndex = 0;
		else backIndex = (backIndex - 1) % data.length;
		
		return elem;
	}

}
