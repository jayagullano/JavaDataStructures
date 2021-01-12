package com.StackADT;

import com.LinkedLists.SinglyLinkedList;

/**
 * 
 * @author Jay Agullano
 * @since January 11, 2020
 * @version 1.0
 * 
 * This is a testing implementation of the concept: LinkedList Stack ADT
 * 
 * Original Book: Data Structures and Algorithms in Java
 * by: Michael T. Goodrich, Roberto Tamassia, Michale H. Goldwasser
 *
 */

public class SinglyLinkedListStack<E> implements Stack<E> {
	
	private SinglyLinkedList<E> list = new SinglyLinkedList<>();
	public SinglyLinkedListStack(){}

	@Override
	public int size() { return list.size(); }

	@Override
	public boolean isEmpty() { return list.isEmpty(); }

	@Override
	public void push(E e) { list.addFirst(e); }

	@Override
	public E top() { return list.first(); }

	@Override
	public E pop() { return list.removeFirst(); }
}


