package com.Recursion;

public class LinearRecursion {

	/* This method takes an array and the starting index
	 * and sums all the elements. */
	public static int sumArray(int [] arr, int index) {
		
		if(index == (arr.length - 1)) return arr[index];		//Return last element in array
		return arr[index] + sumArray(arr, index + 1);			//Add current element plus next element
																//using recursion
	}
	
	/* This takes an array, and an index to the beginning and end indices.
	 * It will then swap the values based on the indices. */
	public static void reverseArray(int [] arr, int low, int high) {
		
		if(low < high) { 							//If low is greater than high, or low equals to high
			int temp = arr[low];					//means we've reached the middle, method then ends
			arr[low] = arr[high];
			arr[high] = temp;
			
			reverseArray(arr, low + 1, high - 1);	//recursive call to increment / decrement low and high values
		}
	}
	
	/* This takes a value, raised to the power using recursion*/
	public static int power(int value, int pow) {
		
		if(pow == 1) return value;				//Returns last value to be multiplied
		return value * power(value, pow-1);		//invokes the current value multipled by the next value
												//until 1
	}
	
	/* This displays the fibonacci sequence bounded by n, the amount of numbers to print */
	public static long[] fibonacci(int n) {
		
		if(n <= 1) {
			long [] answer = {n, 0};
			return answer;
		} else {
			long [] temp = fibonacci(n-1);
			long [] answer = {temp[0] + temp[1], temp[0]};
			return answer;
		}
	}
}

