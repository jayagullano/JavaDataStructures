package com.Testing;

/**
 * 
 * @author Thumb
 * 
 * This is a class used to practice writing a singly linked list class.
 * You are meant to implement the singly linked list class in the lowest
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
 * 		i) Node Class : 1m 22s
 * 		ii) Field Values : 
 * 		iii) Accessors :
 * 		iv) Mutators :
 * 		v) Entire Class : 3m 39s
 *
 */

public class SinglyLinkedListTest<E> {
	
	public static class Node<E>{
		private E e;
		private Node<E> n;
		public Node(E e, Node<E> n) {
			this.e = e;
			this.n = n;
		}
		public E getElement() { return e; }
		public Node<E> getNext() { return n; }
		public void setNext(Node<E> n) { this.n = n; }
	}
	
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	private SinglyLinkedListTest() {}
	
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }
	public E first() {
		if(size==0) return null;
		return head.getElement();
	}
	public E last() {
		if(size==0) return null;
		return tail.getElement();
	}
	
	public void addFirst(E e) {
		head = new Node<>(e, head);
		if(size==0) tail = head;
		size++;
	}
	
	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		if(size==0) head = newest;
		else tail.setNext(newest);
		tail = newest;
		size++;
	}
	
	public E removeFirst() {
		if(size==0) return null;
		E elem = head.getElement();
		head = head.getNext();
		size--;
		if(size==0) tail = null;
		return elem;
	}
}





















