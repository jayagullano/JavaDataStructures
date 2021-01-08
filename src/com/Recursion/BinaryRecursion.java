package com.Recursion;

public class BinaryRecursion {
	
	/* Returns the sum of subarray data[low] through data[high] inclusive */
	public static int binarySum(int [] data, int low, int high) {
		
		if(low > high) return 0;					//Stopping condition 
		else if (low == high) return data[low];		//if there is a middle point, return that value
		else {
			int mid = (low + high) / 2;				//determine middle point
			
			return binarySum(data, low, mid) 		//add all the values from low to the middle point
					+ binarySum(data, mid+1, high);	//and all values from the mid+1 to the high value
		}
	}
}
