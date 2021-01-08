package com.Testing;

import com.Recursion.BinaryRecursion;

public class Main{
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		
		int value = BinaryRecursion.binarySum(arr, 0, arr.length-1);
		
		System.out.println(value);
	}	
}
