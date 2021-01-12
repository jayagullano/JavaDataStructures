package com.QueueADT;

/**
 * 
 * @author Jay Agullano
 * @since January 12, 2020
 * @version 1.0
 * 
 * This is a class that uses the CircularQueue ADT to return a value after removing
 * other value using a fixed interval for the entire duration of the queue.
 *
 */

public class Josephus<E> {
	
	public static <E> E Josephus (CircularQueue<E> queue, int k) {
		if(queue.isEmpty()) return null;
		while (queue.size() > 1) {
			for(int i = 0; i < k - 1; i++) queue.rotate();
			E e = queue.dequeue();
			System.out.println("    " + e + " is out");
		}
		return queue.dequeue(); //the winner
	}
	
	public static <E> CircularQueue<E> buildQueue(E [] arr){
		CircularQueue<E> queue = new CircularLinkedListQueue<>();
		for(int i = 0; i < arr.length; i++)
			queue.enqueue(arr[i]);
		return queue;
	}
}
