package com.Testing;

import com.DequeADT.*;

public class Main{
	
	public static void main(String[] args) {
		
		Deque<Integer> obj = new DoublyLinkedListDeque<>();
		for(int i = 0; i < 10; i++) {
			obj.addFirst(i);
		}
		
		while(!obj.isEmpty())
			System.out.println(obj.removeLast());
		
		System.out.println("Final Size: " + obj.size());
	}	
}
   