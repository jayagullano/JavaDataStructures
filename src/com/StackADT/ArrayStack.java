package com.StackADT;

public class ArrayStack<E> implements Stack<E> {
	
	public static final int CAPACITY = 1000;	//Default array capacity
	private E [] data;							//Generic array used for storage
	private int topIndex = -1;					//Index of the top of stack
	public ArrayStack() { this(CAPACITY); }		
	public ArrayStack(int capacity) {
		data = (E []) new Object[capacity];		//safe cast; compiler may give warning
	}

	/**
	 * Stack-Implemented Methods
	 */
	
	@Override
	public int size() {	
		return topIndex+1; 						//+1 because indices are minus 1
	}

	@Override
	public boolean isEmpty() {					//If you add a value, index begins at 0
		return (topIndex == -1);				//Default index set to -1, meaning empty
	}

	@Override
	public void push(E e) throws IllegalStateException{
		if(size() == data.length) 								//Guarentees less than capacity available
			throw new IllegalStateException("Stack is full");
		data[++topIndex] = e;									//Assign value at pre-incremented index
	}

	@Override
	public E top() {							//If empty, return null, 
		if(isEmpty()) return null;				//otherwise get value at index of top
		return data[topIndex];
	}

	@Override
	public E pop() {							
		if(isEmpty()) return null;				//If empty, return null,
		E answer = data[topIndex];				//otherwise get Element at top of the stack
		data[topIndex] = null;					//assign that popped index as null
		topIndex--;								//decrement the current index of top
		return answer;							//return element
	}

}
