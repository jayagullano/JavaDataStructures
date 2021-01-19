package com.Testing;

/**
 * 
 * @author Thumb
 * 
 * This is a class used to practice writing a circular linked list class.
 * You are meant to implement the doubly linked list class in the lowest
 * amount of time. 
 * 
 * Rules: 
 * 			
 * 		1) You can have all imports, packages, modifiers prewritten.
 * 		2) Time stops once you hit run (regardless of compile speed).
 * 		3) Check your work upon completion, if work is incorrect time is invalid.
 * 
 * Best Time: 
 * 
 * 		i) Node Class:
 * 		ii) Entire Class:
 *
 */

public class CircularLinkedListTest<E> {
	
	public static class Node<E>{
		private E e;
		private Node<E> tail = null;
		public Node(E e, Node<E> tail) {
			this.e = e;
			this.tail = tail;
		}
		public E getElement() { return e; }
		public Node<E> getNext() { return tail; }
		public void setNext(Node<E> n) { tail = n; }
	}
	
	private Node<E> tail = null;
	private int size = 0;
	private CircularLinkedListTest() {}
	
	public int size () { return size; }
	public boolean isEmpty() { return size==0; }
	public E first() {
		if(size==0) return null;
		return tail.getNext().getElement();
	}
	public E last() {
		if(size==0) return null;
		return tail.getElement();
	}
	
	public void rotate() {
		if(tail != null)
			tail = tail.getNext();
	}
	
	public void addFirst(E e) {
		if(size==0) {
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
		if(size==0) return null;
		Node<E> head = tail.getNext();
		if(head == tail) 
			tail = null;
		else 
			tail.setNext(head.getNext());
		size--;
		return head.getElement();
	}
}
