package com.ListADT;

/**
 * 
 * @author Jay Agullano
 * @since January 18, 2020
 * @version 1.0
 * 
 * This is an implementation for the List ADT interface.
 *
 */

public class ArrayList<E> implements List<E> {
	
	/**
	 * Instance Variables
	 */
	public static final int CAPACITY = 16;
	private E [] data;
	private int size = 0;
	
	/**
	 * Constructors
	 */
	public ArrayList() { this(CAPACITY); }
	public ArrayList(int capacity) {
		data = (E []) new Object[capacity]; //safe cast
	}

	@Override
	public int size() { return size; }

	@Override
	public boolean isEmpty() { return size == 0; }

	@Override
	public E get(int i) throws IndexOutOfBoundsException { 
		checkIndex(i, size);
		return data[i];
	}

	@Override
	public E set(int i, E e) throws IndexOutOfBoundsException { 
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	@Override
	public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException {
		checkIndex(i, size + 1);
		if(size==data.length) throw new IllegalStateException("Array is full");
		for(int k = size - 1; k >= i; k--)
			data[k+1] = data[k];
		data[i] = e;
		size++;
		
	}

	@Override
	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for(int k = i; k < size - 1; k++)
			data[k] = data[k+1];
		data[size-1] = null;
		size--;
		return temp;
	}
	
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if(i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}
	
	

}
