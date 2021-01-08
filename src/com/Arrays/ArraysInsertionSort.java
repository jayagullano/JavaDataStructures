package com.Arrays;

public class ArraysInsertionSort {
	
	public static enum type { ASC, DESC };
	
	/*Insertion Sort Methods*/
	
	/*Precondition: Must provide an array, and the type of order*/
	public static void insertionSort(char [] arr, type tp) {
		
		int len = arr.length;
		
		for(int i = 1; i < len; i++) {
			char cur = arr[i];
			
			int j = i;
			
			if(tp == type.ASC) {
				while(j > 0 && arr[j-1] > cur) {
					arr[j] = arr[j-1];
					j--;
				}
			} else {
				while(j > 0 && arr[j-1] < cur) {
					arr[j] = arr[j-1];
					j--;
				}
			}
			
			arr[j] = cur;
		}
	}

	/*Precondition: Must provide an array, and the type of order*/
	public static void insertionSort(int [] arr, type tp) {
		int len = arr.length;
		
		for(int i = 1; i < len; i++) {
			int cur = arr[i];
			
			int j = i;
			
			if(tp == type.ASC) {
				while(j > 0 && arr[j-1] > cur) {
					arr[j] = arr[j-1];
					j--;
				}
			} else {
				while(j > 0 && arr[j-1] < cur) {
					arr[j] = arr[j-1];
					j--;
				}
			}
			
			arr[j] = cur;
		}
	}
	
	/*Precondition: Must provide an array, and the type of order*/
	public static void insertionSort(double [] arr, type tp) {
		int len = arr.length;
		
		for(int i = 1; i < len; i++) {
			double cur = arr[i];
			
			int j = i;
			
			if(tp == type.ASC) {
				while(j > 0 && arr[j-1] > cur) {
					arr[j] = arr[j-1];
					j--;
				}
			} else {
				while(j > 0 && arr[j-1] < cur) {
					arr[j] = arr[j-1];
					j--;
				}
			}
			
			arr[j] = cur;
		}
	}
	
	
	/*Displays Method*/
	public static void displayArray(char [] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void displayArray(int [] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void displayArray(double [] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main (String [] args) {
		
		//char [] arr = { 'Z', 'E', 'D' };
		
		int [] arr = {1,5,2,8,5,2};
		
		insertionSort(arr, type.ASC);
		displayArray(arr);
		
		System.out.println();
		
		insertionSort(arr, type.DESC);
		displayArray(arr);
		
		
	}
}
