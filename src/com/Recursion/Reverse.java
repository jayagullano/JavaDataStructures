package com.Recursion;

/** This class is to reverse different typed arrays */
public class Reverse {

	public static void reverse(int [] arr, int low, int high) {
		
		if(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			
			reverse(arr, low + 1, high - 1);
		}
	}
	
	public static void reverse(char [] arr, int low, int high) {
		
		if(low < high) {
			char temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			
			reverse(arr, low + 1, high - 1);
		}
	}
}
