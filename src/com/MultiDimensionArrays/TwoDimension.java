package com.MultiDimensionArrays;

public class TwoDimension {
	
	public static void displayMultiArray(int [][] arr) {
		for (int row = 0; row < 8; row++) {
			for (int column = 0; column < 10; column++)
				System.out.print(arr[row][column] + " ");
			System.out.println();
		}
	}
	
	public static void main( String [] args ) {
		
		int [][] data = new int[8][10];
		
		for (int row = 0; row < 8; row++)
			for (int column = 0; column < 10; column++)
				data[row][column] = row;
		
		displayMultiArray(data);
	}
}
