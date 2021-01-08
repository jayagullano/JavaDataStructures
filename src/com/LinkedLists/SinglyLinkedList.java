package com.LinkedLists;

public class SinglyLinkedList<E> implements Cloneable {
	
	/* Node Class */
	private static class Node<E> {
		private E element;
		private Node<E> next;
		
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		
		public E getElement() { return element; }
		public Node<E> getNext() { return next; }
		public void setNext(Node<E> n) { next = n; }
	}
	
	/* SingleLinkedList Fields and Properties */
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	public SinglyLinkedList() {}
	
	//Accessors
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }
	public E first() {
		if(isEmpty()) return null;
		return head.getElement();
	}
	public E last() {
		if(isEmpty()) return null;
		return tail.getElement();
	}
	public void addFirst(E e) {
		head = new Node<>(e, head);
		if(size == 0)
			tail = head;
		size++;
	}
	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		if(isEmpty())
			head = newest;
		else
			tail.setNext(newest);
		tail = newest;
		size++;
	}
	public E removeFirst() {
		if(isEmpty()) return null;
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if(size == 0)
			tail = null;
		return answer;
	}
	
	public boolean equals (Object o) {
		
		if(o == null) return false;						//If the object is null
		if(getClass() != o.getClass()) return false;	//If the object is of a different
														//class type
		
		SinglyLinkedList other = (SinglyLinkedList) o;	//Explicit Cast
		if(size != other.size) return false;			//If the length of the lists are
														//different
		
		Node walkA = this.head;							//Access each
		Node walkB = other.head;						//Node
		
		while(walkA != null) {				
			if(!walkA.getElement().						//Determine if each element
					equals(walkB.getElement())) 		//is equal using object.equals()
					return false;
			
			walkA = walkA.getNext();					//Access the next node 
			walkB = walkB.getNext();					//using getNext()
		}
		return true;									//If all nodes are equal, return true
	}
	
	public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
		
		//always use inherited Object.clone() to create an initial copy
		SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone(); //safe cast
		
		if(size > 0) { 
			other.head = new Node<>(head.getElement(), null);
			Node<E> walk = head.getNext();
			Node<E> otherTail = other.head;
			while(walk != null) {
				Node<E> newest = new Node<>(walk.getElement(), null);
				otherTail.setNext(newest);
				otherTail = newest;
				walk = walk.getNext();
			}
		}
		return other;
	}
	
	public static void main(String [] args) {
		SinglyLinkedList<Integer> obj = new SinglyLinkedList<>();
		obj.addLast(1);
		obj.addLast(2);
		obj.addLast(3);
		
		try {
		SinglyLinkedList<Integer> obj2 = obj.clone();
		
		obj.removeFirst();
		
		System.out.println("Obj has " + obj.size + " elements.");
		System.out.println("Obj2 has " + obj2.size + " elements.");
		
		} catch (CloneNotSupportedException e) {
			System.err.print(e);
		}
	}
	
	
}
