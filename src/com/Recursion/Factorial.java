package com.Recursion;

public class Factorial {

	public static int factorial(int n) {
		if(n == 1) return n;
		return n * factorial(n-1);
	}
	
	public static int factorial2(int n) throws IllegalArgumentException {
		if(n < 0) {
			throw new IllegalArgumentException();
		} else if (n==0) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
}
