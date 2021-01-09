package com.Testing;

/**
 * 
 * @author Thumb
 * 
 * This is a class used to practice writing a sorting algorithm.
 * You are meant to implement the sorting algorithm in the lowest
 * amount of time. 
 * 
 * Rules: 
 * 			
 * 		1) You can have all imports, packages, modifiers prewritten.
 * 		2) Time stops once you hit run (regardless of compile speed).
 * 
 * Best Time: 
 * 		
 * 		i) Insertion Sort : 42 s
 *
 */

public class SortingAlgorithmTest {
	
	/**
	 * Insertion Sort Section
	 */
	
	static void ins(int [] arr) {
		for(int i = 1; i < arr.length; i++) {
			int e = arr[i];
			int j = i;
			while(j > 0 && arr[j-1] > e) {
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = e;
		}
	}
	
	

}
