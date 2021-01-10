package com.Testing;

/**
 * 
 * @author Thumb
 * 
 * This is a class used to practice writing a doubly linked list class.
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
 * 		i) Node Class : 1m 22s
 * 		ii) Instance Variables : 
 * 		iii) Constructor :
 * 		iv) Accessor :
 * 		v) Wrapper Mutators :
 * 		vi) Private Mutators :
 * 		vii) Entire Class: 5m 49s
 *
 */

public class DoublyLinkedListTest<E> {

	/* Node Class */
	static class Node<E>{
		private E e;
		private Node<E> n;
		private Node<E> p;
		public Node(E e,  Node<E> p, Node<E> n) {
			this.e = e;
			this.p = p;
			this.n = n;
		}
		public E getElement() { return e; }
		public Node<E> getNext() { return n; }
		public Node<E> getPrev() { return p; }
		public void setNext(Node<E> n) {this.n = n;}
		public void setPrev(Node<E> p) { this.p = p; }
		
	}
	
	/* Instance Variables */

	private Node<E> header;
	private Node<E> trailer;
	private int size;
	
	
	
	/* Constructor */
	public DoublyLinkedListTest() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}


	
	/* Accessor */
	public int getSize() {return size; }
	public boolean isEmpty() {return size == 0; }
	public E first() {
		if(isEmpty()) return null;
		return header.getNext().getElement();
	}
	public E last() {
		if(isEmpty()) return null;
		return trailer.getNext().getElement();
	}


	
	/* Wrapper Mutators */
	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}
	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer);
	}
	
	public E removeFirst() {
		return remove(header.getNext());
	}
	
	public E removeLast() {
		return remove(trailer.getPrev());
	}
	


	
	/* Private Mutators */
	
	private void addBetween(E e, Node<E> prev, Node<E> next) {
		Node<E> newest = new Node<>(e, prev, next);
		prev.setNext(newest);
		next.setPrev(newest);
		size++;
	}
	
	private E remove(Node<E> n) {
		Node<E> prev = n.getPrev();
		Node<E> next = n.getNext();
		
		prev.setNext(next);
		next.setPrev(prev);
		size--;
		return n.getElement();
	}
	

}
