package com.QueueADT;

/**
 * 
 * @author Jay Agullano
 * @since January 12, 2020
 * @version 1.0
 * 
 * This is a testing Queue ADT implementation, where the underlying
 * container is an array.
 *
 */

public class ArrayQueue<E> implements Queue<E> {
	
	//Instance Variables
	
	private final static int CAPACITY = 100;
	private E [] data;
	private int frontIndex = 0;
	private int size = 0;
	
	//Constructor
	
	public ArrayQueue() { this(CAPACITY); }
	public ArrayQueue(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	//Methods
	
	@Override
	public int size() { return size; }
	
	@Override
	public boolean isEmpty() { return size == 0; }
	
	@Override
	public void enqueue(E e) throws IllegalStateException { 
		if(size == data.length) throw new IllegalStateException("Queue is full");
		int available = (frontIndex + size) % data.length;
		data[available] = e;
		size++;
	}
	
	@Override
	public E first() {
		if (isEmpty()) return null;
		return data[frontIndex];
	}
	
	@Override
	public E dequeue() {
		if(isEmpty()) return null;
		E answer = data[frontIndex];
		data[frontIndex] = null;
		frontIndex = (frontIndex + 1) % data.length;
		size--;
		return answer;
	}
	
	
	
	

}
