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
 * 		3) Check your work upon completion, if work is incorrect time is invalid.
 * 
 * Best Time: 
 * 		
 * 		i) Insertion Sort : 37 s
 *
 */

public class SortingAlgorithmTest {
	
	/************************************************
	 * Insertion Sort Section
	 ***********************************************/


	public static void ins(int [] arr) {
		for(int i = 1; i < arr.length; i++) {
			int e = arr[i];
			int j = i;
			while ( j > 0 && arr[j-1] > 0) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = e;
		}
	}
	
	/***********************************************/
	
	public static void main(String [] args) {
		int arr[] = {1,6,3,4,5};
		ins(arr);
		for(int e : arr){
			System.out.println(e);
		}
	}
	
	

}
 