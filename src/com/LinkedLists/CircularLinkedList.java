package com.LinkedLists;

/**
 * 
 * @author Jay Agullano
 * @since January 12, 2020
 * @version 1.0
 * 
 * This is an implementation of the Circular Linked List, where there
 * is no implicit tracking for the head of the linked list. Instead, the 
 * next value of the list AFTER the tail refers to the head.
 *
 */

public class CircularLinkedList<E> {
	
	/* Static Node Class */
	
	static class Node<E>{
		private E e;
		private Node<E> tail = null;
		public Node(E e, Node<E> tail) {
			this.e = e;
			this.tail = tail;
		}
		public E getElement() { return e; }
		public Node<E> getNext() { return tail; }
		public void setNext(Node<E>n ) { tail = n; }
	}
	
	/* Instance Variables */
	private Node<E> tail = null;
	private int size = 0;
	public CircularLinkedList() {}
	
	/* Accessor Methods */
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }
	public E first() {
		if(isEmpty()) return null;
		return tail.getNext().getElement();
	}
	public E last() {
		if(isEmpty()) return null;
		return tail.getElement();
	}
	
	/* Mutator Methods */
	public void rotate() {
		if(tail != null)
			tail = tail.getNext();
	}
	public void addFirst(E e) {
		if(size == 0) {
			tail = new Node<>(e, null);
			tail.setNext(tail);
		} else {
			Node<E> newest = new Node<>(e, tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}
	public void addLast(E e) {
		addFirst(e);
		tail = tail.getNext();
	}
	public E removeFirst() {
		if(isEmpty()) return null;
		Node<E> head = tail.getNext();
		if(head == tail) tail = null;
		else tail.setNext(head.getNext());
		size--;
		return head.getElement();
	}
}
