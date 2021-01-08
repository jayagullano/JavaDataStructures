package com.Recursion;

import java.util.logging.Logger;

public class BinarySearch {
	
	private static final Logger log = Logger.getLogger(BinarySearch.class.getName());

	/* Returns true if the target value is found in the indicated portion of the data array.
	 * This search only considers the array portion from data[low] to data[high] inclusive */
	public static boolean binarySearch(int [] data, int key, int low, int high) {
		
		if (low > high) return false; 				//Stopping condition
		
		int mid = (low + high) / 2;
		
		log.info("Low: " + low + " High: " + high + " Mid: " + mid);
		
		if(key == data[mid]) {
			return true;
		} else if (key < data[mid]) {
			return binarySearch(data, key, low, mid - 1);
		} else {
			return binarySearch(data, key, mid + 1, high);
		}
	}
}
