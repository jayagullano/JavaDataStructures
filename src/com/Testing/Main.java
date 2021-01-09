package com.Testing;

import java.util.Arrays;

public class Main{
	
	public static void main(String[] args) {
		
		int [] arr = {3,1,2};
		
		SortingAlgorithmTest.ins(arr);
		
		Arrays.stream(arr).forEach(System.out::println);
		
		
	}	
}
   